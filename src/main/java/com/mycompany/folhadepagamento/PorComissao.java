
package com.mycompany.folhadepagamento;

public class PorComissao extends Empregado implements Comissao {
    private double venda;

    public PorComissao(String nome) {
        super(nome);
       
    }

    public void setVendas(double s) {
        this.venda = s;
    }

    
    public double getPay() {
        return venda * TAXA_COMISSAO;
    }

}
    


