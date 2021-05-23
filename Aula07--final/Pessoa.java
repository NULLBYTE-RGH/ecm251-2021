public class Pessoa {
    private final String nome;
    private final String cpf;
    public int mudar;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String Ola(){
        return "Ola! Eu sou " + this.nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", mudar=" + mudar  +
                '}';
    }
}