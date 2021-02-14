package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();

        calc.multiplicaDoisNumero(5, 4);
        System.out.println("Divisão");
        System.out.println(calc.divideDoisNumeros(20, 0));
        System.out.println("Impressão divisão");
        calc.imprimeDoisNumerosDivididos(10, 0);


        int[] numeros = new int[]{1, 2, 3, 4, 5};
        System.out.println("Total se varargs");
        calc.somaArray(numeros);
        System.out.println("Total com varargs");
        calc.somaVarArgs(numeros);
        calc.somaVarArgs(1,2,3,4,5);


    }
}
