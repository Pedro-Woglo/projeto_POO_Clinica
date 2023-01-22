package pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Consulta {
    
    private ArrayList<Paciente> pacientes;
    private List<String> diagnosticos;
    private Medico medico;

    private Consulta(Builder builder){
        this.pacientes = builder.pacientes;
		this.medico = builder.medico;
        this.diagnosticos = builder.diagnosticos;
    }

    public void examinaPaciente(Paciente paciente){
        Random rand = new Random();
        if(paciente.getDiagnostico().equals("")){
            paciente.setDiagnostico(this.diagnosticos.get(rand.nextInt(this.diagnosticos.size())));
            System.out.println("Paciente " + paciente.getNome() + " diagnosticado pelo médico " + this.medico.getNome() + ": " + paciente.getDiagnostico());
        }else{
            System.out.println("Paciente " + paciente.getNome() + " já diagnosticado! (" + paciente.getDiagnostico() + ")");
        }
    }

    public ArrayList<Paciente> getPacientes(){
        return this.pacientes;
    }

    public void setPaciente(ArrayList<Paciente> pacientes){
        this.pacientes = pacientes;
    }

    public List<String> getDiagnosticos() {
        return this.diagnosticos;
    }

    public void setDiagnosticos(List<String> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                ", nome do medico='" + this.medico.getNome() + '\'' +
                ", quantidade de pacientes='" + this.pacientes.size() + '\'' +
                '}';
    }

    public static class Builder{

        private ArrayList<Paciente> pacientes;
        private List<String> diagnosticos = Arrays.asList("Gripe", "Covid-19", "Malária", "Hipertensão", "Depressão", "Saudável");;
        private Medico medico;

        public Builder (ArrayList<Paciente> pacientes, Medico medico) {
			this.pacientes = pacientes;
            this.medico = medico;
		}

        public Consulta build() {
			return new Consulta(this);
		}
    }
}
