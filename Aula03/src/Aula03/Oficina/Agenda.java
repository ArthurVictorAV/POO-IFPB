package Aula03.Oficina;


import java.util.*;

public class Agenda {
    private Cliente cliente;
    private Veiculo veiculo;
    private List<Servico> servicos;

    public Agenda(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Servico> getServicos() {
        return Collections.unmodifiableList(servicos);
    }

    public void addServico(Servico servico) {
        servicos.add(servico);
    }

    public double custoTotal(){
        double valor = 0;
        for(Servico s : servicos){
            valor += s.getSubTotal();
        }
        if (veiculo.getClassificacao().equals("PESADO")) return valor * 0.30;

        return valor;
    }

    public String verificarTipo(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "\n\tcliente= " + cliente +
                "\n\ttipo= " + verificarTipo() +
                "\n\tserviços= " + servicos.size() +
                "\n\tveículo= " + veiculo +
                "\n\tcusto= "+ custoTotal()+
                "\n}";
    }
}