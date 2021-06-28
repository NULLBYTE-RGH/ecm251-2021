package vitor.joao.enums;

public enum Hora {
    REGULAR("regular"),
    EXTRA("extra");

    private final String descricao;
    /**
     * construtor da classe Hora
     * @param descricao string com descrição da hora
     */
    Hora(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Retorna a descrição
     */
    public String getDescricao() {
        return descricao;
    }
}
