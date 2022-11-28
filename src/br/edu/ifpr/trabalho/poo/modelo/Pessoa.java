package br.edu.ifpr.trabalho.poo.modelo;

public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String dataNascimento;
    protected String telefoneContato;

    public Pessoa(String nome, String endereco, String dataNascimento, String telefoneContato){
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefoneContato = telefoneContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    void imprimeDados(){

    }
}
