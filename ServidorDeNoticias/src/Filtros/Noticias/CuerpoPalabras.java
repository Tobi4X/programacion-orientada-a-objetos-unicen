package Filtros.Noticias;
import Noticias.Noticia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CuerpoPalabras implements FiltroNoticia {
    List<String> palabras;
    public CuerpoPalabras() {
        palabras = new ArrayList<String>();
    }
    public void cargarPalabra(String string) {
        palabras.add(string);
    }
    public void cargarPalabras(List<String> palabras) {
        for (String palabra : palabras) {
            this.palabras.add(palabra);
        }
    }

    @Override
    public boolean find(Noticia noticia) {
        return new HashSet<>(noticia.getCuerpo().getTextos()).containsAll(palabras);
    }


}
