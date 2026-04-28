package Q01;

public class NFE extends Documento{

    public NFE(double valor, String identificador) {
        super(valor, identificador);
    }

    @Override
    public double calcularImposto() {
        return valor * 0.18;
    }

    @Override
    public String gerarXML() {
        return "<nfe>" + identificador + "</nfe>";
    }
}
