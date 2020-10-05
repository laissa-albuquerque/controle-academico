package controleacademico.entidades;

import java.util.List;

public class Professor extends Pessoa {

	List<Turma> turmas;

	public Professor(String cpf, String nome, String telefone, String email, List<Turma> turmas) {
		super(cpf, nome, telefone, email);
		this.turmas = turmas;
	}

	public void adicionarTurma(Turma turma) {
		turmas.add(turma);
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

}
