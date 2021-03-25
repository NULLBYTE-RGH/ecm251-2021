package vitor.joao;

import java.util.Random;

public class Transacao {
    private boolean executarTransacao;
    private Usuario usuario;
    private Conta conta;
    private double valor;

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    int id = getRandomNumberInRange(5, 10);

    public String gerarCode(Usuario usuario,Conta conta,double valor, int id){
        String s = ((this.usuario).toString() + ';' + (this.conta).toString() + ';' + (this.valor) + ';' + (this.id));
        String[] dados = s.split(";");
        return dados[0];
    }

}
