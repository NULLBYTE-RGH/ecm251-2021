package vitor.joao.models;


import vitor.joao.Horario_Atual;
import vitor.joao.interfaces.PostarMensagem;

public abstract class Membro implements PostarMensagem {

    public String Nome;
    public String email;
    public String funcao;
    public int id;

    public Membro(String nome, String email, String funcao, int id) {
        Nome = nome;
        this.email = email;
        this.funcao = funcao;
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return email;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getId() {
        return id;
    }
}
