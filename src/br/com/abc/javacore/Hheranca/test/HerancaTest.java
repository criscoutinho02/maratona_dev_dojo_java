package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setBairro("Jardim");
        endereco.setRua("Rua sem fim");

        Pessoa p = new Pessoa("Cris");
//        p.setNome("Cristina");
        p.setCpf("1234567890");
        p.setEndereco(endereco);

        p.imprime();

        System.out.println("----------------------------------------Funcionario----------------------------------------");
        Funcionario funcionario =  new Funcionario("Bruninho");
//        funcionario.setNome("Bruno");
        funcionario.setCpf("12345678");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(345678);
        funcionario.imprime();

    }
}
