package projeto;

class Paciente {

    private static int qtdPacientes;
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String diagnostico;

    private Paciente (Builder builder){
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.cpf = builder.cpf;
        this.email = builder.email;
        this.diagnostico = builder.diagnostico;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDiagnostico(){
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico){
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + this.nome + '\'' +
                ", idade='" + this.idade + '\'' +
                ", cpf=" + this.cpf +
                ", email='" + this.email + '\'' +
                ", diagnostico='" + this.diagnostico + 
                '}';
    }

    public static class Builder{

        private String nome;
        private int idade;
        private String cpf;
        private String email;
        private String diagnostico;

        public Builder(String nome, String cpf){
            this.nome = nome;
            this.cpf = cpf;
        }

        public Builder idade(int idade){
            this.idade = idade;
            return this;
        }

        public Builder email(String email){
            this.email = email;
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
