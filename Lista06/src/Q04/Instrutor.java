package Q04;

public class Instrutor implements Avaliavel{
    protected String nome, especialidade;
    protected double notaMedia;

    public Instrutor(String nome, String especialidade, double notaMedia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.notaMedia = notaMedia;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Nome: " + nome +
                "\n\t Especialidade: " + especialidade +
                "\n\t Nota Média: " + notaMedia;
    }
}

