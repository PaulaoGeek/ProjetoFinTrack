/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj_fintrack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gamer
 */
public class Transacao {
     private String descricao;
    private double valor;
    private boolean ehreceita;
    private LocalDate data;
    
    public Transacao(String descricao, double valor, boolean ehreceita, LocalDate data){
       this.descricao = descricao;
       this.valor = valor;
       this.ehreceita = ehreceita;
       this.data = data;
    }
    public String getDescr(){
        return descricao;
    }
    public double getValor(){
        return valor;
    }
     public boolean getEhRecei(){
        return ehreceita;
    }
     public LocalDate getData(){
        return data;
    }
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tipo = ehreceita ? "[RECEITA]" : "[DESPESA]";
        return String.format("%s %s - %s: R$ %.2f", data.format(dtf), tipo, descricao, valor);
    }

    boolean isehreceita() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}