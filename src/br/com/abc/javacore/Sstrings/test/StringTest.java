package br.com.abc.javacore.Sstrings.test;

public class StringTest {

    public static void main(String[] args) {
        
        String nome = "Cristina";
        String sobrenome = new String("Coutinho");

        nome = nome.concat("Da Silva");

        //O que o java faz?
        //1 - variavel de referencia
        //2 - um objeto do tipo string
        //3 - Uma string no pool de string
        String nome3 = new String("Rocky");

        String test = "Goku";
        String test2 = "goku";
        String paraTrim = " Trim ";
        System.out.println(test.charAt(3));
        System.out.println(test.equalsIgnoreCase(test2));
        System.out.println(test.length());
        System.out.println(test.replace("o" , "a"));
        System.out.println(test.toLowerCase());
        System.out.println(test.substring(0,2));
        System.out.println(paraTrim.trim());





        
    }
    
}
