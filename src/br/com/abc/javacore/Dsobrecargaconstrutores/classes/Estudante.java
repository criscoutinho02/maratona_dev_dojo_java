package br.com.abc.javacore.Dsobrecargaconstrutores.classes;

public class Estudante {

    private String nome;
    private String matricula;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }

    public Estudante() {

    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void imprime() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
        if (dataMatricula != null) {
            System.out.println("Data Matrícula: " + dataMatricula);
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
