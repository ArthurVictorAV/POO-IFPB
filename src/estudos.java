public class estudos {
    static void main(String[] args) {
        //Q1 - MAIOR OU MENOR DE IDADE
        int idade = 18;

        if (idade>=18){
            System.out.println("Maior");
        } else{
            System.out.println("Menor");
        }

        //Q2 - PAR OU IMPAR

        int numero = 4;
        if (numero%2 == 0){
            System.out.println("É par");
        } else{
            System.out.println("É impar");
        }

        //Q3 - QUAL NÚMERO É MAIOR

        int numero1 = 3;
        int numero2 = 2;

        if (numero1>numero2){
            System.out.println("numero1 É MAIOR: "+numero1);
        } else if( numero1<numero2){
            System.out.println("numero2 É MAIOR: "+numero2);
        } else{
            System.out.println("Ambos são iguais: "+numero1+" = "+numero2);
        }

        //Q4 - QUENTE OU FRIO

        int temperatura = 10;

        if (temperatura>=20){
            System.out.println("Quente");
        } else{
            System.out.println("Frio");
        }

        //Q5 - PASSO OU TA REPROVADO

        double nota = 6.7;

        if (nota>= 6.8){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }

        //Q6 - CONTA DE LUZ

        int consumo = 200;

        if (consumo>=100){
            System.out.println("valor a ser pago = "+consumo*0.70);
        } else{
            System.out.println("valor a ser pago = "+consumo*0.50);
        }

        //Q7 - CONTAGEM REGRESSIVA

        for (int i=10; i>=0; i--){
            System.out.println(i);
        }

        //Q8 - SOMAR TODOS NÚMEROS PARES DE 1 A 100

        int soma = 0;
        int num = 1;
        while (num<=100){
            if (num %2 == 0){
                soma = soma+num;
                num++;
            }else{
                num++;
            }
        }
        System.out.println(soma);
    }
}