package tpCuatro.juegoCartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Jugador {
    private int numero;
    private Stack<Carta> cartasGanadas;
    private List<Carta> manoActual;

    public Jugador() {
        cartasGanadas = new Stack<>();
        manoActual = new ArrayList<>();

    }

    public Jugador(int numero) {
        this.numero = numero;
        cartasGanadas = new Stack<>();
        manoActual = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public Stack<Carta> getCartasGanadas() {
        Stack<Carta>copiaCartasGanadas = new Stack<>();
        copiaCartasGanadas.addAll(cartasGanadas);
        return copiaCartasGanadas;
    }

    public List<Carta> getManoActual() {
        List<Carta> copiaMano = new ArrayList<>();
        copiaMano.addAll(manoActual);
        return copiaMano;
    }
    public int devolverPuntos(){
        int puntos=0;
        for(Carta c : manoActual){
            puntos += c.getNum();
        }
        return puntos;
    }

    public void anadirManoActual(Carta carta) {
        manoActual.add(carta);
    }

    public void ganarCartas(List<Carta> cartas) {
        cartasGanadas.addAll(cartas);
    }

    public void limpiarMano() {
        manoActual.clear();
    }


}