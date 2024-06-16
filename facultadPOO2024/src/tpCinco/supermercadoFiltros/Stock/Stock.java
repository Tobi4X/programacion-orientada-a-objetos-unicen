package tpCinco.supermercadoFiltros.Stock;

import tpCinco.supermercadoFiltros.FiltrosFacturas.FechaFactura;
import tpCinco.supermercadoFiltros.FiltrosFacturas.FilterFactura;
import tpCinco.supermercadoFiltros.FiltrosProducto.FilterProducto;
import tpCinco.supermercadoFiltros.Producto.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {
    Map<String, Integer> productos;
    List<Producto> productosObjetos;
    List<Factura> facturas;

    public Stock(){
        productos = new HashMap<String, Integer>();
        facturas = new ArrayList<Factura>();
    }

    public void agregarProducto(Producto producto, int cant){
        if (productos.containsValue(producto.getNombre())) {
            productos.put(producto.getNombre(), productos.get(producto.getNombre())+cant);
            productosObjetos.add(producto);
        }
        else {
            productos.put(producto.getNombre(), cant);
            productosObjetos.add(producto);
        }
    }

    public boolean comprarProducto(Producto p){
        if(p.getCantidad() <= productos.get(p.getNombre())){
            productos.put(p.getNombre(), productos.get(p.getNombre()) - p.getCantidad());
            return true;
        }
        else{
            System.out.println("No hay suficiente stock");
            return false;
        }
    }

    public void finalizarCompra(Factura f){
        List<Producto> listaFaltantes = new ArrayList<>();
        facturas.add(f.clonar());
        for(Producto p : f.getProductos()){
            if(!comprarProducto(p)) listaFaltantes.add(p.clonar());
        }
        if (listaFaltantes.size() > 0) System.out.println("Compra relizada con exito "+'\n'+ f.toString());
        else System.out.println("No hay suficiente stock de :"+'\n'+listaFaltantes);
    }

    public List<Factura> filtrarFacturas(FilterFactura filter){
        List<Factura> facturas = new ArrayList<>();
        for (Factura f : this.facturas){
            if(filter.find(f)) facturas.add(f);
        }
        return facturas;
    }

    public double dineroFacturadoFecha(LocalDate fechaInicial, LocalDate fechaFinal){
        double total = 0;
        while(!fechaInicial.isAfter(fechaFinal)){
            for (Factura f : this.filtrarFacturas(new FechaFactura(fechaInicial))) {
                total += f.subTotal();
            }
            fechaInicial = fechaInicial.plusDays(1);
        }
        return total;
    }

    public Producto productoMasFacturo(LocalDate fechaInicial, LocalDate fechaFinal){
        double total = 0;
        Producto producto = null;
        Map<Producto, Double> facturado = new HashMap<>();
        while(!fechaInicial.isAfter(fechaFinal)){
            for (Factura f : this.filtrarFacturas(new FechaFactura(fechaInicial))){
                for(Producto p : f.getProductos()){
                    facturado.put(p, facturado.get(p)+p.getImporteTotal());
                }
            }
        }
        for(Producto p : facturado.keySet()){
            if(facturado.get(p) > total) {
                producto = p;
                total = facturado.get(p);
            }
        }
        return producto;
    }

    public boolean consultarPorcentajeDelMinimo(FilterProducto filter, Producto p){
        p.setCantidad(productos.get(p.getNombre()));
        return filter.find(p);
    }

    /*public List<Producto> consultarEscasos(FilterProducto filter){
        List<Producto> productos = new ArrayList<>();
        for(String p : this.productos.keySet()){
            if(this.consultarPorcentajeDelMinimo(filter, p)) productos.add(p);
        }
        return productos;
    }*/

}
