package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {

    PESSOA_FISICA(1 , "Pessoa Física"),
    //constant specific class body
    PESSOA_JURIDICA(2 , "Pessoa Jurídica"){
        public String getId(){
            return "A";
        }
    }

    ;

    private int tipo;
    private String nome;

    TipoCliente(int tipo , String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "B";
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }


}
