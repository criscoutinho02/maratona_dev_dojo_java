package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

    public static void main(String[] args) {
        abrirArquivo();

    }

    public static void criarArquivo() throws IOException {
        File file = new File("teste.txt");
        try {
            System.out.println(file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo() {
        File file = new File("teste.txt");
        try {
            System.out.println("ABRINDO UM ARQUIVO");
            System.out.println("Executando a leitura do arquivo");
//            throw new Exception("Erro ao ler o arquivo");
//            System.out.println("Escrevendo em um arquivo");
            return "valor";
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        } finally {
            System.out.println("FECHAR O ARQUIVO");

        }
        return null;
    }
}
