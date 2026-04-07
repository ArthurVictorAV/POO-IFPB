package lista04.Playlist;

public class Musica {

    public String titulo;
    public String artista;
    public int duracaoSegundos;
    public String prioridade;

    public Musica(String titulo,
                  String artista,
                  int duracaoSegundos,
                  String prioridade){

        if (titulo == null || titulo.isBlank())
            throw new IllegalArgumentException();

        if (artista == null || artista.isBlank())
            throw new IllegalArgumentException();

        if (duracaoSegundos <= 0)
            throw new IllegalArgumentException();

        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;

        setPrioridade(prioridade);
    }

    public void setPrioridade(String nome) {

        if (nome == null ||
                (!nome.equals("NORMAL") && !nome.equals("URGENTE"))) {

            throw new IllegalArgumentException();
        }

        this.prioridade = nome;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }
}