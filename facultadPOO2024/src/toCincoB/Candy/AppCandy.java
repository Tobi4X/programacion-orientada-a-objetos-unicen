package toCincoB.Candy;

import toCincoB.Candy.Fichas.*;
import toCincoB.Candy.FilterFichas.*;
import toCincoB.Candy.FilterFichas.Espacio.*;
import toCincoB.Candy.FilterFichas.Fortaleza.*;
import toCincoB.Candy.FilterFichas.PoderDestruccion.*;

public class AppCandy {
    public static void main(String[] args) {
        Ficha chocolate = new Ficha("Chocolate", 1, 1, 0);
        Ficha piedra = new Ficha("Piedra", 6, 1, 0);
        Ficha carameloRayas = new Ficha("Caramelo a Rayas", 1, 1, 10);
        Ficha torta = new Ficha("Torta", 4, 8, 4);
        Ficha especial = new FichaEspecial("Especial", 10, 5);

        Tablero tablero = new Tablero(100);

        tablero.addFicha(chocolate);
        tablero.addFicha(piedra);
        tablero.addFicha(carameloRayas);
        tablero.addFicha(torta);
        tablero.addFicha(especial);

        FilterFicha poder2 = new ByPoderDestruccionMayor(2);
        FilterFicha espacio4 = new ByEspacioMayor(4);
        FilterFicha fortaleza5 = new ByFortalezaMayor(5);

        System.out.println(tablero.filtrarFichas(poder2));
        System.out.println(tablero.filtrarFichas(espacio4));
        System.out.println(tablero.filtrarFichas(fortaleza5));


    }
}
