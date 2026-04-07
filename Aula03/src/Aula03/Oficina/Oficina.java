package Aula03.Oficina;

import java.util.*;

public class Oficina {
    private List<Agenda> agendamentos = new ArrayList<>();

    public void adicionar(Agenda a) {
        agendamentos.add(a);
    }

    public List<Agenda> getAgendamentos() {
        return Collections.unmodifiableList(agendamentos);
    }

    public double faturamento(){
        double valor = 0;
        for (Agenda a : agendamentos){
            valor += a.custoTotal();
        }
        return valor;
    }

    public void gerarRelatorio(){
        for (Agenda a : getAgendamentos()){
            System.out.printf("""
                    Cliente: %s
                    Tipo: %s
                    Custo: %s
                    """, a.getCliente().getNome(),
                    a.getClass().getSimpleName(), a.custoTotal());
        }
    }


    @Override
    public String toString() {
        return toString();
    }

}

