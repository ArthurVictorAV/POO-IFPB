import java.util.Scanner;

public class Lista01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Questão: ");
        int q = sc.nextInt();

        switch (q) {
            case 1 -> questao1();
            case 2 -> questao2();
            case 3 -> questao3();
            case 4 -> questao4();
            case 5 -> questao5();
            case 6 -> questao6();
            case 7 -> questao7();
            case 8 -> questao8();
            case 9 -> questao9();
            case 10 -> questao10();
            case 11 -> questao11();
            case 12 -> questao12();
            case 13 -> questao13();
            case 14 -> questao14();
            case 15 -> questao15();
            case 16 -> questao16();
            default -> System.out.println("Questão inválida");
        }
    }

    // Questões
    // Desenvolva cada questão dentro dos métodos a seguir
    static void questao1() {
        int idade = 18;

        if (idade>=18) {
            System.out.println("É maior");
        } else {
            System.out.println("É menor");
        }
    }

    static void questao2() {
        int num = 3;

        if (num%2== 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    }

    static void questao3() {
        int x = 3;
        int y = 3;

        if (x>y){
            System.out.println("x é o maior");
        }
        else if (x<y) {
            System.out.println("y é o maior");
        }
        else {
            System.out.println("os números são iguais");
        }
    }

    static void questao4() {
        int graus = 30;
        if (graus>=20) {
            System.out.println("quente");
        } else {
            System.out.println("frio");
        }
    }

    static void questao5() {
        double nota = 6.6;
        if (nota>=6.8) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    static void questao6() {
        int energia = 200;
        double valor = 0;

        if (energia<=100)
        {
            valor = energia * 0.50;
            System.out.println("Valor total:" + valor);
        } else {
            valor = energia * 0.70;
            System.out.println("Valor total:" + valor);
        }

    }

    static void questao7() {
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

    }

    static void questao8() {
        int par = 0;
        int impar = 1;

        while (impar <= 100) {
            if (impar % 2 == 0) {
                par += impar;
            }
            impar++;
        }
        System.out.println("A soma dos pares é: " + par);
    }

    static void questao9() {
        int numero = 7;
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    static void questao10() {
        int numero = 10;
        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }

    static void questao11() {
        char letra = 'b';

        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("É vogal");
                break;
            default:
                System.out.println("Não é vogal");
        }
    }

    static void questao12() {
        char vogal = 'a';
        String frase = "Arthur";
        int contador = 0;

        String fraseminuscula=frase.toLowerCase();

        for (int i = 0; i < fraseminuscula.length();i++){
            if (fraseminuscula.charAt(i)==vogal) {
                contador++;
            }
        }
    System.out.println("A vogal '" + vogal + "' aparece " + contador + " vezes.");

    }

    static void questao13() {
    int[] inteiros = {1, 2, 3, 4, 5};
    int num = 6;

    for (int i=0; i < inteiros.length; i++){
        if(inteiros[i]==num){
            System.out.println("Está no Array");
                break;
        }
    }

    }

    static void questao14() {
        double[] notas ={8, 9, 10, 9, 10};
        int soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        double media = soma/notas.length;

        System.out.println("A média é: "+media);

    }

    static void questao15() {
        String[] frutas = {"banana", "maçã", "morango", "uva", "melão"};

        for(int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }

    }

    static void questao16() {
        String[] frutas = {"banana", "maçã", "morango", "uva", "melão"};
        for(int i = 0; i < frutas.length; i++){
            if (frutas[i].charAt(0) == 'm'){
                System.out.println(frutas[i]);
            }
        }
    }
}

