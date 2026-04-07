public class ContaCorrente {
    String titular;
    double saldo;
    int numeroConta;

    public ContaCorrente (String titular, double saldo, int numeroConta){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    void depositar(double valor){
        if (valor>0){
            this.saldo += valor;

        }else{
            System.out.println("ERRO: O valor deve ser positivo!!!");
        }
    }

    void sacar(double valor){
        if(valor>0 && valor <= this.saldo){
            this.saldo -= valor;
        }else{
            System.out.println("ERRO: Valor superior ao saldo em conta");
        }
    }

    void transferir(ContaCorrente destino, double valor){
        if (valor>0 && valor<=this.saldo){
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("---------------------");
            System.out.println("Transferência de R$ "+valor+" realizada!");
        } else{
            System.out.println("ERRO: Transferência não permitida.");
        }
    }

    void getSaldo(){
        System.out.println("---------------------");
        System.out.println("Títular: "+this.titular);
        System.out.println("Conta: "+this.numeroConta);
        System.out.println("Saldo: R$ "+this.saldo);
    }


}