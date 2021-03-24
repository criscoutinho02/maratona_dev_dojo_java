package br.com.abc.javacore.Bintroducaometodos.classes;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas = new double[3];
    private boolean aprovado;


    public void imprime() {
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Média: " + calculaMediaNotas());
        System.out.println("-------------------------");
        System.out.println((calculaMediaNotas() > 6) ? "APROVADO" : "REPROVADO");
    }

    public double calculaMediaNotas() {

        if (notas == null) {
            return 0;
        }

        double soma = 0;

        for (double nota : notas) {
            soma = soma + nota;
        }


        double media = soma / this.notas.length;

        if (media>6){
            setAprovado(true);
        }else{
            setAprovado(false);
        }

        return media;


    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Você não pode fazer isso");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    private void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
