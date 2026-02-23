/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author alunolab01
 */
public class Conta {
    private double saldo, limite;
    private int agencia, numero;
    
    double getSaldo(){
        return saldo;
    }
    
    void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    int getAgencia(){
        return agencia;
    }
    
    void setNumero(int numero){
        this.numero = numero;
    }
    
    public Conta(){
    
    }
    
    public Conta(int agencia, int numero, double valor){
        this.agencia = agencia;
        this.numero = numero;
        saldo = saldo + valor;
    }
    
    void creditar(double valor){
        saldo = saldo + valor;
    }
    
    void debitar(double valor){
        double saldoTotal;
        saldoTotal = saldo + limite; 
        if (valor <= saldoTotal){
        saldo = saldo - valor;
        }
    }
    
    void transferir(Conta destino,double valor){
        debitar(valor);
        destino.creditar(valor);
        
    }
    
    }
    
   
