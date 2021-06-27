package vitor.joao;

// lidar com exceçoes
// Quando isso
//acontece, é preciso retirar algum membro do sistema.

import vitor.joao.enums.Hora;
import vitor.joao.interfaces.PostarMensagem;
import vitor.joao.models.BigBrothers;
import vitor.joao.enums.Membros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Sistema{
    FileWriter fileWriter;{
        File arquivo = new File("arquivo_super_Secreto_nao_abrir.csv");
    }

    private final Horario_Atual horario;

    public Sistema(Horario_Atual hora) {
        //Definindo e setando hora atual
        hora.Definir();
        this.horario = hora;
    }

    public void Boas_Vindas(){
        //
        System.out.println("\t\t\t\t\t========MAsK_S0c13ty========");
        System.out.println("Horario atual :"+horario.Mostar());
    }

    public void MenuADM(){
        //opçoes e exibir horario
        System.out.println("\t\t\tMENU\t\t\t");
        System.out.println("1 - Cadastrar Membro");
        System.out.println("2 - Postar Mensagem");
        System.out.println("3 - Mostrar Horário de Trabalho");
        System.out.println("4 - Trocar horário de Trabalho");
        System.out.println("5 - Excluir Membro");
        System.out.println("0 - Encerrar Sistema");

    }

    public void Menu(){
        //opçoes e exibir horario
        System.out.println("\t\t\tMENU");
        System.out.println("1 - Postar Mensagem");
        System.out.println("2 - Mostrar Horário de Trabalho");
        System.out.println("0 - Sair");

    }

    public void Login(){
        System.out.println("\t\t\tLogin");
        System.out.println("Insira o email:\t");
        Scanner login = new Scanner(System.in);


    }

    public void Cadastro(){
        System.out.println("Digite o nome:");
        Scanner nome = new Scanner(System.in);
        String nome1 = nome.nextLine();

        System.out.println("Digite o email:");
        Scanner email = new Scanner(System.in);
        String email1 = email.nextLine();

        System.out.println("Digite a função:");
        System.out.println("1 - BigBrother");
        System.out.println("2 - HeavyLifter");
        System.out.println("3 - MobileMember");
        System.out.println("4 - ScriptGuy\n");
        Scanner scan = new Scanner(System.in);
        Membros funcao = null;
        int op = scan.nextInt();
        switch (op) {
            case 1:
                funcao = Membros.BIG;

            case 2:
                funcao = Membros.HEAVY;

            case 3:
                funcao = Membros.MOBILE;

            case 4:
                funcao = Membros.SCRIPT;
        }

        


        FileWriter excel = null;
        try {
            excel = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
            excel.append( nome + ";" + email + ";" + funcao + "\n");
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public String Mostar_Hora(){
        //Os membros também devem ser capazes de perguntarpara o sistema se ele está em horário normal de trabalho ou se
        //estão em horário de atividades “extras”

        String hora = "3:40";
            return hora;
    }
    public void Mudar_Hora(){

        //O sistema deve ser capaz
        //de mudar o horário de trabalho quando for solicitado.

    }
}



