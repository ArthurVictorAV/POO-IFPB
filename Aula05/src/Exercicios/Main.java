package Exercicios;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConversorDeNotas conversor =  new ConversorDeNotas();
        boolean notaValida = false;

        while (!notaValida) {
            try {
                System.out.print("Digite a nota: ");
                double nota = entrada.nextDouble();
                System.out.println("Conceito: " + conversor.obterConceito(nota));
                notaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número.");
                entrada.nextLine();
            }
        }
    }
}
