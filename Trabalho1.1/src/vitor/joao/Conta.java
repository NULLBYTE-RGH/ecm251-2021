package vitor.joao;

//joao vitor quirino sarti  Ra = 18.01224-8
//mateus rossini Ra = 18.01060-0

public class Conta {
    //Atributos das classe
    public Usuario usuario;

    private double saldo;
    public String idConta;

    //construtor
    public Conta(String nome, double saldoInicial, String idConta, String senha, String email) {
        this.saldo = saldoInicial;
        this.idConta = idConta;
        this.usuario = new Usuario(nome, senha, email);

    }

    //Métodos da classe

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean Retirar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }


    public boolean receber(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean fazerPagamento(Conta Pagador, Conta Recebedor , String QRCode) {
        String[] QR = QRCode.split(";");
        int valor = (Integer.parseInt(QR[2]));
        if(Pagador.Retirar(valor)){                                               // se o valor a ser pago for menor do que o saldo da conta entao True
            Recebedor.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }


}