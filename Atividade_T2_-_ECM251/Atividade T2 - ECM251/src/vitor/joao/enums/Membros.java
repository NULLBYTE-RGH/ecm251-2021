package vitor.joao.enums;

public enum Membros {
    MOBILE("Mobile Members: gerenciam postagens em redes sociais.\n" +
            "Seus postos variam de acordo com o momento do dia. Durante\n" +
            "as atividades regulares, todos eles devem assinar as\n" +
            "postagens com “Happy Coding!”. Durante as atividades\n" +
            "“extras” da “MAsK_S0c13ty”, eles devem assinar os posts\n" +
            "como “Happy_C0d1ng. Maskers”"),
    HEAVY("Heavy Lifters: São os responsáveis por manter os\n" +
            "repositórios. Cada vez que mandam uma solicitação de push,\n" +
            "assinam elas com “Podem contar conosco!”, durante atividade\n" +
            "regular ou como “N00b_qu3_n_Se_r3pita.bat”, nas horas\n" +
            "“extras”"),
    SCRIPT("Script Guys: fazem os primeiros contatos com novos\n" +
            "clientes. As suas mensagens são “Prazer em ajudar novos\n" +
            "amigos de código!”, quando estão vestindo roupas sociais\n" +
            "leves e tomando um café da “*” Coffe Shop. Ou são assinadas\n" +
            "como “QU3Ro_S3us_r3curs0s.py”, quando em suas cavernas\n" +
            "pessoais, com seus achocolatados"),
    BIG("Big Brothers: estão assinam suas mensagens com “Sempre\n" +
            "ajudando as pessoas membros ou não S2!”, quando vestidos de\n" +
            "pessoas carinhosas. Já quando estão levando as interações\n" +
            "de sua companhia, são tão terríveis que apenas assinam\n" +
            "“...”, para dar ainda mais suspense no coração de quem\n" +
            "recebeu tal mensagem");

    private final String descricao;

    Membros(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
