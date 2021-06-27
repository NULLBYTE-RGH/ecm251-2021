package vitor.joao.enums;

public enum Hora {
    REGULAR("regular"),
    EXTRA("extra");

    private final String descricao;

    Hora(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
