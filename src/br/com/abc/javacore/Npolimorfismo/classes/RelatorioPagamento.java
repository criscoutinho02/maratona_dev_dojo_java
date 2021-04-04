package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGenerico(Funcionario f){
        System.out.println("Gerando relatório de pagamento genérico.");
        f.calcularPagamento();
        System.out.println("Nome: "+ f.getNome());
        System.out.println("Salário do mês: "+ f.getSalario());
        if(f instanceof Gerente) {
            System.out.println("Participação nos lucros : " + (((Gerente) f).getPnl()));
        } else if(f instanceof Vendedor){
            System.out.println("Total de Vendas : " + ((Vendedor) f).getTotalVendas());
        }


    }
}
