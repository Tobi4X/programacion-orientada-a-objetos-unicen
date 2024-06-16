package Noticias;

import Noticias.Elementos.Elemento;
import Noticias.Elementos.Texto;

import java.util.ArrayList;
import java.util.List;

public class Cuerpo {
    private int id;
    private List<Elemento> elementos;

    public Cuerpo(int id) {
        this.id = id;
        this.elementos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Elemento> getElementos() {
        List<Elemento> elementos = new ArrayList<>();
        elementos.addAll(this.elementos);
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos.addAll(elementos);
    }

    public void addElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }

    public List<Texto> getTextos() {

        List<Texto> textos = new ArrayList<>();

        for (Elemento elemento : this.elementos) {
            if (elemento instanceof Texto) {
                textos.add((Texto) elemento);
            }
        }

        return textos;
    }

}
