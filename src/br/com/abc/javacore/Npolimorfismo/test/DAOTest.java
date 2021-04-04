package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {

        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();

    }
}
