package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {

    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.cpf = "34567";
        professor.matricula = "qwer";
        professor.nome="Cris";
        professor.rg= "987654";

        professor.imprime();
        System.out.println("-----------------------");
        professor.imprime();



    }
}
