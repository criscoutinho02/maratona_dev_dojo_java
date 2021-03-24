package br.com.abc.javacore.Fmodificadoresestaticos.classes;

public class Carro {

    //velocidade limite deve ser de 240km por hora
    private String nome;
    private double velocidadeMaxima;
    private static double limitadorVelocidadeLimite = 240;


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime(){
        System.out.println("Nome : " + this.nome);
        System.out.println("Velocidade Máxima : " + this.velocidadeMaxima);
        System.out.println("Limitador Velocidade Máxima : " + limitadorVelocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getLimitadorVelocidadeLimite() {
        return limitadorVelocidadeLimite;
    }

    public void setLimitadorVelocidadeLimite(double limitadorVelocidadeLimite) {
        this.limitadorVelocidadeLimite = limitadorVelocidadeLimite;
    }


}
