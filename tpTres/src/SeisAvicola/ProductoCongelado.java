package SeisAvicola;

import java.time.LocalDate;

public abstract class ProductoCongelado extends Producto{
    protected LocalDate fechaEnvasado;
    protected String codigoOSA;
    protected String granjaOrigen;
    protected double temperaturaMantenimiento;

    public ProductoCongelado(String nroLote, LocalDate fechaVencimiento, LocalDate fechaEnvasado, String codigoOSA, String granjaOrigen, double temperaturaMantenimiento) {
        super(nroLote, fechaVencimiento);
        this.fechaEnvasado = fechaEnvasado;
        this.codigoOSA = codigoOSA;
        this.granjaOrigen = granjaOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
}
