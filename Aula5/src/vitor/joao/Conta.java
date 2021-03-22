package vitor.joao;


public class Conta {
    //Atributos das classe
    private Cliente cliente;
    private double saldo;
    private int numero;

    public Conta(String nome, double saldoInicial, int numero) {
        this.saldo = saldoInicial;
        this.numero = numero;
        this.cliente = new Cliente(nome);
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

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
