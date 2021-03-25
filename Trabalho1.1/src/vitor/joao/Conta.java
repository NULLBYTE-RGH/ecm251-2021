package vitor.joao;

//joao vitor quirino sarti  Ra = 18.01224-8
//mateus rossini Ra =

public class Conta {
    //Atributos das classe
    private Usuario usuario;

    private double saldo;
    public int idConta;

    //construtor
    public Conta(String nome, double saldoInicial, int idConta, String nome_Usuario, String senha, String email) {
        this.saldo = saldoInicial;
        this.idConta = idConta;
        this.usuario = new Usuario(nome_Usuario, senha, email);

    }

    //Métodos da classe

    public void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean Retirar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }


    public boolean Receber(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean FazerPagamento(Conta Pagador, Conta Recebedor , String QRCode) {
        String[] QR = QRCode.split(";");
        int valor = (Integer.parseInt(QR[2]));
        if(this.Retirar(valor)){                                               // se o valor a ser pago for menor do que o saldo da conta entao True
            Recebedor.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }


}
