
package com.mycompany.folhadepagamento;

public class FolhaDePagamento {
    public static void main(String[] args) {
       
        PorComissao emp1 = new PorComissao("Paulo");
        emp1.setVendas(30000);

        PorHora emp2 = new PorHora("Mercia");
        emp2.setValorHora(40);
        emp2.setNumHora(120);

        PorHoraeComissao emp3 = new PorHoraeComissao("Henrique");
        emp3.setValorHora(40);
        emp3.setNumHora(80);
        emp3.setVendas(5000);

       
            emp1.printPay();
            emp2.printPay();
            emp3.printPay();
        }
    }

   