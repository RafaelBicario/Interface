package br.edu.ifpr.trabalho.poo.modelo;

public class Disciplina {
    private static String nome;
    private static int cargaHoraria;
    private static Professor professor;

    private static Turma turma;

    public Disciplina(String nome, int cargaHoraria, Professor professor, Turma turma) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.turma = turma;
    }

    public Disciplina(String nome, String cargaHoraria, String professor, String turma) {
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public static Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public static Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
