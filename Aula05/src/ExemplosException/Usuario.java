package ExemplosException;


import java.time.LocalDateTime;

public class Usuario {
    public static void validar(String nome, LocalDateTime dataNascimento) throws ExemplosException.ValidacaotextualException, ValidacaoDataException {
        if (nome == null) throw new ExemplosException.ValidacaotextualException("O nome do usuario não pode ser nulo");
        if (dataNascimento == null) throw new ValidacaoDataException("A data não pode ser nula");
    }
}
