package br.com.abc.javacore.Sstrings.test;

public class StringPerformanceTest {

    public static void main(String[] args) {

        //100000 - 1494ms

        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto string: " + (fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto stringBuilder: " + (fim-inicio) + "ms");


        inicio = System.currentTimeMillis();
        concatStringBufferr(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto stringBuffer: " + (fim-inicio) + "ms");

    }

    private static void concatString(int tam){
        String string = "";
        for (int i= 0 ; i<tam ; i++){
            string +=1;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i= 0 ; i<tam ; i++){
            sb.append(i);
        }
    }

    private static void concatStringBufferr(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for (int i= 0 ; i<tam ; i++){
            sb.append(i);
        }
    }
}
