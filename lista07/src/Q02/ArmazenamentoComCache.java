package Q02;

import java.util.HashMap;
import java.util.Map;

public class ArmazenamentoComCache implements Armazenamento {
    private Map<String, byte[]> cache = new HashMap<>();
    private Armazenamento destinoReal;

    public ArmazenamentoComCache(Armazenamento destinoReal) {
        this.destinoReal = destinoReal;
    }

    @Override
    public void gravar(String caminho, byte[] dados) {
        cache.put(caminho, dados);
        destinoReal.gravar(caminho, dados);
    }

    @Override
    public byte[] ler(String caminho) {
        if (cache.containsKey(caminho)) {
            return cache.get(caminho);
        }
        return destinoReal.ler(caminho);
    }
}
