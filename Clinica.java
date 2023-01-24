
import java.util.ArrayList;

import pojos.Consulta;
import pojos.Medico;
import pojos.Paciente;

public class Clinica {
    public static void main(String[] args) {

        //Basta dar um "run" e o médico irá diagnosticar os pacientes!
        //Obs: caso um paciente já esteja diagnosticado, uma mensagem será retornada alertando a situação e retornará a doença do paciente.

        ArrayList<Paciente> pacientes = new ArrayList<>();
       
        Medico medico = new Medico.Builder("Pablo", "099", "pablo@outlook.com")
        .especialidade("Geral")
        .build();
        
        Paciente paciente1 = new Paciente.Builder("Antônio", "087", "antonio@gmail.com")
        .idade(49)
        .diagnostico("")
        .build();

        Paciente paciente2 = new Paciente.Builder("Jamila", "657", "jamila@gmail.com")
        .idade(39)
        .diagnostico("")
        .build();

        Paciente paciente3 = new Paciente.Builder("Otávio", "976", "otavio@outlook.com")
        .idade(21)
        .diagnostico("Febre")
        .build();

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);

        Consulta consulta = new Consulta.Builder(medico)
        .build();

        consulta.examinaPaciente(pacientes, medico);
        
        
    }
}
