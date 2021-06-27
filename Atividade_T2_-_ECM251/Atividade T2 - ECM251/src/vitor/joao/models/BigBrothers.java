package vitor.joao.models;

import vitor.joao.Horario_Atual;
import vitor.joao.enums.Hora;

public class BigBrothers extends Membro{
    public String mensagem = "Sempre ajudando as pessoas membros ou não S2!";
    public String mensagemExtra = "...";

    public BigBrothers(String nome, String email, String funcao, int id) {
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
