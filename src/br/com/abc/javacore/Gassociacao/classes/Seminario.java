package br.com.abc.javacore.Gassociacao.classes;

public class Seminario {

    private String titulo;
    private Professor professor;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print() {
        System.out.println("---------------------------Relatório de Seminários---------------------------");

        System.out.println("Título: " + this.titulo);

        if(this.professor != null) {
            System.out.println("Professor palestrante : " + this.professor.getNome());
        } else {
            System.out.println("Não há professor cadastrado!");
        }

        if (this.local != null) {
            System.out.println("Local : " + this.local.getRua() + ", " + this.local.getBairro());
        } else {
            System.out.println("Não há local para o seminário.");
        }

        if (this.alunos != null && alunos.length != 0) {
            System.out.println("*****Alunos participantes*****");
            for (Aluno aluno : this.alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }

        System.out.println("Não há alunos cadastrados");


    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
