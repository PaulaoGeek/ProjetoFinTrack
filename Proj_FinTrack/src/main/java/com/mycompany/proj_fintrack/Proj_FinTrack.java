/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proj_fintrack;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author gamer
 */
public class Proj_FinTrack {

    public static void main(String[] args) {
        controle Localizador = new controle();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n ===== FINTRACK - CONTROLE FINANCEIRO =====");
            System.out.println("1. Adicionar Transacao");
            System.out.println("2. Listar Transacaes");
            System.out.println("3. Mostrar Saldo");
            System.out.println("4. Remover Transacao");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(ler.nextLine());

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Descricao: ");
                        String desc = ler.nextLine();
                        System.out.print("Valor: ");
                        double val = Double.parseDouble(ler.nextLine());
                        System.out.print("E receita? (S para sim / N para despesa): ");
                        boolean ehReceita = ler.nextLine().equalsIgnoreCase("S");
                        System.out.print("E mensal? (S/N): ");
                        boolean mensal = ler.nextLine().equalsIgnoreCase("S");

                        if (mensal) Localizador.adicionarTransacao(new TrasacaoMensal(desc, val, ehReceita, LocalDate.now()));
                        else Localizador.adicionarTransacao(new Transacao(desc, val, ehReceita, LocalDate.now()));
                        
                        System.out.println("Adicionado!");
                    }
                    case 2 -> Localizador.listarTransacoes();
                    case 3 -> System.out.printf("Saldo Total: R$ %.2f\n", Localizador.calcularSaldoTotal());
                    case 4 -> {
                        Localizador.listarTransacoes();
                        System.out.print("Numero da transacao para remover: ");
                        int idx = Integer.parseInt(ler.nextLine());
                        Localizador.removerTransacao(idx - 1);
                    }
                    case 5 -> System.out.println("Encerrando...");
                }
            } catch(NumberFormatException e) {
                System.out.println("Erro: Entrada invalida. Tente novamente."+e.getMessage());
            }
        }
        ler.close();
    }
}
