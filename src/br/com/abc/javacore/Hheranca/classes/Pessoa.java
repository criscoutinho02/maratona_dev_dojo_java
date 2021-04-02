package br.com.abc.javacore.Hheranca.classes;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome, String cpf) {

        System.out.println("Dentro do construtor pessoa");
        this.nome = nome;
        this.cpf = cpf;
    }

    static {
        System.out.println("Bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Bloco de inicialização 1 pessoa");
    }

    {
        System.out.println("Bloco de inicialização 2 pessoa");

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }


    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (this.endereco != null) {
            System.out.println("Rua: " + this.endereco.getRua());
            System.out.println("Bairro: " + this.endereco.getBairro());
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
