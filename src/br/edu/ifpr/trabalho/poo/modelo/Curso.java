package br.edu.ifpr.trabalho.poo.modelo;

public class Curso {
    private String nome;
    private Turma turma;

    public Curso(String nome) {
        this.nome = nome;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
