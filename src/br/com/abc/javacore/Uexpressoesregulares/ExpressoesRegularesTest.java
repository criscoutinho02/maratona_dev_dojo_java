package br.com.abc.javacore.Uexpressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {

        //*******METACARACTERES**********//
        // \d - todos os dígitos
        // \D - tudo que não for dígito
        // \s - espaços em branco
        // \S - caractere não branco
        // \w - caracteres de palavras a- z | A - Z | dígitos | _
        // \W - não for caracteres de palavras a- z | A - Z | dígitos | _
        //[] "[abcABC]" | [a-cA-C]" | "[0-9]"
        //? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // (n, m)  de n ate m
        // ()
        // |
        // $ fim de linha


        int numerohex = 0X100F;
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "zabab1_A";
        String numerosHexasValidacao = "12 0x 0X 0XFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numerosHexasValidacao);

        System.out.println("Texto: " + numerosHexasValidacao);
        System.out.println("Índice: ");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("");
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.println(matcher.start() + "-" + matcher.group());

        }
        System.out.println("");
        System.out.println("Número Hexadecimal: " + numerohex);

    }
}
