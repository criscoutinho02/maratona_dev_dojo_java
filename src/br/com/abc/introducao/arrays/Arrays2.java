package br.com.abc.introducao.arrays;

public class Arrays2 {

    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Cristina";
        nomes[1] = "Bruno";
        nomes[2] = "Rocky";


        for (int i= 0; i<nomes.length ; i++){
            System.out.println("Nome:" + nomes[i]);
        }

    }
}
