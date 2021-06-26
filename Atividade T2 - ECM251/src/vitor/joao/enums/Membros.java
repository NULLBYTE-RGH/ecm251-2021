package vitor.joao.enums;

public enum Membros {
    MOBILE("Mobile Members"),
    HEAVY("Heavy Lifters"),
    SCRIPT("Script Guys"),
    BIG("Big Brothers");

    private final String descricao;

    Membros(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
