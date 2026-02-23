/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author alunolab01
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(123, 6630, 5000);
        Conta c2 = new Conta();
        c2.setAgencia(124);
        c2.setNumero(6631);
        c2.creditar(15000);
  
        c1.transferir(c2, 4000);
        
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        
    }
}
