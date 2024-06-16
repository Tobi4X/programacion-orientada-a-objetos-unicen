package tpCinco.camiones;

import tpCinco.camiones.elementos.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Cola {
    private List<Elemento> elementos;

    public Cola() {
        elementos = new ArrayList<Elemento>();
    }

    public void agregar(Elemento elemento){
        if (elementos.size() > 0){
            int i = 0;
            while ((i < elementos.size()) & (!elementos.contains(elemento))) {
                if (elementos.get(i).comparar(elemento)) elementos.add(i, elemento);
                i++;
            }
        }
        else elementos.add(elemento);
    }

    public void eliminar(Elemento elemento){
        elementos.remove(elemento);
    }

    public List<Elemento> obtener(){
        List<Elemento> copy = new ArrayList<>();
        for(Elemento elemento : elementos){
            copy.add(elemento.clonar());
        }
        return copy;
    }

}
