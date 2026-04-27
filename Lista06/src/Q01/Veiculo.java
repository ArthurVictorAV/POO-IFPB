package Q01;

public abstract class Veiculo {
    protected String placa, anoFabricacao, categoria;

    public Veiculo(String placa, String anoFabricacao, String categoria) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        verificadorCategoria(categoria);
    }
    abstract String categoria();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private void verificadorCategoria(String categoria){
        if (!categoria.equals("leve") && !categoria.equals("medio") && !categoria.equals("pesado")) {
            throw new IllegalArgumentException("Categoria invalida!");
        }
        this.categoria = categoria;
    }


    public String descricao() {
        return " Veículo: " +
                "Placa: '" + placa + '\'' +
                ", Ano de Fabricação: '" + anoFabricacao + '\'' +
                ", Categoria: '" + categoria + '\'' + '}';

    }
}