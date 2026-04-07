public class Circulo {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI*raio*raio;
    }

    public double calcularCircunferencia(){
        return 2*Math.PI*raio;
    }

    public boolean contemOutro(Circulo outro){
        if(this.raio> outro.raio){
            return true;
        } else{
            return false;
        }
    }

    public Circulo maior(Circulo outro){
        if(this.raio>outro.raio){
            return this;
        }else{
            return outro;
        }
    }

    void exibirDados(){
        System.out.println("Raio: "+String.format("%.2f",this.raio));
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Circunferência: " + String.format("%.2f", calcularCircunferencia()));
    }

}
