public class questão03 {
    public static void main(String[] args) {

        Temperatura tempOriginal = new Temperatura(86, "F");


        Temperatura t1 = tempOriginal.toCelsius();
        Temperatura t2 = tempOriginal.toFahrenheit();
        Temperatura t3 = tempOriginal.toKelvin();


        System.out.println("Resultados das conversões:");
        t1.imprimeComEscala();
        t2.imprimeComEscala();
        t3.imprimeComEscala();
    }
}