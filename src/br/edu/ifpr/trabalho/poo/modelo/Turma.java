package br.edu.ifpr.trabalho.poo.modelo;

public class Turma {
    private int alunosMatriculados;
    private int numeroMinimo;
    private String nomeTurma;
    private Disciplina disciplina;
    private Matricula matricula;

    public Turma(int alunosMatriculados, int numeroMinimo, String nomeTurma, Disciplina disciplina, Matricula matricula) {
        this.alunosMatriculados = alunosMatriculados;
        this.numeroMinimo = numeroMinimo;
        this.nomeTurma = nomeTurma;
        this.disciplina = disciplina;
        this.matricula = matricula;
    }

    public Turma(String alunosMatriculados, String numeroMinimo, String nomeTurma, String disciplina, String matricula) {
    }

    public int getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(int alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public int getNumeroMinimo() {
        return numeroMinimo;
    }

    public void setNumeroMinimo(int numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
