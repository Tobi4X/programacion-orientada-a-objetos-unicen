package TresAlarma;

public class Timbre {

    private Boolean encendido;

    public Timbre() {
        this.encendido = false;
    }

    public Boolean getEncendido() {
        return encendido;
    }

    public void hacerSonar(Boolean encendido) {
        this.encendido = encendido;
    }

}
