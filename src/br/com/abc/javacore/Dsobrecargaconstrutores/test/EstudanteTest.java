package br.com.abc.javacore.Dsobrecargaconstrutores.test;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {

        Estudante estudante = new Estudante("987298995" , "Cristina" , new double[]{1.2, 10 , 10});
        estudante.imprime();

    }
}
