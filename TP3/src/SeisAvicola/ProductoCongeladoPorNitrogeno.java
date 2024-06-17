package SeisAvicola;

import java.time.LocalDate;

public class ProductoCongeladoPorNitrogeno extends ProductoCongelado{

    private String metodoDeCongelacion;
    private String tiempoDeExpocisionAlNitrogeno;

    public ProductoCongeladoPorNitrogeno(String nroLote, LocalDate fechaVencimiento, LocalDate fechaEnvasado, String codigoOSA, String granjaOrigen, double temperaturaMantenimiento, String metodoDeCongelacion, String tiempoDeExpocisionAlNitrogeno) {
        super(nroLote, fechaVencimiento, fechaEnvasado, codigoOSA, granjaOrigen, temperaturaMantenimiento);
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.tiempoDeExpocisionAlNitrogeno = tiempoDeExpocisionAlNitrogeno;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoPorNitrogeno{" +
                "metodoDeCongelacion='" + metodoDeCongelacion + '\'' +
                ", tiempoDeExpocisionAlNitrogeno='" + tiempoDeExpocisionAlNitrogeno + '\'' +
                ", fechaEnvasado=" + fechaEnvasado +
                ", codigoOSA='" + codigoOSA + '\'' +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                ", temperaturaMantenimiento=" + temperaturaMantenimiento +
                ", nroLote='" + nroLote + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}
