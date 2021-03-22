package vitor.joao;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Titulo {
    private double valor;
    private String descricao;
    //Para guardar dados de data
    private LocalDate dataDeVencimento;
    private double jurosAoDia;

    public Titulo(double valor, String descricao, String dataDeVencimento, double jurosAoDia) {
        this.valor = valor;
        this.descricao = descricao;
        this.dataDeVencimento = LocalDate.parse(dataDeVencimento);
        this.jurosAoDia = jurosAoDia;
    }

    public double totalParaPagar(){
        if(!estaAtrasada()){
            return this.valor;
        } else {
            return calcularJuros();
        }
    }

    private double calcularJuros() {
        return this.valor + this.valor * this.jurosAoDia * dataDeVencimento.until(LocalDate.now(), DAYS);
    }

    private boolean estaAtrasada() {
        return LocalDate.now().isAfter(dataDeVencimento);
    }


}
