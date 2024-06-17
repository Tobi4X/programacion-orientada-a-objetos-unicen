package filter;

import preguntas.Pregunta;

public class PreguntaFilter implements Filtro{
    Pregunta pregunta;

    public PreguntaFilter(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public boolean check(Object o) {
        try {
            return ((Pregunta)o).equals(this.pregunta);
        } catch (Exception e) {
            return false;
        }
    }
}
