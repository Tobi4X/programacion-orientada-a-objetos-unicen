package filter;

import filter.logicos.compuesto.Or;
import preguntas.Pregunta;

public class Respuesta implements Filtro {
    Object o;

    public Respuesta(Object o) {
        this.o = o;
    }

    @Override
    public boolean check(Object o) {
        return this.o.equals(o);
    }
}
