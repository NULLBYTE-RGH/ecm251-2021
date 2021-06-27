package vitor.joao.interfaces;

//Quando for preciso, é preciso exibir um relatório contendo as
//informações de cada um dos membros. Cada membro deve ser capaz
//de implementar a interface Apresentacao (de novo ele foi muito
//enfático na palavra INTERFACE), que deve permitir que ele se
//apresente quando o relatório for chamado

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Apresentacao {

    public void Relatorio() throws IOException;
}
