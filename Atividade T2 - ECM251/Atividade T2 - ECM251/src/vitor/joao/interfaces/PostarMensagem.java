package vitor.joao.interfaces;

import vitor.joao.Horario_Atual;
import vitor.joao.enums.Hora;
import vitor.joao.enums.Membros;

public interface PostarMensagem {

    //Todos os membros devem ser capazes de implementar a interface
    //PostarMensagem
    /**
     * Posta a menssagem de acordo com a função
     * @param m tipo de menbro
     * @param h periodo de trabalho REGULAR ou EXTRA
     * @param menssagem a menssagem a ser postada
     */
    String Postar(Membros m, Horario_Atual h, String menssagem);
}
