package SeisAvicola;

import java.time.LocalDate;

public class ProductoCongeladoPorAire extends ProductoCongelado{
    private String porcentajeNitrogeno;
    private String porcentajeOxigeno;
    private String porcentajeDioxidoCarbono;
    private String porcentajeVaporDeAgua;

    public ProductoCongeladoPorAire(String nroLote, LocalDate fechaVencimiento, LocalDate fechaEnvasado, String codigoOSA, String granjaOrigen, double temperaturaMantenimiento, String porcentajeNitrogeno, String porcentajeOxigeno, String porcentajeDioxidoCarbono, String porcentajeVaporDeAgua) {
        super(nroLote, fechaVencimiento, fechaEnvasado, codigoOSA, granjaOrigen, temperaturaMantenimiento);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporDeAgua = porcentajeVaporDeAgua;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoPorAire{" +
                "porcentajeNitrogeno='" + porcentajeNitrogeno + '\'' +
                ", porcentajeOxigeno='" + porcentajeOxigeno + '\'' +
                ", porcentajeDioxidoCarbono='" + porcentajeDioxidoCarbono + '\'' +
                ", porcentajeVaporDeAgua='" + porcentajeVaporDeAgua + '\'' +
                ", fechaEnvasado=" + fechaEnvasado +
                ", codigoOSA='" + codigoOSA + '\'' +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                ", temperaturaMantenimiento=" + temperaturaMantenimiento +
                ", nroLote='" + nroLote + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}
