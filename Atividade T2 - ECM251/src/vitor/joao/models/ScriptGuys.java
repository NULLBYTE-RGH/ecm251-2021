package vitor.joao.models;

import vitor.joao.Horario_Atual;
import vitor.joao.enums.Hora;

public class ScriptGuys extends Membro{
    public String mensagem = "Happy Coding!";
    public String mensagemExtra = "MAsK_S0c13ty";

    public ScriptGuys(String nome, String email, String funcao, int id) {
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
