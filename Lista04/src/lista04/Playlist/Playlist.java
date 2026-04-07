package lista04.Playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    public String nome;
    public List<Musica> fila;

    public Playlist(String nome){

        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("ERROUUUU");

        this.nome = nome;
        this.fila = new ArrayList<>();
    }
    public int tamanho() {
        return fila.size();
    }

    public void adicionar(Musica m) {
        if (m == null) throw new IllegalArgumentException("ERROUUUU");

        if (m.getPrioridade().equals("URGENTE" )){
            int index = 0;
            while (index < fila.size() && fila.get(index).getPrioridade().equals("URGENTE")) {
                index++;
            }
            fila.add(index, m);
        }else{
            fila.add(m);
        }
    }

    public Musica proximaMusica() {
        if (fila.isEmpty()){
            return null;
        }
        return fila.get(0);
    }

    public Musica reproduzirProxima() {
        if (fila.isEmpty()){
            return null;
        }
        return fila.remove(0);
    }

    public void remover(String musica) {
        for (int i = 0; i < fila.size(); i++) {

            if (fila.get(i).getTitulo().equals(musica)) {
                fila.remove(i);
                return;
            }
        }
    }
}
