package Q01;

public class VeiculoCNPJ extends Veiculo{
    private String CNPJ;
    public VeiculoCNPJ(String placa, String anoFabricacao, String categoria, String CNPJ) {
        super(placa, anoFabricacao, categoria);
        this.CNPJ = CNPJ;
    }

    @Override
    String categoria() {
        return categoria;
    }

    public String descricao() {
        return "Cliente (CNPJ): " + CNPJ + super.descricao();
    }

}
