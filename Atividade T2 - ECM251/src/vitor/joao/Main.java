package vitor.joao;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    Horario_Atual hora = new Horario_Atual();
	Sistema SYS = new Sistema(hora);
	SYS.Boas_Vindas();
        try {
            SYS.Login();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
