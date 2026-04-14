package q01;

public class Main {
    public static void main (String[] args){
        VeiculoCPF v1 = new VeiculoCPF("ABC", "2025", "leve", "123");
        VeiculoCNPJ v2 = new VeiculoCNPJ("ABB", "2024", "pesado", "456");

        System.out.println(v1.descricao());
        System.out.println(v2.descricao());
    }
}