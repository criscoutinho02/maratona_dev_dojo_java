package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo {

    public static void main(String[] args) {

        double salario = 900;
        double imposto ;

        if(salario<1000){
            imposto = 0.05;
        }else if(salario >=1000 && salario <2000){
            imposto = 0.1;
        }else if (salario>=2000 && salario<4000){
            imposto = 0.15;
        }else {
            imposto = 0.2;
        }
        System.out.println("Total do imposto é: "+ salario*imposto);

    }
}
