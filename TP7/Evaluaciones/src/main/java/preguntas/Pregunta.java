package preguntas;

import filter.Filtro;
import filter.Respuesta;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    private String pregunta;
    private Respuesta respuesta;
    private List<Object> historial;

    public Pregunta(String pregunta, Respuesta respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.historial = new ArrayList<>();
    }

    //Get y Set preguntas.Pregunta
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    //Get y Set Respuesta
    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    //Get Historial

    public List<Object> getHistorial() {
        return new ArrayList<>(this.historial);
    }

    // Metodos

    //Agrega la respuesta al historialderespuestas y luego checkea si es correcta
    public String darRespuesta(Object o){
        historial.add(o);

        if(respuesta.check(o))
            return "Respuesta Correcta";
        else
            return "Respuesta Incorrecta";
    }

    //Recibe la respuesta de la cual se espera conocer la cantidad de veces que se dio y revisa cuantas veces aparece en el historial
    public int getCantRespuestasObtenidasDe(Filtro... respuesta){
        int c = 0;
        for (Object o : historial){
            for (Filtro f : respuesta){
                if (f.check(o)) c++;
            }
        }
        return c;
    }

    public double getPorcentaje(Filtro respuesta){
        int c = getCantRespuestasObtenidasDe(respuesta);
        return ((double)c / (double)historial.size() )* 100;
    }


}
