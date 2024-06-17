package toCincoB.Candy;

import toCincoB.Candy.Fichas.*;
import toCincoB.Candy.FilterFichas.FilterFicha;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<Ficha> fichas;
    private int puntajeMinimo;

    public Tablero(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
        fichas = new ArrayList<>();
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void addFicha(Ficha ficha) {
        fichas.add(ficha);
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    private int totalFortalezas(){
        int totalFortalezas = 0;
        for (Ficha ficha : fichas) {
            totalFortalezas += ficha.getFortaleza();
        }
        return totalFortalezas;
    }

    private int totalDestruccion(){
        int totalDestruccion = 0;
        for (Ficha ficha : fichas) {
            totalDestruccion += ficha.getPoderDeDestruccion();
        }
        return totalDestruccion;
    }

    public int getDificultad(){
        if(fichas.size() > 0) return this.totalFortalezas() / this.totalDestruccion();
        return 0;
    }

    public List<Ficha> filtrarFichas(FilterFicha filtro){
        List<Ficha> lista = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if(filtro.find(ficha)) lista.add(ficha);
        }
        return lista;
    }


}
