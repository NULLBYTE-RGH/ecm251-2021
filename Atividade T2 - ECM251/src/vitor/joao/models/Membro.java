package vitor.joao.models;


import vitor.joao.Horario_Atual;
import vitor.joao.interfaces.PostarMensagem;

public abstract class Membro{

    public String Nome;
    public String email;
    public String funcao;

    public abstract String MobileMembers(Horario_Atual h);

    public abstract String BigBrothers(Horario_Atual h);

    public abstract String HeavyLifters();
    public abstract String ScriptGuys();

}
