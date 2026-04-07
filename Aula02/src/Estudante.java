public class Estudante {
    private String nome;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.length() != 11) {
            throw new Exception("CPF deve ter 11 dígitos.");
        }
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}

