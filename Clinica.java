
import java.util.ArrayList;

import pojos.Consulta;
import pojos.Medico;
import pojos.Paciente;

public class Clinica {
    public static void main(String[] args) {

        Medico medico = new Medico.Builder("Pablo", "099", "pablo@outlook.com")
        .especialidade("Geral")
        .build();

        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        Paciente paciente = new Paciente.Builder("Antônio", "087", "antonio@gmail.com")
        .idade(49)
        .diagnostico("")
        .build();

        pacientes.add(paciente);

        Consulta consulta = new Consulta.Builder(pacientes, medico)
        .build();

        consulta.examinaPaciente(paciente);
        
        
    }
}
