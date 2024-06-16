package tpCuatro.sombreroSeleccionador;

public class CasaPura extends Casa{

    public CasaPura(int cantidadMaxima, String nombre) {
        super(cantidadMaxima, nombre);
    }

    @Override
    public boolean esAceptado(Alumno a) {
        boolean bandera = false;

        for (Alumno i: a.getFamiliares()){
            if (this.getAlumnos().contains(i)) bandera = true;
        }

        return super.esAceptado(a) && bandera;
    }
}
