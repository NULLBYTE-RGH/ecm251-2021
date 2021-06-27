package vitor.joao;

//joao vitor quirino sarti 18.01224-8
//matheus rossini de souza 18.01060-0

public class Main {
    public static void main(String[] args) {

    Horario_Atual hora = new Horario_Atual();
	Sistema SYS = new Sistema(hora);
	SYS.Boas_Vindas();
        try {
            SYS.Login();
        } catch (Exception e) {
            SYS.Relatorio();
        }
    }




}
