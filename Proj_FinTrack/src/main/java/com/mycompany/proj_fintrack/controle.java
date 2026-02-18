/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj_fintrack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gamer
 */
public class controle {
     private List<Transacao> transacoes = new ArrayList<>();

    public void adicionarTransacao(Transacao t) {
        transacoes.add(t);
    }

    public void listarTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação encontrada.");
        }else{
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
            }
        }
    }

    public void removerTransacao(int indice) {
        if (indice >= 0 && indice < transacoes.size()) {
            transacoes.remove(indice);
            System.out.println("Transação removida com sucesso!");
        } else {
            System.out.println("Erro: Posição inválida.");
        }
    }

    public double calcularSaldoTotal() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (t.getEhRecei()){
                saldo += t.getValor();
            }
            else{
                saldo -= t.getValor();
            }
        }
        return saldo;
    }
}
