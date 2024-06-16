package tpCuatro.juegoCartas;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Mazo {
    private int cantidadDeCartas;
    private int numMax;
    private List<String> palos;
    private Stack<Carta> cartas;

    public Mazo(int numMax, List<String> palos) {
        cartas = new Stack<>();
        this.numMax = numMax;
        this.palos = palos;
        this.generarMazo();
        this.cantidadDeCartas = this.cartas.size();
    }

    private void generarMazo(){
        for(String palo : palos) {
            for (int i = 1; i < numMax; i++) {
                cartas.push(new Carta(palo, i));
            }
        }
    }

    public void eliminarCarta() {
        this.cartas.pop();
    }

    public void mezclarCartas(){
        Collections.shuffle(cartas);
    }

    public Stack<Carta> getCartas() {
        Stack<Carta> copiaCartas = new Stack<>();
        copiaCartas.addAll(cartas);
        return copiaCartas;
    }

}
