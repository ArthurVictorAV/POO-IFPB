import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante aluno = new Estudante();

        System.out.print("Digite seu nome: ");
        aluno.setNome(sc.nextLine());

        while (true) {
            System.out.print("Digite seu CPF: ");
            String cpfDigitado = sc.nextLine();

            try {
                aluno.setCpf(cpfDigitado);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nCadastro concluído para:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
    }
}

