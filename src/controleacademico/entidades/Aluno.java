package controleacademico.entidades;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String cpf, String nome, String telefone, String email, String matricula) {
		super(cpf, nome, telefone, email);
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", getCpf()=");
		builder.append(getCpf());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getTelefone()=");
		builder.append(getTelefone());
		builder.append(", getEmail()=");
		builder.append(getEmail());
		builder.append("]");
		return builder.toString();
	}
}
