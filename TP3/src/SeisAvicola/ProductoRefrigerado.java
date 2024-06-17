package SeisAvicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
    private String codigoOSA;
    private LocalDate fechaEnvasado;
    private double temperaturaRecomendada;
    private String granjaOrigen;

    public ProductoRefrigerado(String nroLote, LocalDate fechaVencimiento, String codigoOSA, LocalDate fechaEnvasado, double temperaturaRecomendada, String granjaOrigen) {
        super(nroLote, fechaVencimiento);
        this.codigoOSA = codigoOSA;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" +
                "codigoOSA='" + codigoOSA + '\'' +
                ", fechaEnvasado=" + fechaEnvasado +
                ", temperaturaRecomendada=" + temperaturaRecomendada +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                ", nroLote='" + nroLote + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }

}
