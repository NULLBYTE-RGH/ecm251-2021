package vitor.joao;


import vitor.joao.enums.Hora;
import vitor.joao.interfaces.PostarMensagem;
import vitor.joao.enums.Membros;
import vitor.joao.models.Membro;

import java.io.*;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;


public class Sistema extends Membro implements PostarMensagem{
    private final Horario_Atual horario;

    public Sistema(Horario_Atual hora) {
        //Definindo e setando hora atual
        hora.Definir();
        this.horario = hora;
    }

    public void Boas_Vindas(){
        //
        System.out.println("\t\t\t\t\t========MAsK_S0c13ty========");
        System.out.println("Horario atual :"+horario.Mostrar());
    }

    public void MenuADM() throws IOException {
        while (true) {
            //opçoes e exibir horario
            System.out.println("\t\t\tMENU\t\t\t");
            System.out.println("1 - Cadastrar Membro");
            System.out.println("2 - Postar Mensagem");
            System.out.println("3 - Mostrar Horário de Trabalho");
            System.out.println("4 - Trocar horário de Trabalho");
            System.out.println("5 - Excluir Membro");
            System.out.println("0 - Encerrar Sistema");
            Scanner opcao = new Scanner(System.in);
            int op = opcao.nextInt();
            if (op == 1) {
                Cadastro();
            }
            if (op == 2) {
                Postar(Membros.BIG, horario);
            }
            if (op == 3) {
                horario.Mostrar();
            }
            if (op == 4) {
                if (horario.equals(Hora.REGULAR))
                    horario.Alterar(Hora.EXTRA);
                else horario.Alterar(Hora.REGULAR);
            }
            if (op == 5){Excluir();};

        }
    }

    public void Menu(String data) {
        while (true) {
            //opçoes e exibir horario
            System.out.println("\t\t\tMENU");
            System.out.println("1 - Postar Mensagem");
            System.out.println("2 - Mostrar Horário de Trabalho");
            System.out.println("0 - Sair");
            Scanner opcao = new Scanner(System.in);
            int op = opcao.nextInt();
            if (op == 1) {
                if (data.equals("MOBILE"))
                    Postar(Membros.MOBILE, horario);
                if (data.equals("HEAVY"))
                    Postar(Membros.HEAVY, horario);
                if (data.equals("SCRIPT"))
                    Postar(Membros.SCRIPT, horario);
            }
            if (op == 2) {
                horario.Mostrar();
            }
            if (op == 0) {
                try {
                    Login();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } //SAIR
            else {
                System.out.println("Opção Invalida");
            }


        }
    }

    public void Login() throws java.io.IOException {
        System.out.println("\t\t\tLogin");
        System.out.println("Insira o email:\t");
        Scanner login = new Scanner(System.in);
        String op = login.nextLine();
        BufferedReader csvReader = new BufferedReader(new FileReader("arquivo_super_Secreto_nao_abrir.csv"));
        String row;
        boolean logado = false;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(";");
            if(data[1].equals(op)){
                logado = true;
                System.out.println("\t   Bem vindo "+ data[0]);
                if(data[2].equals("BIG")){
                    MenuADM();
                }
                else{Menu(data[2]);}
            }

        }
        if (!logado)
        System.out.println("Boa tentativa White Hat!");
        csvReader.close();
    }


    public void Cadastro(){
        FileWriter fileWriter;{
            File arquivo = new File("arquivo_super_Secreto_nao_abrir.csv");
        }
        System.out.println("Digite o nome:");
        Scanner n = new Scanner(System.in);
        String nome = n.nextLine();

        System.out.println("Digite o email:");
        Scanner em = new Scanner(System.in);
        String email = em.nextLine();

        System.out.println("Digite a função:");
        System.out.println("1 - BigBrother");
        System.out.println("2 - HeavyLifter");
        System.out.println("3 - MobileMember");
        System.out.println("4 - ScriptGuy\n");
        Scanner scan = new Scanner(System.in);
        Membros funcao = null;
        int op = scan.nextInt();
        if (op ==1)
                funcao = Membros.BIG;
        if(op == 2)
                funcao = Membros.HEAVY;
        if(op == 3)
                funcao = Membros.MOBILE;
        if(op == 4)
                funcao = Membros.SCRIPT;

        FileWriter excel = null;
        try {
            excel = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
            excel.append( nome + ";" + email + ";" + funcao + "\n");
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Excluir() throws IOException {

        System.out.println("Insira o nome:\t");
        Scanner login = new Scanner(System.in);
        String op = login.nextLine();
        System.out.println("Insira o email:\t");
        Scanner login2 = new Scanner(System.in);
        String op2 = login2.nextLine();
        System.out.println("Insira o funcao:\t");
        Scanner login3 = new Scanner(System.in);
        String op3 = login3.nextLine();

        File inputFile = new File("arquivo_super_Secreto_nao_abrir.csv");
        File tempFile = new File("TempFile.csv");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String lineToRemove = op+";"+op2+";"+op3;
        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            String trimmedLine = currentLine.trim();
            if (trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        tempFile.delete(inputFile);
        boolean flag = tempFile.renameTo(inputFile);

    }


    @Override
    public String Postar(Membros m, Horario_Atual h) {
        String msg = null;
        if (m.equals(Membros.MOBILE)){msg = MobileMembers(h);}
        if (m.equals(Membros.BIG)){msg = BigBrothers(h);}
        if (m.equals(Membros.HEAVY)){msg = HeavyLifters(h);}
        if (m.equals(Membros.SCRIPT)){msg = ScriptGuys(h);}
        System.out.println(msg);
        return msg;
    }

    @Override
    public String MobileMembers(Horario_Atual h){
        String m = "Happy Coding!";
        String mExtra = "Happy_C0d1ng. Maskers";
        if(h.Mostrar().equals(Hora.REGULAR))
            return m;
        else return mExtra;
    }

    @Override
    public String BigBrothers(Horario_Atual h) {
        String m = "Sempre ajudando as pessoas membros ou não S2!";
        String mExtra = "...";
        if(h.Mostrar().equals(Hora.REGULAR))
            return m;
        else return mExtra;
    }

    @Override
    public String HeavyLifters(Horario_Atual h) {
        String m = "Podem contar conosco!";
        String mExtra = "N00b_qu3_n_Se_r3pita.bat";
        if(h.Mostrar().equals(Hora.REGULAR))
            return m;
        else return mExtra;
    }

    @Override
    public String ScriptGuys(Horario_Atual h) {
        String m = "Prazer em ajudar novos amigos de código!";
        String mExtra = "“QU3Ro_S3us_r3curs0s.py";
        if(h.Mostrar().equals(Hora.REGULAR))
            return m;
        else return mExtra;
    }
}



