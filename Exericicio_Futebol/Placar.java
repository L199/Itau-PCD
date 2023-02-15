package Exericicio_Futebol;

public class Placar {
    private String nometime1, nometime2;
    private int golsTime1, golsTime2;

    public Placar() {
        nometime1 = "Time da casa";
        nometime2 = "Visitante";
    }

    public Placar(String nometime1, String nometime2) {
        this.nometime1 = nometime1;
        this.nometime2 = nometime2;
    }

    public Placar(String nometime1, String nometime2, int golsTime1, int golsTime2) {
        this.nometime1 = nometime1;
        this.nometime2 = nometime2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public String exibir() {
        return nometime1 + " " + golsTime1 + " x " + golsTime2 + " " + nometime2;
    }

    public void teste(){

    }

}
