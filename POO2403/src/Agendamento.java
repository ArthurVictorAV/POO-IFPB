
import java.time.LocalDateTime;


public class Agendamento {
    public String nome;
    public LocalDateTime data;
    public String servico;

    public Agendamento(String nome, LocalDateTime data, String servico){
        this.nome = nome;
        this.data = data;
        this.servico = servico;
    }

    public Agendamento(String nome) {
        this(nome, LocalDateTime.now(), null);
    }

    public Agendamento() {
        this("Não definido");
    }

    public String toString() {
        return nome + " " + servico;
    }


}

