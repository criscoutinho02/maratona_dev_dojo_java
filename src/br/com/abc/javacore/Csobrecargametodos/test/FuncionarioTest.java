package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Rocky Lee",
                "4567890",
                9876.99 ,
                "098765");

        Funcionario func2 = new Funcionario();

//        funcionario.init("Rocky Lee", "4567890", 9876.99 , "098765");
        funcionario.imprime();
        System.out.println("******************Funcionário 2******************8");
        func2.imprime();
    }

}
