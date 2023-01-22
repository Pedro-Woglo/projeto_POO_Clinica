package pojos;

public class Medico extends Pessoa{

    private String especialidade;

    private Medico (Builder builder){
        super(builder.nome, builder.cpf, builder.email);
        this.especialidade = builder.especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "{" +
            " especialidade='" + getEspecialidade() + "'" +
            "}";
    }

    public static class Builder{

        private String nome;
        private String cpf;
        private String email;
        private String especialidade;

        public Builder(String nome, String cpf, String email){
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
        }

        public Builder especialidade(String especialidade){
            this.especialidade = especialidade;
            return this;
        }
        
        public Medico build() {
			return new Medico(this);
		}
    }
}
