package tpCinco.supermercadoFiltros;
import tpCinco.supermercadoFiltros.Descuentos.*;
import tpCinco.supermercadoFiltros.FiltrosProducto.CantidadMinima;
import tpCinco.supermercadoFiltros.FiltrosProducto.FilterProducto;
import tpCinco.supermercadoFiltros.Impuestos.*;
import tpCinco.supermercadoFiltros.Producto.*;
import tpCinco.supermercadoFiltros.Stock.Factura;
import tpCinco.supermercadoFiltros.Stock.Stock;

public class App {
    /* public static void main(String[] args) {
        //Impuestos
        Impuesto provincialBajo = new ICompuesto(new IPorcentual(10),new IFijo(0.1));
        Impuesto nacionalBajo = new ICompuesto(new IPorcentual(5),new IAnioPar(new IFijo(0.25)));
        Impuesto provincialAlto = new ICompuesto(new IPorcentual(15), new IDomingo(new IFijo(0.5)));
        Impuesto nacionalAlto = new ICompuesto(new IPorcentual(10), new IFijo(0.5));
        //Gravamenes
        Impuesto gravamenesBajos = new ICompuesto(provincialBajo,nacionalBajo);
        Impuesto gravamenesAltos = new ICompuesto(provincialAlto,nacionalAlto);

        //Descuentos
        Descuento efectivo = new DescuentoPorcentual(10);
        Descuento premio = new DescuentoPorcentual(50);

        //Productos
        Producto leche = new ProductoConGravamen("Leche", "Descripcion", 1500, 6, gravamenesBajos);
        Producto milei = new ProductoConGravamen("Milei", "Descripcion", 2500, 5, gravamenesAltos);
        Producto fortnite = new Producto("Fortnite Battle Royale","Descripcion", 3500, 4 );
        Producto steam = new Producto("Steam", "Descripcion", 500, 3 );

        //Facturas
        Factura factura1= new Factura();

        //Stock
        Stock stock = new Stock();
        stock.agregarProducto(leche, 10);
        stock.agregarProducto(milei, 10);
        stock.agregarProducto(fortnite, 10);
        stock.agregarProducto(steam, 10);

        //Hago la compra
        leche.setCantidad(9);
        milei.setCantidad(7);
        fortnite.setCantidad(8);
        steam.setCantidad(3);
        factura1.agregarProducto(leche);
        factura1.agregarProducto(milei);
        factura1.agregarProducto(fortnite);
        factura1.agregarProducto(steam);
        stock.finalizarCompra(factura1);

        //Filtros Productos
        FilterProducto minimo = new CantidadMinima(100, 2);
        FilterProducto minimo120 = new CantidadMinima(120, 2);
        FilterProducto minimo90 = new CantidadMinima(90, 2);
        FilterProducto minimo140 = new CantidadMinima(140, 2);

        //Testing
        factura1.setDescuento(efectivo);
        stock.finalizarCompra(factura1);
        factura1.setDescuento(premio);
        stock.finalizarCompra(factura1);


    }*/
}
