package Q04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class PlataformaLearnHub {
    List<Avaliavel> avaliaveis = new ArrayList<>();


    public void cadastrar(Avaliavel a) {
        avaliaveis.add(a);
    }


    public List<Avaliavel> listarPorNotaMinima(double notaMinima) {
        List<Avaliavel> listaNotaMinima = new ArrayList<>();

        for(Avaliavel b : avaliaveis){
            if(b.getNotaMedia() >= notaMinima){
                listaNotaMinima.add(b);
            }
        }
            return listaNotaMinima;
    }

    public List<Compravel> listarCompravel() {
        List<Compravel> resultado = new ArrayList<>();
        for (Avaliavel a : avaliaveis){
            if(a instanceof Compravel b){
                resultado.add(b);
            }
        }
        return resultado;
    }

    public String gerarPaginaDeBusca(double notaMinima) {
        StringBuilder res = new StringBuilder();
        for(Avaliavel a : listarPorNotaMinima(notaMinima)){
                res.append(a.gerarResumoPublico() + "\n");
        }
        return res.toString();
    }

    public String processarCompra(String nomeComprador, String tituloCurso) {
        for (Avaliavel a : avaliaveis){
            if ( a instanceof Curso b) {
                Curso curso = b;

                if (curso.getTitulo().equals(tituloCurso) && curso instanceof Compravel cursoCompravel){
                    return curso.gerarRecibo(nomeComprador);
                }
            }
        }
        return null;
    }

    public List<String> gerarRecibosEmLote(String nomeComprador) {
        List<String> recibos = new ArrayList<>();
        for(Compravel item : listarCompravel()){
            recibos.add(item.gerarRecibo(nomeComprador));
        }
        return recibos;
    }
}
