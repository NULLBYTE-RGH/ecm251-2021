package vitor.joao;

//joao vitor quirino sarti  Ra = 18.01224-8
//mateus rossini Ra =

import java.util.Random;

public class Transacao {
    private boolean executarTransacao;
    private Usuario usuario;
    private Conta conta;
    private double valor;
    private int id;

    //construtor
    public Transacao(double valor, int id) {
        this.valor = valor;
        this.id = id;

    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String gerarCode(Usuario usuario, Conta conta, double valor){
        int Rand = getRandomNumberInRange(1000, 9999);
        return ((conta.idConta)+ ';' + (usuario.nome) + ';' + valor+ ';' + Rand);

    }

}
