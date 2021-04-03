package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {

    public static void main(String[] args) {

        Gerente g = new Gerente("Maria" , "987298996" , 10000);
        Vendedor v = new Vendedor("Cristina" , "321654987" , 5000 , 8000);

        g.calculaSalario();
        v.calculaSalario();

        g.imprime();
        v.imprime();

        System.out.println(g);
        System.out.println(v);



    }

}
