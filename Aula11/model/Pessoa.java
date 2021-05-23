

public abstract class Pessoa {
    private String nome;
    private String cpf;

    /**
     * Método construtor da classe pessoa que inicializa seus parâmetros.
     * @param nome Nome atribuído a instância de pessoa.
     * @param cpf CPF atribuído a instância de pessoa, sempre deve existir.
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Método construtor alternativo para classe <strong>Pessoa</strong>. Inicializa o atribuito nome
     * com uma String "".
     * @param cpf CPF atribuído a instância de pessoa.
     */
    public Pessoa(String cpf) {
        this.nome = "";
        this.cpf = cpf;
    }

    /**
     * Getter do valor da nome da instância de Pessoa
     * @return O valor do atributo nome
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return O valor do atributo cpf
     */
    public String getCpf() {
        return cpf;
    }
}