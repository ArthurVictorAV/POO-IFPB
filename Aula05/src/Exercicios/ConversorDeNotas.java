package Exercicios;


public class ConversorDeNotas {
    public String obterConceito(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida!");
        }

        if (nota >= 9){
            return "A";
        } else if (nota >= 7){
            return "B";
        } else if (nota >= 5){
            return "C";
        } else return "D";
    }
}