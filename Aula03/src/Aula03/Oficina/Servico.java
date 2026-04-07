package Aula03.Oficina;

public class Servico {
    private String nome;
    private double precoBase;
    private int quantidade;

    public Servico(String nome, double precoBase, int quantidade) {
        this.nome = nome;
        this.precoBase = precoBase;
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidad) {
        if (quantidad <= 0) throw new IllegalArgumentException();
        this.quantidade = quantidad;
    }

    public double getSubTotal(){
        return this.precoBase*this.quantidade;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "nome='" + nome + '\'' +
                ", precoBase=" + precoBase +
                '}';
    }
}
