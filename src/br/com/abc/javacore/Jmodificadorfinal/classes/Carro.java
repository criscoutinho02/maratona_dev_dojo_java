package br.com.abc.javacore.Jmodificadorfinal.classes;

public class Carro {
    public static final double VELOCIDADE_FINAL=250;

    public final Comprador comprador = new Comprador();
    private String nome ;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "comprador=" + comprador +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public final void imprime(){
        System.out.println("Imprimindo um carro");

    }

    public Comprador getComprador() {
        return comprador;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
