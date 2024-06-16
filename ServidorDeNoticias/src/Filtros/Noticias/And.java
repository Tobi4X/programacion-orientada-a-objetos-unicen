package Filtros.Noticias;

import Noticias.Noticia;

public class And implements FiltroNoticia{
    private FiltroNoticia filtro;
    private FiltroNoticia filtro2;
    public And(FiltroNoticia filtro, FiltroNoticia filtro2) {
        this.filtro = filtro;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean find(Noticia noticia) {
        return filtro.find(noticia) && filtro2.find(noticia);
    }
}
