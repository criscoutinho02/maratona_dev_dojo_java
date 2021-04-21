package br.com.abc.javacore.Oexception.checkedexception.test;

import br.com.abc.javacore.Oexception.checkedexception.classes.Funcionario;
import br.com.abc.javacore.Oexception.checkedexception.classes.Pessoa;
import br.com.abc.javacore.Oexception.customexceptions.LoginInvalidoException;

public class SobrescritaComExceptionTest {

    public static void main(String[] args) throws LoginInvalidoException {
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        funcionario.salvar();
    }

}
