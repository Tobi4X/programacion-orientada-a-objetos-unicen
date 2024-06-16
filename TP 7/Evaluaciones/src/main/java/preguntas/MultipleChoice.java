package preguntas;

import filter.Respuesta;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends Pregunta{
    private List<Object> respuestasPosibles;

    public MultipleChoice(String pregunta, Respuesta respuesta) {
        super(pregunta, respuesta);
        this.respuestasPosibles = new ArrayList<>();
        this.respuestasPosibles.add(respuesta);
    }

    //Cuando seteo la respuesta correcta tambien la agrego a la lista de posibles respuestas
    @Override
    public void setRespuesta(Respuesta respuesta) {
        this.respuestasPosibles.add(respuesta);
        super.setRespuesta(respuesta);
    }

    //Devuelvo para no bardear el encapsulamiento y esas huevadas
    public List<Object> getRespuestasPosibles() {
        return new ArrayList<>(this.respuestasPosibles);
    }

    public void setRespuestasPosibles(Object ... respuestasPosibles) {
        for (Object respuesta : respuestasPosibles) {
            this.respuestasPosibles.add(respuesta);
        }
    }

    public void verRespuestasPosibles(){
        for(int i = 0; i < this.respuestasPosibles.size(); i++){
            System.out.println(i + ". " + respuestasPosibles.get(i));
        }
    }

    //Cambio el metodo respuestas para que el bot que pasa la respuesta no bardee y pase una respuesta que ni esta en el multiplechoice
    @Override
    public String darRespuesta(Object respuesta) {
        int i, c;
        i = 0;
        c = 0;
        //si encuentra la respuesta recibida dentro de las posibles le suma 1 a c y por ende significa que la respuesta es posible
        while (i < respuestasPosibles.size() && c < 1) {
            if (respuesta.equals(respuestasPosibles.get(i))) c++;
            i++;
        }
        //Si es valida la envia a corroborar al super sino pide una valida
        if (c > 0) return super.darRespuesta(respuesta);
        else return "Elegi una opcion valida pavo" + "\n" + "Las respuestas validas son : " + getRespuestasPosibles();
    }
}
