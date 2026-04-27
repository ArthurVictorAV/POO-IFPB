package q1;

public class VeiculoCPF extends Veiculo{
    private String CPF;

    public VeiculoCPF(String placa, String anoFabricacao, String categoria, String CPF) {
        super(placa, anoFabricacao, categoria);
        this.CPF = CPF;

    }

    @Override
    String categoria() {
        return categoria;
    }


    public String descricao() {
        return "Cliente (CPF): " + CPF + super.descricao();
    }
}
