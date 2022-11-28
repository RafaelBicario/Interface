package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import br.edu.ifpr.trabalho.poo.implementacao. TrabalhoAluno;

import br.edu.ifpr.trabalho.poo.interfaces.ITrabalhoPOO;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo. Curso;
import br.edu.ifpr.trabalho.poo.modelo. Disciplina;
import br.edu.ifpr.trabalho.poo.modelo. Matricula;
import br.edu.ifpr.trabalho.poo.modelo. Professor;
import br.edu.ifpr.trabalho.poo.modelo. Turma;

public class ExemploDeTeste {
    public static void main(String[] args) {
        ITrabalhoPOO trabalho = new TrabalhoAluno();
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        ArrayList<Professor> professores = new ArrayList<Professor>();
        ArrayList<Turma> turmas = new ArrayList<Turma>();
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
// Leitura de Dados
        Curso curso = trabalho.lerDadosCurso();
        Aluno aluno = trabalho.lerDadosAluno();
        Professor professor = trabalho.lerDadosProfessor();
        Turma turma = trabalho.lerDadosTurma(curso);
        Disciplina disciplina = trabalho.lerDadosDisciplina(professor, turma);
        Matricula matricula = trabalho.lerDadosMatricula(aluno, turma);
// Impressão de Dados - relatórios
        trabalho.listarMatriculasAtivas(matriculas);
        trabalho.listarTodasMatriculas(matriculas);
        trabalho.listarAlunos(alunos);
        trabalho.listarTurmas(turmas);
        trabalho.listarProfessores(professores);
        trabalho.listarDisciplinas(disciplinas);
        trabalho.listarCursos(cursos);
    }
}