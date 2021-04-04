package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {

    public static void main(String[] args) {

        Gerente g = new Gerente("Cristina" , 15000 , 8000);
        Vendedor v = new Vendedor("Cristina" , 15000 , 80000);

        RelatorioPagamento relatorios =  new RelatorioPagamento();
        relatorios.relatorioPagamentoGenerico(g);
        System.out.println("#############################");
        relatorios.relatorioPagamentoGenerico(v);
    }
}
