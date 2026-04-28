package Q01;

public class CTE extends Documento {

    public CTE(double valor, String identificador) {
        super(valor, identificador);
    }
    @Override
    public double calcularImposto() {
        return valor * 0.12;
    }

    @Override
    public String gerarXML() {
        return "<cte>" + identificador + "</cte>";
    }
}
