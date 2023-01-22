package projeto;

import java.util.ArrayList;

public class Clinica {
    public static void main(String[] args) {

        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        Paciente paciente = new Paciente.Builder("Antônio", "087")
        .idade(49)
        .email("antonio@gmail.com")
        .diagnostico("Verme")
        .build();

        pacientes.add(paciente);

        Consulta consulta = new Consulta.Builder(pacientes, "Pablo")
        .build();

        consulta.examinaPaciente(paciente);
        
        
    }
}
