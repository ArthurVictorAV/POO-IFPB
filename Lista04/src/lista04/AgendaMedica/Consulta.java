package lista04.AgendaMedica;

public class Consulta {
    private int id;
    private String nomePaciente;
    private String nomeMedico;
    private String dataHora;
    private String status;
    private String observacoes;


    public Consulta (int id, String nomePaciente, String nomeMedico,
                     String dataHora, String status){

        if(id <= 0 || nomePaciente == null || nomePaciente.isBlank()
        || nomeMedico == null || nomeMedico.isBlank()
        ||dataHora == null || dataHora.isBlank())
            throw new IllegalArgumentException("ERROOOOUU");

        this.id = id;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dataHora = dataHora;
        this.status = "AGENDADA";
        this.observacoes = "";

    }

    public String getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public void confirmar() {
        if (status.equals("AGENDADA")){
            status = "CONFIRMADA";
        }
    }

    public void cancelar() {
        if (status.equals("CONFIRMADA")){
            status = "CANCELADA";
        }
        if (status.equals("AGENDADA")){
            status = "CANCELADA";
        }
    }

    public void realizar() {
        if (status.equals("CONFIRMADA")){
            status = "REALIZADA";
        }
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}
