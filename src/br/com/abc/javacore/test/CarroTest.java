package br.com.abc.javacore.test;

import br.com.abc.javacore.Fmodificadoresestaticos.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("bmw", 280);
        Carro c2 = new Carro("audi", 275);
        Carro c3 = new Carro("mercedes", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("------------------------------");

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }


}
