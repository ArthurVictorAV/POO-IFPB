package Q02;


public interface Armazenamento {

    void gravar(String caminho, byte[] dados);
    byte[] ler(String caminho);
}
