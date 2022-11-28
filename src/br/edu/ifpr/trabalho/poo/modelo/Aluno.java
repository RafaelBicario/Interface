package br.edu.ifpr.trabalho.poo.modelo;

public class Aluno extends Pessoa{

    private int anoDeIngresso;

    public Aluno(String nome, String endereco, String dataNascimento, String telefoneContato, String anoDeIngresso) {
        super(nome, endereco, dataNascimento, telefoneContato);
        this.anoDeIngresso = anoDeIngresso;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }
}
