package q1;

public abstract class Veiculo {
    protected String placa, anoFabricacao, categoria;

    public Veiculo(String placa, String anoFabricacao, String categoria) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        verificadorCategoria(categoria);
    }

    private void verificadorCategoria(String categoria){
        if (!categoria.equals("leve") && !categoria.equals("medio") && !categoria.equals("pesado")) {
            throw new IllegalArgumentException("Categoria invalida!");
        }
        this.categoria = categoria;
    }


    abstract String categoria();

    public String descricao() {
        return " Veículo: " +
                "Placa: '" + placa + '\'' +
                ", Ano de Fabricação: '" + anoFabricacao + '\'' +
                ", Categoria: '" + categoria + '\'' + '}';

    }
}