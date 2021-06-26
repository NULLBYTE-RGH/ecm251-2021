package vitor.joao;

// lidar com exceçoes
// Quando isso
//acontece, é preciso retirar algum membro do sistema.

import vitor.joao.enums.Hora;

public class Sistema{

    private final Horario_Atual horario;

    public Sistema(Horario_Atual hora) {
        //Definindo e setando hora atual
        hora.Definir();
        this.horario = hora;
    }

    public void Boas_Vindas(){
        //
        System.out.println(horario.Mostar());
    }

    public void Menu(){
        //opçoes e exibir horario
    }

    public void Login(){

    }

    public void Cadastro(){
        //Os integrantes devem ser cadastrados por
        //seus nomes de usuário, e-mail e função. O sistema deve ser capaz
        //de mudar o horário de trabalho quando for solicitado.

        //Os integrantes devem ser cadastrados por
        //seus nomes de usuário, e-mail e função. O sistema deve ser capaz
        //de mudar o horário de trabalho quando for solicitado.

        String nome;
        String email;
        String funcao;

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
