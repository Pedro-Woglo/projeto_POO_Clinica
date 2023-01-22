
import java.util.ArrayList;

import pojos.Consulta;
import pojos.Paciente;

public class Clinica {
    public static void main(String[] args) {

        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        Paciente paciente = new Paciente.Builder("Antônio", "087", "antonio@gmail.com")
        .idade(49)
        .diagnostico("Verme")
        .build();

        pacientes.add(paciente);

        Consulta consulta = new Consulta.Builder(pacientes, "Pablo")
        .build();

        consulta.examinaPaciente(paciente);
        
        
    }
}
