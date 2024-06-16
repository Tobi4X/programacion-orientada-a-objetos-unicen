public class Flor extends Planta {

    private String colorPetalos, cantPromedioPetalos, colorPistillo, variedadFlor;
    private Estacion estacionQueFlorece;

    public Flor() {
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getCantPromedioPetalos() {
        return cantPromedioPetalos;
    }

    public void setCantPromedioPetalos(String cantPromedioPetalos) {
        this.cantPromedioPetalos = cantPromedioPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public Estacion getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(Estacion estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }
    @Override
    public void decirQueSoy() {
        System.out.println("Hola soy una flor");
    }
}