package Filtros.Noticias;

import Noticias.Noticia;

public class MenorXPalabras implements FiltroNoticia {
    private int cantidad;
    public MenorXPalabras(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean find(Noticia noticia) {
        return noticia.getCuerpo().getTextos().size()<= cantidad ;
    }
}
