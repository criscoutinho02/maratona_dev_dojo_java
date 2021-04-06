package br.com.abc.javacore.Oexception.checkedexception.test;

import br.com.abc.javacore.Oexception.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        String usuario = "Goku";
        String senha = "123";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "111";

        if(!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
