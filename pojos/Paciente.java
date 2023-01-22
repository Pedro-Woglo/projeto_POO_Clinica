package pojos;

public class Paciente extends Pessoa{

    private static int qtdPacientes = 0;
    private int idade;
    private String diagnostico;

    private Paciente (Builder builder){
        super(builder.nome, builder.cpf, builder.email);
        this.idade = builder.idade;
        this.diagnostico = builder.diagnostico;
        aumentaQtdPacientes();
    }

    public static int getQtdPacientes(){
        return qtdPacientes;
    }

    private void aumentaQtdPacientes(){
        qtdPacientes++;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getDiagnostico(){
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico){
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "{" +
            " idade='" + getIdade() + "'" +
            ", diagnostico='" + getDiagnostico() + "'" +
            "}";
    }

    public static class Builder{

        private String nome;
        private int idade;
        private String cpf;
        private String email;
        private String diagnostico;

        public Builder(String nome, String cpf, String email){
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
        }

        public Builder idade(int idade){
            this.idade = idade;
            return this;
        }

        public Builder diagnostico(String diagnostico){
            this.diagnostico = diagnostico;
            return this;
        }
        
        public Paciente build() {
			return new Paciente(this);
		}
    }

}
