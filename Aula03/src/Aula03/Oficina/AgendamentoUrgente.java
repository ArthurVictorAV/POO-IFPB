package Aula03.Oficina;

import java.time.LocalDateTime;

public class AgendamentoUrgente extends Agenda {
    private double taxaUrgencia;
    public AgendamentoUrgente(Cliente cliente, Veiculo veiculo,
                              Servico servico, LocalDateTime data,
                              double taxaUrgencia) {
        super(cliente, veiculo);
        this.taxaUrgencia = taxaUrgencia;
    }

    @Override
    public double custoTotal(){
        return super.custoTotal() + taxaUrgencia;
    }
}