package vitor.joao.interfaces;

import vitor.joao.Horario_Atual;
import vitor.joao.enums.Hora;
import vitor.joao.enums.Membros;

public interface PostarMensagem {

    //Todos os membros devem ser capazes de implementar a interface
    //PostarMensagem
    public String Postar(Membros m, Horario_Atual h, String menssagem);
}
