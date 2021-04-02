package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionário. ");
    }

    {
        System.out.println("Dentro do bloco de inicialização 1 funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização 2 funcionario");

    }

    static {
        System.out.println("Dentro do bloco de inicialização estático funcionario");

    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " rebebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
