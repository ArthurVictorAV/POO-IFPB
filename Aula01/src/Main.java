public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.periodo = 2;
        estudante.nome = "Arthur";
        estudante.idade = 23;
        estudante.cra = 88.7;
        estudante.curso = "ADS";

        System.out.println("Olá "+ estudante.nome+" vejo que você cursa "+estudante.curso+" tem "+estudante.idade+" anos e está no "+estudante.periodo+" período e com CRA "+estudante.cra);

    }
}