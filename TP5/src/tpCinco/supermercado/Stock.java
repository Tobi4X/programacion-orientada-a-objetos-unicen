package tpCinco.supermercado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {
    Map<Producto, Integer> productos;
    Map<LocalDate, List<Factura>> facturas;

    public Stock() {
        productos = new HashMap<>();
        facturas = new HashMap<>();
    }

    public double dineroFacturadoDia(LocalDate fecha){
        int total = 0;
        List<Factura> lista = facturas.get(fecha);
        if(lista == null) return 0;
        else {
            for(Factura f : lista){
                total += f.getSubtotal();
            }
        }
        return total;
    }

    public double dineroFacturadoRango(LocalDate fecha, LocalDate fecha2){
        int total = 0;
        while(fecha.isBefore(fecha2)){
            total += dineroFacturadoDia(fecha);
            fecha = fecha.plusDays(1);
        }
        return total;
    }

    public List<Producto> stockBajo(){
        List<Producto> lista = new ArrayList<>();
        for(Producto p : productos.keySet()){
            if(productos.get(p) <= 2) lista.add(p);
        }
        return lista;
    }


}
