package tpCuatro.sombreroSeleccionador;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static List<Casa> casas = new ArrayList<>();
    private static List<Alumno> alumnos = new ArrayList<>();

    public static void setearCasa(Alumno a){
        for (Casa c : casas){
            if (c.esAceptado(a)) a.setCasa(c);
        }
    }

    public static void main(String[] args) {
        Casa casa1 = new Casa(10, "casa 1");
        Casa casa2 = new Casa(20, "casa 2");
        Casa casa3 = new CasaPura(30, "casa 3");
        casas.add(casa1);
        casas.add(casa2);
        casas.add(casa3);

        Alumno alumno1 = new Alumno("alumno 1");
        Alumno alumno2 = new Alumno("alumno 2");
        Alumno alumno3 = new Alumno("alumno 3");
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);




    }
}
