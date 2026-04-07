public class questão04 {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("Arthur", 03, 80.0, 70.5, 90.0, 70.0);

        System.out.println("Aluno: "+ aluno1.nome);
        System.out.println("Matricula: "+aluno1.matricula);
        System.out.println("Média: "+aluno1.getMedia());
        System.out.println("Situação final: "+aluno1.getSituacao());
        System.out.println("Nota 1: "+aluno1.getNota(0));
        System.out.println("Nota 3: "+ aluno1.getNota(3));
    }
}
