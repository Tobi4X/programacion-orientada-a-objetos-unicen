public class Arbol extends Planta {
    private String variedad, tipoTronco, color, tipoHojas;
    private double radioTronco;

    public Arbol() {
    }

    @Override
    public void decirQueSoy() {
        System.out.println("Hola soy un arbol");
    }

}
