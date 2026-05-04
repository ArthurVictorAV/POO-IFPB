package Q02;


public class Main {

    static void main(String[] args) {
        Armazenamento nuvem = new ArmazenamentoNuvem();
        Armazenamento cache = new ArmazenamentoComCache(nuvem);

        System.out.println("TESTE DE GRAVAÇÃO");
        byte[] meuArquivo = {1, 0, 1};
        cache.gravar("projeto.zip", meuArquivo);

        System.out.println("\nTESTE DE LEITURA (CACHE)");
        cache.ler("projeto.zip");

        System.out.println("\n TESTE DE LEITURA 2");
        cache.ler("documento_antigo.pdf");
    }
}
