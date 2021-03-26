package vitor.joao;

//joao vitor quirino sarti  Ra = 18.01224-8
//mateus rossini Ra = 18.01060-0

import java.util.Random;

public class Transacao {
    private boolean executarTransacao;
    private Usuario usuario;
    private Conta conta;
    private int valor;
    private int id;

    //construtor
    public Transacao(int valor) {
        this.valor = valor;

    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String gerarCode(Conta conta){
        int Rand = getRandomNumberInRange(1000, 9999);
        return ((conta.idConta) + ';' + (conta.usuario.nome) + ';' + valor + ';' + Rand);

    }

}