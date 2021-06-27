package vitor.joao.models;

import vitor.joao.Horario_Atual;
import vitor.joao.enums.Hora;

public class HeavyLifters extends Membro{

    public String mensagem = "Podem contar conosco!";
    public String mensagemExtra = "N00b_qu3_n_Se_r3pita.bat";

    public HeavyLifters(String nome, String email, String funcao, int id) {
        super(nome, email, funcao, id);
    }

    public String Postar(String mensagem, Horario_Atual h) {
        if (h.Mostar() == Hora.REGULAR){
            return mensagem;
        }
        else{
            return mensagemExtra;
        }

    }
}
