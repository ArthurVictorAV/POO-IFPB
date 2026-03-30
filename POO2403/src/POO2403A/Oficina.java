package POO2403A;

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
}

