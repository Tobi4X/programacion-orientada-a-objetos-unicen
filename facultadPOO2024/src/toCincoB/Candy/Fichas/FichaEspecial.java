package toCincoB.Candy.Fichas;

public class FichaEspecial extends Ficha{

    public FichaEspecial(String nombre, int fortaleza, int espacio) {
        super(nombre, fortaleza, espacio, 0);
    }

    @Override
    public int getPoderDeDestruccion() {
        return fortaleza/espacio;
    }
}
