package Q04;

public class Curso implements Avaliavel, Compravel{
    protected String titulo, nomeInstrutor;
    double notaMedia, preco;

    public Curso(String titulo, String nomeInstrutor, double notaMedia, double preco) {
        this.titulo = titulo;
        this.nomeInstrutor = nomeInstrutor;
        this.notaMedia = notaMedia;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String gerarRecibo(String nomeComprador) {
        return gerarResumoPublico() +
                "\n\t Nome do Comprador: " + nomeComprador;
    }

    @Override
    public String gerarResumoPublico() {
        return "Título: " + titulo +
                "\n\t Instrutor: " + nomeInstrutor +
                "\n\t Nota Média: " + notaMedia +
                "\n\t Preço: " + preco;
    }
}
