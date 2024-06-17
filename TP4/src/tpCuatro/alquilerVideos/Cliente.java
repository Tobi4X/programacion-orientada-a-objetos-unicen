package tpCuatro.alquilerVideos;

public class Cliente {
    //Atributos
    private int dni;
    private int telefono;
    private String nombre, apellido, correo, user, pass;

    //Constructor
    public Cliente(int dni, int telefono, String nombre, String apellido, String correo, String user, String pass) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.user = user;
        this.pass = pass;
    }

    //Getter
    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    //Setters
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
