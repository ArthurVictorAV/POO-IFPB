package Q01;

public class MDFE extends Documento {

    public MDFE(double valor, String identificador) {
        super(valor, identificador);

    }

    @Override
    public double calcularImposto() {
        return valor * 0.08;
    }

    @Override
    public String gerarXML() {
        return "<mdfe>" + identificador + "</mdfe>";
    }

}
