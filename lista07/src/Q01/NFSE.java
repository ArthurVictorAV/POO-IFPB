package Q01;

public class NFSE extends Documento{

    public NFSE(double valor, String identificador) {
        super(valor, identificador);
    }

    @Override
    public double calcularImposto() {
        return valor * 0.05;
    }

    @Override
    public String gerarXML() {
        return "<nfse>" + identificador + "</nfse>";
    }
}
