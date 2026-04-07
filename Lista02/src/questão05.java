public class questão05 {
    public static void main(String[] args){
        ContaCorrente contaArthur = new ContaCorrente("Arthur", 2000,123);
        ContaCorrente contaVictor = new ContaCorrente("Victor", 1000,333);

        contaArthur.getSaldo();
        contaArthur.depositar(100);
        contaArthur.getSaldo();
        contaVictor.getSaldo();
        contaVictor.sacar(100);
        contaVictor.getSaldo();
        contaArthur.transferir(contaVictor,100);
        contaArthur.getSaldo();
        contaVictor.getSaldo();

    }
}
