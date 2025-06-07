
package com.mycompany.folhadepagamento;

public class PorHora extends Empregado {
    double valorHora;
    int numHora;

    public PorHora(String nome) {
        super(nome);
    }

    public void setValorHora(double vh) {
        this.valorHora = vh;
    }

    public void setNumHora(int nh) {
        this.numHora = nh;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getNumHora() {
        return numHora;
    }

    public double getPay() {
        return valorHora * numHora;
    }

}
