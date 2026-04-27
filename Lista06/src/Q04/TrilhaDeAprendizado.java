package Q04;

public class TrilhaDeAprendizado implements Avaliavel{
    protected String nome;
    protected int numeroCursos;
    protected double notaMedia;

    public TrilhaDeAprendizado(String nome, int numeroCursos, double notaMedia) {
        this.nome = nome;
        this.numeroCursos = numeroCursos;
        this.notaMedia = notaMedia;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Nome: " + nome +
                "\n\t Número de Cursos: " + numeroCursos +
                "\n\t Nota Média: " + notaMedia;
    }
}
