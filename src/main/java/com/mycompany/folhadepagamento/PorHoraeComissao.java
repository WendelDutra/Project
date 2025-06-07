
package com.mycompany.folhadepagamento;

public class PorHoraeComissao extends PorHora implements Comissao {
    double venda;

    public PorHoraeComissao(String nome) {
        super(nome);
        
    }
    
    public void setVendas(double s) {
        this.venda = s;
    }

   
    public double getPay() {
        return (valorHora * numHora) + (venda * TAXA_COMISSAO);
    }


    @Override
    public void printPay() {
        System.out.println("Salario de " + nome + ": R$ " + getPay());
    }

}

