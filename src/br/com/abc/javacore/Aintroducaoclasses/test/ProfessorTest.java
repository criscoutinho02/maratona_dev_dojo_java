package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Renato";
        professor.cpf = "23456";
        professor.matricula = "ascvbgfd";
        professor.rg = "12345";

        System.out.println("Nome : " + professor.nome);
        System.out.println("CPF : " + professor.cpf);
        System.out.println("Matricula : " + professor.matricula);
        System.out.println("RG : " + professor.rg);


        Professor professor2 = new Professor();
        professor2.nome = "Cris";
        professor2.cpf = "09876";
        professor2.matricula = "poiuyt";
        professor2.rg = "0987654";

        System.out.println("--------- Professor 2 ----------");
        System.out.println("Nome : " + professor2.nome);
        System.out.println("CPF : " + professor2.cpf);
        System.out.println("Matricula : " + professor2.matricula);
        System.out.println("RG : " + professor2.rg);

    }


}
