package vitor.joao;

public class Conta {
    private Cliente cliente;
    private double saldo;
    private int numero;

    public Cliente getCliente() {
        return this.cliente;
    }

    public int getNumero() {
        return this.numero;
    }

    public Conta(String nomeCliente, double saldoInicial) {
        this.saldo = saldoInicial;
        this.cliente = new Cliente(nomeCliente);
        this.numero = 1234;
    }

    public Conta(String nomeCliente, String cpf) {
        this.cliente = new Cliente(nomeCliente);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public void visualizarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    public String toString() {
        return "Conta{cliente=" + this.cliente.toString() + ", saldo=" + this.saldo + ", numero=" + this.numero + '}';
    }
}

