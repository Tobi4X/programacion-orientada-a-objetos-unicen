import java.util.ArrayList;
import java.util.List;
public class Banco {
    //Atributos
    private final String nombre;
    private final List<Cliente> listaClientes;

    //Contructor
    public Banco(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.listaClientes = new ArrayList<>();
        agregarCliente(cliente);

    }

    //Metodos
    public void agregarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    public Cliente cliente(int num){
        return this.listaClientes.get(num-1);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", listaClientes=" + listaClientes +
                '}';
    }
}
