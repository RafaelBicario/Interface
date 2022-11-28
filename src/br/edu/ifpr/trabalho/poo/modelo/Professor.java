package br.edu.ifpr.trabalho.poo.modelo;

public class Professor extends Pessoa {
    private String siape;


    public Professor(String nome, String endereco, String dataNascimento, String telefoneContato, String siape) {
        super(nome, endereco, dataNascimento, telefoneContato);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}
