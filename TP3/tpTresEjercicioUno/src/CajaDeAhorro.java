import java.util.List;

public class CajaDeAhorro {
    private int id;
    private double saldo;

    //Constructores

    public CajaDeAhorro(int id) {
        this.id = id;
        this.saldo = 0;
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos

    public void deposito (double monto)
    {
        this.saldo += monto;
    }
    public void extraccion (double monto)
    {
        if (saldo-monto >= 0)
            this.saldo -= monto;
        else System.out.println("No tenes plata idota");
    }

    @Override
    public String toString() {
        return "CajaDeAhorro{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
