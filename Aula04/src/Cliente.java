public class Cliente {
    public static void main(String[] args) {

        GerenciadorFinanceiro gerenciador = new GerenciadorFinanceiro();

        Pagamento p1 = new PagamentoBoleto();
        Pagamento p2 = new PagamentoCartao();
        Pagamento p3 = new PagamentoPix();

        gerenciador.processarPagamento(p1);
        gerenciador.processarPagamento(p2);
        gerenciador.processarPagamento(p3);
    }
}


class GerenciadorFinanceiro {
    public void processarPagamento(Pagamento p) {
        p.processar();
    }
}
