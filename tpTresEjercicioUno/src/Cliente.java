import javax.sound.midi.MidiMessage;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre, apellido, user, pass;
    private int dni, id;
    private List<CajaDeAhorro> cajasDeAhorro;

    public Cliente (int id, String nombre, String apellido, int dni, String user, String pass){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.user = user;
        this.pass = pass;
        this.cajasDeAhorro = new ArrayList<>();
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public String getUser() {
        return user;
    }

    private void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    private void setPass(String pass) {
        this.pass = pass;
    }

    public int getDni() {
        return dni;
    }

    public int getId() {
        return id;
    }
    public CajaDeAhorro getCajasDeAhorro(int num){
        return this.cajasDeAhorro.get(num-1);
    }

    //Metodos
    public void crearCuenta(CajaDeAhorro caja){
        this.cajasDeAhorro.add(caja);
    }
    public void eliminarCuenta(CajaDeAhorro caja){
        this.cajasDeAhorro.remove(caja);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", dni=" + dni +
                ", id=" + id +
                ", cajasDeAhorro=" + cajasDeAhorro +
                '}';
    }
}
