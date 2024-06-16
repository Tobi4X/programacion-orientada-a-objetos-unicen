package SeisAvicola;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
    private LocalDate fechaEnvasado;
    private String granjaDeOrigen;

    public ProductoFresco(String nroLote, LocalDate fechaVencimiento, LocalDate fechaEnvasado, String granjaDeOrigen) {
        super(nroLote, fechaVencimiento);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaDeOrigen = granjaDeOrigen;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" +
                "fechaEnvasado=" + fechaEnvasado +
                ", granjaDeOrigen='" + granjaDeOrigen + '\'' +
                ", nroLote='" + nroLote + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}
