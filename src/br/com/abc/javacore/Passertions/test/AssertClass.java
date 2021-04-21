package br.com.abc.javacore.Passertions.test;

public class AssertClass {

    public static void main(String[] args) {
        //calculaSalario(-2000);
        //calcSalario(-2000);
        diasDaSemana(8);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0) : "O Salário deve ser maior que 0";
        //fazer calculo com o salario

    }

    public static void diasDaSemana(int dia) {
        switch (dia) {

            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default:
                assert false;
        }
    }


}
