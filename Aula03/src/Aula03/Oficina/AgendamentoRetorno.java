package Aula03.Oficina;


import java.time.LocalDateTime;

public class AgendamentoRetorno extends Agenda {
        public AgendamentoRetorno(Cliente cliente, Veiculo veiculo,
                                  Servico servico, LocalDateTime data) {
            super(cliente, veiculo);

        }

    @Override
    public double custoTotal(){
            double custo = super.custoTotal();
        return custo - (0.15 * custo);
    }
}

