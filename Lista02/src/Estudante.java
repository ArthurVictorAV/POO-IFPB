public class Estudante {

    String nome;
    int matricula;
    double[] notas;


    public Estudante(String nome, int matricula,double... notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }


    public double getMedia(){
        if (notas == null || notas.length == 0){
            return -1.0;
        }
        double soma = 0;

        for(int i=0;i<notas.length;i++){
            soma += notas[i];
        }
        return soma/notas.length;
    }


    public void setNotas(double... notas){
        this.notas = notas;
    }

    public double getNota(int indice) {
        if (indice<0 || indice >= notas.length){
            return -1;
        }
        return notas[indice];
    }

    public String getSituacao(){
        double mediaFinal = getMedia();

        if(mediaFinal>=70){
            return "Aprovado";
        } else if(mediaFinal>=40){
            return "Final";
        } else{
            return "Reprovado";
        }
    }
}
