package sarti.vitor.joao;

import java.util.Random;

public class Basico03 {
    //Estruturas de repitiçao
    public static void main(String[] args) {
        int limite = 10;
        int contador;
        for(contador = 0 ;contador < limite; contador ++){
            System.out.println("Tendi:"+contador);
        }

        Random sorteador = new Random();
        int numero = sorteador.nextInt(1000);
        System.out.println("Numero " + numero);
        int senha = 123456;
        int tentativas = 0, chute;
        chute = sorteador.nextInt(999999);

        while (chute != senha){
            tentativas++;
            System.out.println(chute);
            System.out.println("Tentativa "+ tentativas);
            chute = sorteador.nextInt(999999);
        }
        System.out.println("Boa "+ tentativas);
    }
}
