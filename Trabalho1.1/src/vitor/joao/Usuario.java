package vitor.joao;

//joao vitor quirino sarti  Ra = 18.01224-8
//mateus rossini Ra = 18.01060-0

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