public abstract class Planta {
    private String nombre;
    private double altoDelTallo;
    private boolean tieneHojas;
    private Clima climaIdeal;

    public Planta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public Clima getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(Clima climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public void decirQueSoy(){
    }

}
