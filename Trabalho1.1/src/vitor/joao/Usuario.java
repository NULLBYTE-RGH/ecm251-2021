package vitor.joao;

public class Usuario {
    public String nome;
    private String senha;
    private String email;

    //construtor
    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;

    }

    public Usuario(String nome) {

        this.nome = nome;
    }
}