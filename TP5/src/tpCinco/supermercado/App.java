package tpCinco.supermercado;

import tpCinco.supermercado.impuesto.Impuesto;
import tpCinco.supermercado.impuesto.GravamenAltoProvincial;
import tpCinco.supermercado.impuesto.GravamenBajoNacional;

public class App {
    /* public static void main(String[] args) {

        Impuesto gravamenBajoProvincial = new Impuesto("Gravamen Bajo Provincial",10.0, 0.1);
        Impuesto gravamenBajoNacional = new GravamenBajoNacional("Gravamen Bajo Nacional",5.0, 0.25);
        Impuesto gravamenAltoProvincial = new GravamenAltoProvincial("Gravamen Alto Provincial",15.0, 0.6);
        Impuesto gravamenAltoNacional = new Impuesto("Gravamen Alto Nacional",10.0, 0.5);

        Factura factura = new Factura();
        Factura factura2 = new Factura();
        Factura factura3 = new Factura();
        Factura factura4 = new Factura();

        Descuento efectivo = new Descuento("Efectivo", 0.9);
        Descuento premio = new Descuento("Premio", 0.5);

        Producto leche = new Producto("Leche", 1000);
        Producto milei = new Producto("Milei", 2000);
        Producto fortnite = new Producto("Fortnite Battle Royale",3000);
        Producto steam = new Producto("Steam", 500);

        leche.setImpuesto(gravamenBajoNacional);
        milei.setImpuesto(gravamenAltoNacional);
        fortnite.setImpuesto(gravamenBajoProvincial);
        steam.setImpuesto(gravamenAltoProvincial);

        factura.agregarProducto(leche, 1);
        factura.setDescuento(efectivo);

        factura2.agregarProducto(milei, 1);
        factura2.setDescuento(premio);

        factura3.agregarProducto(fortnite, 1);

        factura4.agregarProducto(steam, 1);

        System.out.println(factura.toString());
        System.out.println(factura2.toString());
        System.out.println(factura3.toString());
        System.out.println(factura4.toString());

    }*/
}