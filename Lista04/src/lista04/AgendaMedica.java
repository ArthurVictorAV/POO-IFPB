package lista04;


import java.util.ArrayList;
import java.util.List;

public class AgendaMedica {
    List<Consulta> consultas;

    public AgendaMedica(){
        consultas = new ArrayList<>();
    }

    public void agendar(Consulta c) {
        if ( c == null) throw new IllegalArgumentException("ERROUUUU");

        consultas.add(c);
    }

    public Consulta buscarPorId(int id) {
        for (Consulta c : consultas) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public List<Consulta> listarPorMedico(String nomeMedico) {
            List<Consulta> resultado = new ArrayList<>();

            for (Consulta c : consultas){
                if (c.getNomeMedico().equals(nomeMedico)){
                    resultado.add(c);
                }
            }

            return resultado;
        }

    public List<Consulta> listarAtivas() {
        List<Consulta> resultado = new ArrayList<>();

        for (Consulta c : consultas){
            if (!c.getStatus().equals("CANCELADA") && !c.getStatus().equals("REALIZADA")){
                resultado.add(c);
            }
        }

        return resultado;
    }
}
