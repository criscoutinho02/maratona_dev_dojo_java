package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Cristina Coutinho" , 30);
        Aluno aluno2 = new Aluno("Marcos Andrade" , 30);

        Seminario seminario = new Seminario("Dados na área Financeira");
        Professor prof = new Professor("Abobrinha" , "Data");
        Local local =  new Local("Industrial" ,"Jardim");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(prof);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno , aluno2});

        prof.setSeminarios(new Seminario[]{seminario });

        seminario.print();
        prof.print();





    }
}
