package br.com.abc.javacore.Fmodificadoresestaticos.classes;

public class Carro {

    //velocidade limite deve ser de 240km por hora
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime() {
        System.out.println("\n");
        System.out.println("Nome : " + this.nome);
        System.out.println("Velocidade Máxima : " + this.velocidadeMaxima);
        System.out.println("Limitador Velocidade Máxima : " + velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
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
        return velocidadeLimite;
    }

    public void setLimitadorVelocidadeLimite(double limitadorVelocidadeLimite) {
        this.velocidadeLimite = limitadorVelocidadeLimite;
    }


}
