import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");

        int idade = entrada.nextInt();

        if (idade>=18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        entrada.close();



            }
}


// Peça a idade de uma pessoa e use uma estrutura if/else para determinar se ela
// é maior de idade (18 anos ou mais) ou não, e imprima a mensagem
// correspondente.