package vitor.joao;

import java.util.Random;
import  vitor.joao.enums.Hora;

public class Horario_Atual {
    private Hora atual;

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public void Definir() {
        //Definir horario ao iniciar o sistema
        int Rand = getRandomNumberInRange(0, 1);
        if  (Rand ==0){
            atual =  Hora.REGULAR;
        }
        else
            atual =  Hora.EXTRA;
    }

    public void Alterar(Hora alterar){
        atual = alterar;
    }

    public Hora Mostar(){
        return atual;
    }
}
