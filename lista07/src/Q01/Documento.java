package Q01;

public abstract class Documento {
    protected double valor;
    protected String identificador;

    public Documento(double valor, String indentificador) {
        this.valor = valor;
        this.identificador = indentificador;
    }
    public abstract double calcularImposto();

    public abstract String gerarXML();
}