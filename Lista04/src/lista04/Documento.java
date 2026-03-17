package lista04;

public class Documento {
    public String nome;
    public int numeroPaginas;
    public String prioridade;
    public String status;

    public Documento(String nome, int numeroPaginas, String prioridade, String status){

        if (nome == null || nome.isBlank() || numeroPaginas <=0 || prioridade != "NORMAL" || prioridade != "URGENTE")
            throw new IllegalArgumentException();

        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
        this.prioridade = prioridade;
        this.status = status;

    }
}
