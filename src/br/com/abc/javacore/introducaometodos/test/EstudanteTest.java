package br.com.abc.javacore.introducaometodos.test;


import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("Rocky");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{6.0, 8.0, 3.0});

        estudante.imprime();


    }

}
