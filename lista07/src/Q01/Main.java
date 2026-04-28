package Q01;

public class Main {
    public static void main(String[] args) {

        ProcessadorFiscal processador = new ProcessadorFiscal();

        MDFE meuDoc = new MDFE(1000.0, "DOC-123");
        NFE nfe1 = new NFE(1000, "NF-e 123");

        String resultado1 = processador.processar(nfe1);

        String resultado = processador.processar(meuDoc);

        System.out.println(resultado);
        System.out.println(resultado1);

    }

}
