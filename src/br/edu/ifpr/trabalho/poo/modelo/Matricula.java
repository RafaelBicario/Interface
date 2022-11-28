package br.edu.ifpr.trabalho.poo.modelo;

public class Matricula {
    private int numero;
    private boolean ativa;

    public Matricula(int numero, boolean ativa) {
        this.numero = numero;
        this.ativa = ativa;
    }

    public Matricula(String numero, String ativa) {
    }

    public Matricula(Aluno aluno, Turma turma, String numero, String ativa) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
