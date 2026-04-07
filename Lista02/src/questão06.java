public class questão06 {
    public static void main(String[] args){
        Circulo c1 = new Circulo(5.0);
        c1.exibirDados();
        c1.raio = c1.raio*2;
        c1.exibirDados();

        Circulo c2 = new Circulo(3.0);

        //AQUI TESTA O BOOLEAN SE C1 É MAIOR QUE C2
        System.out.println(c1.contemOutro(c2));

        //TESTA QUAL O CIRCULO MAIOR:
        Circulo maior = c1.maior(c2);
        maior.exibirDados();
    }
}
