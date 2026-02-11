/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj_fintrack;

import java.time.LocalDate;

/**
 *
 * @author gamer
 */
public class TrasacaoMensal extends Transacao {
    public TrasacaoMensal (String descricao, double valor, boolean ehreceita, LocalDate data){
        super(descricao,valor,ehreceita,data);
    }
    
}
