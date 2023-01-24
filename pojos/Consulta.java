package pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Consulta {
    
    private List<String> diagnosticos;
    private Medico medico;

    private Consulta(Builder builder){
		this.medico = builder.medico;
        this.diagnosticos = builder.diagnosticos;
    }

    public void examinaPaciente(ArrayList<Paciente> pacientes, Medico medico){
        Random rand = new Random();
        for (Paciente paciente : pacientes) {
            if(paciente.getDiagnostico().equals("")){
                paciente.setDiagnostico(this.diagnosticos.get(rand.nextInt(this.diagnosticos.size())));
                System.out.println("Paciente " + paciente.getNome() + " diagnosticado pelo médico " + this.medico.getNome() + ": " + paciente.getDiagnostico());
            }else{
                System.out.println("Paciente " + paciente.getNome() + " já diagnosticado! (" + paciente.getDiagnostico() + ")");
            }
        }
        
    }

    public List<String> getDiagnosticos() {
        return this.diagnosticos;
    }

    public void setDiagnosticos(List<String> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    private Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "{" +
            " diagnosticos='" + getDiagnosticos() + "'" +
            ", medico='" + getMedico() + "'" +
            "}";
    }
    public static class Builder{

        private List<String> diagnosticos = Arrays.asList("Gripe", "Covid-19", "Malária", "Hipertensão", "Depressão", "Saudável");;
        private Medico medico;

        public Builder (Medico medico) {
            this.medico = medico;
		}

        public Consulta build() {
			return new Consulta(this);
		}
    }
}
