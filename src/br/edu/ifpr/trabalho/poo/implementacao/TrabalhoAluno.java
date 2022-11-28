package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.interfaces.ITrabalhoPOO;
import br.edu.ifpr.trabalho.poo.modelo.*;


public class TrabalhoAluno implements ITrabalhoPOO {

        @Override
        public Aluno lerDadosAluno() {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Infome o Nome");
                String nome = teclado.nextLine();
                System.out.println("Infome o endereco");
                String endereco = teclado.nextLine();
                System.out.println("Infome a Data de Nascimento");
                String datanascimento = teclado.nextLine();
                System.out.println("Infome o Telefone de Contato");
                String telefoneContato = teclado.nextLine();
                System.out.println("Infome o Ano de Ingresso");
                String anoDeIngresso = teclado.nextLine();
                Aluno aluno = new Aluno(nome,endereco,datanascimento,telefoneContato,anoDeIngresso);
                return aluno;
        }

        @Override
        public Professor lerDadosProfessor() {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Infome o Nome");
                String nome = teclado.nextLine();
                System.out.println("Infome o endereco");
                String endereco = teclado.nextLine();
                System.out.println("Infome a Data de Nascimento");
                String datanascimento = teclado.nextLine();
                System.out.println("Infome o Telefone de Contato");
                String telefoneContato = teclado.nextLine();
                System.out.println("Infome o Siape");
                String siape = teclado.nextLine();
                Professor professor = new Professor(nome,endereco,datanascimento,telefoneContato,siape);
                return professor;
        }

        @Override
        public Curso lerDadosCurso() {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Informe o nome do curso: ");
                String nome = teclado.nextLine();
                Curso curso= new Curso (nome);
                return curso;
        }

        @Override
        public Turma lerDadosTurma() {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Infome os alunos matriculados");
                String alunosMatriculados = teclado.nextLine();
                System.out.println("Infome o numero minimo");
                String numeroMinimo = teclado.nextLine();
                System.out.println("Infome o Nome da turma");
                String nomeTurma = teclado.nextLine();
                System.out.println("Infome a disciplina");
                String disciplina = teclado.nextLine();
                System.out.println("Infome a Matricula");
                String matricula = teclado.nextLine();
                Turma turma = new Turma(alunosMatriculados,numeroMinimo,nomeTurma,disciplina,matricula);
                return turma;
        }

        @Override
        public Turma lerDadosTurma(Curso curso) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Infome os alunos matriculados");
                String alunosMatriculados = teclado.nextLine();
                System.out.println("Infome o numero minimo");
                String numeroMinimo = teclado.nextLine();
                System.out.println("Infome o Nome da turma");
                String nomeTurma = teclado.nextLine();
                System.out.println("Infome a disciplina");
                String disciplina = teclado.nextLine();
                System.out.println("Infome a Matricula");
                String matricula = teclado.nextLine();
                Turma turma = new Turma(alunosMatriculados,numeroMinimo,nomeTurma,disciplina,matricula);
                return turma;
        }

        @Override
        public Disciplina lerDadosDisciplina() {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Infome o Nome");
                String nome = teclado.nextLine();
                System.out.println("Infome a Carga Horaria");
                String cargaHoraria = teclado.nextLine();
                System.out.println("Infome o Professor");
                String professor = teclado.nextLine();
                System.out.println("Infome a Turma");
                String turma = teclado.nextLine();

                Disciplina disciplina = new Disciplina(nome,cargaHoraria,professor,turma);
                return disciplina;
        }

        @Override
        public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Infome o Nome");
                String nome = teclado.nextLine();
                System.out.println("Infome a Carga Horaria");
                String cargaHoraria = teclado.nextLine();

                Disciplina disciplina = new Disciplina(nome, Integer.parseInt(cargaHoraria),professor,turma);
                return disciplina;
        }

        @Override
        public Matricula lerDadosMatricula() {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Infome o Numero");
                String numero = teclado.nextLine();
                System.out.println("Infome o status");
                String ativa = teclado.nextLine();
                Matricula matricula = new Matricula(numero,ativa);
                return matricula;
        }

        @Override
        public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Infome o Numero");
                String numero = teclado.nextLine();
                System.out.println("Infome o status");
                String ativa = teclado.nextLine();
                Matricula matricula = new Matricula(aluno,turma,numero,ativa);
                return matricula;
        }

        @Override
        public void listarMatriculasAtivas(ArrayList<Matricula> matriculas) {
                System.out.println("Lista de Matriculas");
                for (Matricula matricula : matriculas ) {
                        if(matricula.isAtiva()){
                                System.out.println("Numero:" + matricula.getNumero());
                                System.out.println("Ativa:" + matricula.isAtiva());
                        }
                }
                System.out.println("---------------------");
        }

        @Override
        public void listarTodasMatriculas(ArrayList<Matricula> matriculas) {
                System.out.println("Lista de Matriculas");
                for (Matricula matricula : matriculas ) {
                        System.out.println("Numero:" + matricula.getNumero());
                        System.out.println("Ativa:" + matricula.isAtiva());
                }
                System.out.println("---------------------");
        }

        @Override
        public void listarAlunos(ArrayList<Aluno> alunos) {
                System.out.println("Lista de Alunos");
                for (Aluno aluno : alunos ) {
                        System.out.println("Nome:" + aluno.getNome());
                        System.out.println("Endereço:" + aluno.getEndereco());
                        System.out.println("Nascimento:" + aluno.getDataNascimento());
                        System.out.println("Telefone:" + aluno.getTelefoneContato());
                        System.out.println("Ano Ingresso:" + aluno.getAnoDeIngresso());
                }
                System.out.println("---------------------");
        }

        @Override
        public void listarTurmas(ArrayList<Turma> turmas) {
                System.out.println("Lista de Turmas");
                for (Turma turma : turmas ) {
                        System.out.println("QTD. Alunos:" + turma.getAlunosMatriculados());
                        System.out.println("Numero Minimo:" + turma.getNumeroMinimo());
                        System.out.println("Nome:" + turma.getNomeTurma());
                        System.out.println("Disciplina: " + turma.getDisciplina());
                        System.out.println("Matricula: " + turma.getMatricula());
                }
                System.out.println("---------------------");
        }

        @Override
        public void listarProfessores(ArrayList<Professor> professores) {
                System.out.println("Lista de Professores");
                for (Professor professor : professores ) {
                        System.out.println("Nome:" + professor.getNome());
                        System.out.println("Endereço:" + professor.getEndereco());
                        System.out.println("Nascimento:" + professor.getDataNascimento());
                        System.out.println("Telefone:" + professor.getTelefoneContato());
                        System.out.println("Siape:" + professor.getSiape());
                }
                System.out.println("---------------------");
        }

        @Override
        public void listarDisciplinas (ArrayList<Disciplina> disciplinas) {
                System.out.println("Lista de Disciplinas");
                for (Disciplina disciplina : disciplinas ) {
                        System.out.println("Nome:" + disciplina.getNome());
                        System.out.println("Carga Horária:" + disciplina.getCargaHoraria());
                        System.out.println("Professor:" + disciplina.getProfessor().getNome());
                        System.out.println("Turma:" + disciplina.getTurma().getNomeTurma());
                }
                System.out.println("---------------------");
        }

        @Override
        public void listarCursos(ArrayList<Curso> cursos) {
                System.out.println("Lista de Cursos");
                for (Curso curso : cursos ) {
                        System.out.println("Nome:" + curso.getNome());
                        System.out.println("Turma:" + curso.getTurma().getNomeTurma());
                }
                System.out.println("---------------------");
        }


}