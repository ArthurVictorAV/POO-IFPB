package Q02;

import java.util.HashMap;
import java.util.Map;

public class ArmazenamentoNuvem implements Armazenamento {
    private Map<String, byte[]> storage = new HashMap<>();

    @Override
    public void gravar(String caminho, byte[] dados) {
        System.out.println("Salvando na nuvem: " + caminho);
    }

    @Override
    public byte[] ler(String caminho) {
        System.out.println("Nuvem - Buscando " + caminho);
        return null;
    }
}
