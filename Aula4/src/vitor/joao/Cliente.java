package vitor.joao;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Cliente{nome='" + this.nome + '\'' + ", sobrenome='" + this.sobrenome + '\'' + ", cpf='" + this.cpf + '\'' + '}';
    }
}

