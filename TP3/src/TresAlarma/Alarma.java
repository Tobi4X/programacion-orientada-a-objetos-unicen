package TresAlarma;

import java.util.ArrayList;
import java.util.List;

public class Alarma {

    private List<Sensor> sensores;
    private Timbre timbre;
    private Luz luz;

    public Alarma() {
        this.sensores = new ArrayList<Sensor>();
        this.timbre = new Timbre();
        this.luz = new Luz();
    }

    public void activar(){
        this.timbre.hacerSonar(true);
        this.luz.setEncender(true);
    }

    public void desactivar(){
        this.timbre.hacerSonar(false);
        this.luz.setEncender(false);
    }

    public void agregarSensor(Sensor s){
        this.sensores.add(s);
    }

    public void comprobar(){
        Boolean bandera = false;
        for (Sensor s : this.sensores) {
           if (s.getMovimiento()) {
               this.activar();
               bandera = true;
           }
        }
        if (!bandera) this.desactivar();
    }

}
