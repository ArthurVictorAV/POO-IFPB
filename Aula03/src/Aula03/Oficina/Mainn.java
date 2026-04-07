package Aula03.Oficina;

import java.time.LocalDateTime;

public class Mainn {
    static void main() {
        Cliente cliente1 = new Cliente("João", "8399998888");

        Veiculo veiculo1 = new Veiculo("ABC1234", "Chevrolet Onix", "LEVE", 2010);
        Veiculo veiculo2 = new Veiculo("XYZ2345", "BYD Dolphin","LEVE", 2024);

        Servico servico1 = new Servico("Troca de óleo", 150.00, 1);
        Servico servico2 = new Servico("Fazer o motor", 2500.00, 1);
        Servico servico3 = new Servico("Alinhamento e balanceamento", 250.00, 1);

        Agenda agendamento1 = new Agenda(cliente1, veiculo1);
        agendamento1.addServico(servico1);
        agendamento1.addServico(servico2);
        agendamento1.addServico(servico3);

        Agenda agendamento2 = new AgendamentoUrgente(cliente1, veiculo2, servico1,LocalDateTime.of(2025,02,05,05,05),15);
        agendamento2.addServico(servico2);
        agendamento2.addServico(servico3);

        Agenda agendamento3 = new AgendamentoRetorno(cliente1, veiculo2, servico1, LocalDateTime.of(2025,02,05,05,05));
        agendamento2.addServico(servico2);
        agendamento2.addServico(servico3);

        Oficina oficina = new Oficina();
        oficina.adicionar(agendamento1);
        oficina.adicionar(agendamento2);

        for (Agenda a : oficina.getAgendamentos()) {
            System.out.println(a);
        }

        oficina.gerarRelatorio();
    }
}
