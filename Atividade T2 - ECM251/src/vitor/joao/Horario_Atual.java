package vitor.joao;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

import vitor.joao.enums.Hora;
import vitor.joao.interfaces.Apresentacao;

public class Horario_Atual implements Apresentacao{
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

    public Hora Mostrar(){
        return atual;
    }

    @Override
    public void Relatorio() throws IOException {

        BufferedReader csvReader = new BufferedReader(new FileReader("arquivo_super_Secreto_nao_abrir.csv"));
        String row;
        System.out.println("Relatorio de Usuarios :\n");
        while ((row = csvReader.readLine()) != null) {
            System.out.println(row);
        }
        csvReader.close();
        System.out.println("Escolha um Usuario para excluir:");
        Excluir();
    }



    public void Excluir() throws IOException {
        try {
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

            String lineToRemove = op + ";" + op2 + ";" + op3;
            String currentLine;

            int encontrado = 0;

            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();

            inputFile.delete();
            File file = new File("TempFile.csv");
            File file2 = new File("arquivo_super_Secreto_nao_abrir.csv");
            file.renameTo(file2);
        }
        catch (IOException e) {
            e.printStackTrace();
            Relatorio();

    }
}
}
