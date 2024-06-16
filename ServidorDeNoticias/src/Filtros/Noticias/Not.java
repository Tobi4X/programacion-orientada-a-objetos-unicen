package Filtros.Noticias;

import Noticias.Noticia;

public class Not implements FiltroNoticia {

    private FiltroNoticia filtro;
    public Not(FiltroNoticia filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean find(Noticia noticia) {
        return !filtro.find(noticia);
    }
}
