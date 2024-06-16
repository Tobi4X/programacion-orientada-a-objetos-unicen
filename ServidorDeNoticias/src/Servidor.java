import Noticias.Noticia;
import Filtros.Noticias.FiltroNoticia;
import java.util.ArrayList;
import java.util.List;

public class Servidor {
    private List<Noticia> noticias;
    public Servidor() {
        noticias = new ArrayList<>();
    }

    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public List<Noticia> getNoticias(FiltroNoticia filtro) {
        List<Noticia> getNoticias = new ArrayList<>();
        for (Noticia noticia : noticias) {
            if(filtro.find(noticia)) getNoticias.add(noticia);
        }
        return getNoticias;
    }



}
