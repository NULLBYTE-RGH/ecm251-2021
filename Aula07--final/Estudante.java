public class Estudante extends Pessoa{
    private String ra;

    public Estudante(String nome, String cpf, String ra) {
        super(nome, cpf);
        this.ra = ra;
    }

    public Estudante(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "ra=" + ra  +
                ", mudar=" + mudar +
                '}';
    }
}