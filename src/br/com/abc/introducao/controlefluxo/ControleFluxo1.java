package br.com.abc.introducao.controlefluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {

        int idade =10;
        float salario = 2000;
        boolean c=false;

        String categoria;

        if(idade<15){
            categoria = "infantil";
        }else if(idade>=15 && idade<18){
            categoria = "juvenil";
        }else{
            categoria ="adulto";
        }

        System.out.println(categoria);
    }
}
