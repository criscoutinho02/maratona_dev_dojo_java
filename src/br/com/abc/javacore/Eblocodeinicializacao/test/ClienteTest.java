package br.com.abc.javacore.Eblocodeinicializacao.test;

import br.com.abc.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        System.out.println("\nQuantidade de parcelas possíveis");
        for (int parcela : cliente.getParcelas()) {
            System.out.print(parcela+ " ");
        }

    }

}
