package SeisAvicola;

import java.time.LocalDate;

public class ProductoCongeladoPorAgua extends ProductoCongelado{

    private String salinidadDelAgua;

    public ProductoCongeladoPorAgua(String nroLote, LocalDate fechaVencimiento, LocalDate fechaEnvasado, String codigoOSA, String granjaOrigen, double temperaturaMantenimiento, String salinidadDelAgua) {
        super(nroLote, fechaVencimiento, fechaEnvasado, codigoOSA, granjaOrigen, temperaturaMantenimiento);
        this.salinidadDelAgua = salinidadDelAgua;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoPorAgua{" +
                "salinidadDelAgua='" + salinidadDelAgua + '\'' +
                ", fechaEnvasado=" + fechaEnvasado +
                ", codigoOSA='" + codigoOSA + '\'' +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                ", temperaturaMantenimiento=" + temperaturaMantenimiento +
                ", nroLote='" + nroLote + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}
