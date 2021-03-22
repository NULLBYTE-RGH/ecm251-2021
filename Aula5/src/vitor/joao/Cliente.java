package vitor.joao;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
