package controleacademico;

import java.util.ArrayList;
import java.util.List;

import controleacademico.entidades.Aluno;
import controleacademico.entidades.Curso;
import controleacademico.entidades.Professor;
import controleacademico.entidades.Turma;

public class ControleAcademico {

	private List<Aluno> alunos;
	private List<Professor> professores;
	private List<Curso> cursos;
	private List<Turma> turmas;

	public ControleAcademico(List<Aluno> alunos, List<Professor> professores, List<Curso> cursos, List<Turma> turmas) {
		this.alunos = alunos;
		this.professores = professores;
		this.cursos = cursos;
		this.turmas = turmas;
	}
	
	public void cadastrarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void cadastrarProfessor(Professor professor) {
		professores.add(professor);
	}
	
	public void cadastrarTurma(int ano, int semestre, String disciplina, Curso curso, Professor professor) {
		Turma turma = new Turma(ano, semestre, disciplina, curso, professor, new ArrayList<Aluno>());
		turmas.add(turma);
	}
	
	public void matricularAluno(Aluno aluno, Turma turma) {
		alunos.add(aluno);
		turma.matricular(aluno);
		if(!turmas.contains(turma)) {
			turmas.add(turma);
		}
		for (int i = 0; i < turmas.size(); i++) {
			if(turmas.get(i).equals(turma)) {
				turmas.set(i, turma);
			}
		}
	}
	
	public List<Aluno> getTodosOsAlunos(){
		return alunos;
	}
	
	public List<Aluno> getTodosOsAlunosDaTurma(Turma turma){
		List<Aluno> AlunosTurma = null;
		for (Turma t : turmas) {
			if(t.equals(turma)) {
				AlunosTurma = t.getAlunos();
			}
		}
		return AlunosTurma;
	}
	
	public Professor getProfessorDaTurma(Turma turma) {
		Professor professorRetorno = null;
		for (Turma t : turmas) {
			if(t.equals(turma)) {
				professorRetorno = t.getProfessor();
			}
		}
		return professorRetorno;
	}

	public static void main(String[] args) {

		ControleAcademico ca = new ControleAcademico(new ArrayList<Aluno>(), new ArrayList<Professor>(),
				new ArrayList<Curso>(), new ArrayList<Turma>());
		
		Curso curso = new Curso("Sistemas da Informação");
		ca.cadastrarCurso(curso);
		
		Professor professor = new Professor("846.333.430-09", "Fulano de Tal", "(83) 9 9999-9999", 
				"fulano@email.com", new ArrayList<Turma>());
		ca.cadastrarProfessor(professor);
		
		ca.cadastrarTurma(2020, 2, "Programação 2", curso, professor);
		
		Aluno a1 = new Aluno("859.661.850-34", "Menino Menino", "(83) 8888-8888", "menino@email.com", "123456");
		Aluno a2 = new Aluno("759.681.850-35", "Menina Menina", "(83) 7777-7777", "menina@email.com", "123832");
		Aluno a3 = new Aluno("123.456.789-00", "Lorem Ipsum", "(83) 5454-3231", "lorem@email.com", "045123");
		
		ca.matricularAluno(a1, ca.turmas.get(0));
		ca.matricularAluno(a2, ca.turmas.get(0));
		ca.matricularAluno(a3, ca.turmas.get(0));
		
		List<Aluno> impressaoAluno = ca.getTodosOsAlunosDaTurma(ca.turmas.get(0));
		
		for (Aluno aluno : impressaoAluno) {
			System.out.println(aluno.toString());
		}

	}

}
