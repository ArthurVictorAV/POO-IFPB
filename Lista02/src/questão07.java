public class questão07 {
    public static void main(String[] args) {

        Relogio r1 = new Relogio(23, 59, 57);

        System.out.println("Horário Inicial: " + r1.exibirHorario());

        System.out.println("--- Avançados 5 segundos ---");
        r1.adicionarSegundos(5);
        System.out.println(r1.exibirHorario());


        Relogio r2 = new Relogio(00, 00, 05);
        if (r1.isMaiorQue(r2)) {
            System.out.println("O horário r1: " + r1.exibirHorario() + " é maior que r2: "+r2.exibirHorario());
        }else{
            System.out.println("O horário r2: " + r2.exibirHorario() + " é maior que r1: "+r1.exibirHorario());
        }
    }
}