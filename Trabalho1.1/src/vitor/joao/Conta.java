package vitor.joao;

public class Conta {
    //Atributos das classe
    private Usuario usuario;
    private double saldo;
    private int id;

    public Conta(String nome, double saldoInicial, int id) {
        this.saldo = saldoInicial;
        this.id = id;
        this.usuario = new Usuario(nome);

    }

    //Métodos da classe
    public void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }




}
