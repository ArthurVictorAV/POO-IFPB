package Q01;

public class ProcessadorFiscal {
    public String processar(Documento doc) {
        double imposto = doc.calcularImposto();
        String xml = doc.identificador;

        return xml + "|imposto:" + String.format("%.2f", imposto);

    }

}
