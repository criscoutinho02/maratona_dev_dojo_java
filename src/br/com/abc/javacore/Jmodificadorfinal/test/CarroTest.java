package br.com.abc.javacore.Jmodificadorfinal.test;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;
import br.com.abc.javacore.Jmodificadorfinal.classes.Comprador;
import br.com.abc.javacore.Jmodificadorfinal.classes.Subaru;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();


        System.out.println(carro.getComprador());

        Subaru subaru = new Subaru();
        subaru.imprime("subaru");
    }
}
