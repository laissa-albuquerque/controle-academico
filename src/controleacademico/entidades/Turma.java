package controleacademico.entidades;

import java.util.List;

public class Turma {

	private Integer ano;
	private Integer semestre;
	private String disciplina;
	private Curso curso;
	private Professor professor;
	private List<Aluno> alunos;

	public Turma(Integer ano, Integer semestre, String disciplina, Curso curso, Professor professor,
			List<Aluno> alunos) {
		this.ano = ano;
		this.semestre = semestre;
		this.disciplina = disciplina;
		this.curso = curso;
		this.professor = professor;
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Turma [ano=");
		builder.append(ano);
		builder.append(", semestre=");
		builder.append(semestre);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append(", curso=");
		builder.append(curso.toString());
		builder.append(", professor=");
		builder.append(professor.toString());
		builder.append("]");
		return builder.toString();
	}

	public void matricular(Aluno aluno) {
		alunos.add(aluno);
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + ((semestre == null) ? 0 : semestre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (semestre == null) {
			if (other.semestre != null)
				return false;
		} else if (!semestre.equals(other.semestre))
			return false;
		return true;
	}
}
