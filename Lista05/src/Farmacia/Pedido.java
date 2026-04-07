package Farmacia;

public class Pedido {
    private String nome;
    private String data;
    private Formula formula;

    public Pedido(String nome, String data, Formula formula) {
        this.nome = nome;
        this.data = data;
        this.formula = formula;
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pedido(String data, String nome) {
        this.data = data;
        this.nome = nome;
    }


    public String resumo() {
        String texto = "Paciente: " + nome + "\n";
        texto += "Entrega: "+ data + "\n";
        texto += formula.gerarReceituario();
        return texto;
    }
}
