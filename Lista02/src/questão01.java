//Criando um programa que demonstre o comportamento
//de overflow e underflow nos tipos byte, short e int.

public class questão01 {
    public void main (String[] args){

        // Declara uma variavel e
        // coloca o valor maximo e minimo.

        byte ByteMax = Byte.MAX_VALUE;
        byte ByteMin = Byte.MIN_VALUE;
        short ShortMax = Short.MAX_VALUE;
        short ShortMin = Short.MIN_VALUE;
        int IntMax = Integer.MAX_VALUE;
        int IntMin = Integer.MIN_VALUE;

        // Soma +1 em cada valor maximo,
        // ao qual o número vira um negativo
        // visto que estrapola o valor maximo e
        // vira um valor positivo quando estrapola o valor min.

        byte byteOverFlow = (byte) (ByteMax+1);
        byte byteUnderFlow = (byte) (ByteMin-1);

        short shortOverFlow = (short) (ShortMax+1);
        short shortUnderFlow = (short) (ShortMin-1);

        int intOverFlow = (int) (IntMax+1);
        int intUnderFlowint = (int) (IntMin-1);

        // print para mostrar o resultado de cada.

        System.out.println("Valor max Byte: "+byteOverFlow);
        System.out.println("Valor min Byte: "+byteUnderFlow);

        System.out.println("Valor max Short: "+shortOverFlow);
        System.out.println("Valor min Short: "+shortUnderFlow);

        System.out.println("Valor max Int: "+intOverFlow);
        System.out.println("Valor min Int: "+intUnderFlowint);

        // Convertendo explicitamente
        // um long com valor 300 para byte

        long k = 300L;
        byte kbyte = (byte) k;

        //print para mostrar o resultado
        //da adequação do long dentro do byte.

        System.out.println("Cast de long em byte: "+kbyte);
    }
}
