package vitor.joao;

//joao vitor quirino sarti  Ra = 18.01224-8
//mateus rossini Ra = 18.01060-0

public class Main {
    public static void main(String[] args) {

        Conta um = new Conta("Cleber",1000,"1","macaco","cleber_macaco@maua.br");
        Conta dois = new Conta("Jose",250,"2","megasena","jose_megasena@maua.br");
        Conta tres = new Conta("Marcel",3000,"3","hala","marcel_hala@maua.br");
        Transacao QR1 = new Transacao(250);
        Transacao QR2 = new Transacao(1000);

        System.out.println("================================================");
        System.out.println("\t\t\tESTADO INICIAL: ");
        System.out.println("\t\tNome do usuário: "+ um.usuario.nome + "\n\t\tSaldo: " + um.getSaldo());
        System.out.println("------------------------------------------------");
        System.out.println("\t\tNome do usuário: "+ dois.usuario.nome + "\n\t\tSaldo: " + dois.getSaldo());
        System.out.println("------------------------------------------------");
        System.out.println("\t\tNome do usuário: "+ tres.usuario.nome + "\n\t\tSaldo: " + tres.getSaldo());
        System.out.println("================================================");


        QR1.gerarCode(um);                                  //Usuário 1 gera uma operação de recebimento de 250
        //System.out.println(QR1.gerarCode(um));

        dois.fazerPagamento(dois,um,QR1.gerarCode(um));     //Usuário 2 paga a requisição do usuário 1
        //System.out.println(um.getSaldo());
        //System.out.println(dois.getSaldo());

        tres.fazerPagamento(tres,um,QR1.gerarCode(um));     //Usuário 3 paga a requisição do usuário 1
        //System.out.println(um.getSaldo());
        //System.out.println(tres.getSaldo());

        dois.fazerPagamento(dois,um,QR1.gerarCode(um));     //Usuário 2 paga a requisição do usuário 1
        //System.out.println(um.getSaldo());
        //System.out.println(dois.getSaldo());

        QR2.gerarCode(dois);                                //Usuário 2 gera uma operação de recebimento de 1000
        //System.out.println(QR2.gerarCode(dois));

        tres.fazerPagamento(tres,um,QR1.gerarCode(um));     //Usuário 3 paga a requisição do usuário 2
        //System.out.println(um.getSaldo());
        //System.out.println(tres.getSaldo());

        System.out.println("\n================================================");
        System.out.println("\t\t\tESTADO FINAL: ");
        System.out.println("\t\tNome do usuário: "+ um.usuario.nome + "\n\t\tSaldo: " + um.getSaldo());
        System.out.println("------------------------------------------------");
        System.out.println("\t\tNome do usuário: "+ dois.usuario.nome + "\n\t\tSaldo: " + dois.getSaldo());
        System.out.println("------------------------------------------------");
        System.out.println("\t\tNome do usuário: "+ tres.usuario.nome + "\n\t\tSaldo: " + tres.getSaldo());
        System.out.println("================================================");



    }
}