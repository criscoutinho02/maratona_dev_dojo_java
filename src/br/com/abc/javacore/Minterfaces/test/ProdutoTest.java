package br.com.abc.javacore.Minterfaces.test;

import br.com.abc.javacore.Minterfaces.classes.Produto;

public class ProdutoTest {

    public static void main(String[] args) {
        Produto p = new Produto("Notebook" , 4 , 3000);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
