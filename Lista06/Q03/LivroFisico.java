package Q03;


public class LivroFisico extends Produto{
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, double preco, int numeroPaginas) {
        super(titulo, autor, preco);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "LivroFisico: " + super.toString() +
                "\n\tnumeroPaginas: " + numeroPaginas +
                '}';
    }
}