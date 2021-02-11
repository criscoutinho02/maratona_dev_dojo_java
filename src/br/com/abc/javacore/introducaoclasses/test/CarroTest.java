package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.placa="XYZ1234";
        carro.modelo="Celta vermelho sem ar e sem direção";
        carro.velocidadeMaxima = 100.0f;

        System.out.println("placa :" + carro.placa);
        System.out.println("modelo : " + carro.modelo);
        System.out.println("velocidade maxima : "+ carro.velocidadeMaxima);


    }

}
