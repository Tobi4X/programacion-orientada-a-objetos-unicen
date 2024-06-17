package tpCuatro.juegoCartas;

public class Carta {
    private String palo;
    private int num;

    public Carta(String palo, int num) {
        this.palo = palo;
        this.num = num;
    }
    public String getPalo() {
        return palo;
    }
    public int getNum() {
        return num;
    }

}
