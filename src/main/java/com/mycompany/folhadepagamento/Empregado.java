
package com.mycompany.folhadepagamento;


public abstract class Empregado {
    final String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public void printPay(){
        System.out.println("Salario de " + nome + ": R$" + getPay());
    }

    public abstract double getPay();
 
}


