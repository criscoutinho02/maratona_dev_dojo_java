package br.com.abc.javacore.test;


import br.com.abc.javacore.Fmodificadoresestaticos.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        System.out.println("\nQuantidade de parcelas possíveis");
//        for (int parcela : c1.getParcelas()) {
//            System.out.print(parcela+ " ");
//        }

        System.out.println("Tamanho: "+ Cliente.getParcelas().length);
        System.out.println("Tamanho: "+ Cliente.getParcelas().length);
        System.out.println("Tamanho: "+ Cliente.getParcelas().length);

    }

}
