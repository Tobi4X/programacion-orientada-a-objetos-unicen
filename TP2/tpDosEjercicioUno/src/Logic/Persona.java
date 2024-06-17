package Logic;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
    //Data
    private String nombre, appellido, dni, sexo;
    private LocalDate fNacimiento;
    private double altura;
    private int peso, edad;

    //Constructor
    public Persona(String dni) {
        this.dni = dni;
        this.fNacimiento = LocalDate.of(2000,1,1);
        this.sexo = "Femenino";
        this.nombre = "N";
        this.appellido = "N";
        this.peso = 1;
        this.altura = 1;
        this.edad = this.getEdad();
    }

    public Persona(String nombre, String appellido, String dni) {
        this(dni);
        this.nombre = nombre;
        this.appellido = appellido;
    }

    public Persona(String nombre, String appellido, String dni, LocalDate fNacimiento) {
        this(nombre, appellido, dni);
        this.fNacimiento = fNacimiento;
        this.edad = this.getEdad();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public String getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public int getEdad(){
        return LocalDate.now().getYear() - this.fNacimiento.getYear();
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
        this.edad = this.getEdad();
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Methods
    public double calcIDM() {
        return (this.getPeso() / Math.pow(this.getAltura(),2));
    }

    public boolean estaEnForma() {
        return this.calcIDM() >= 18.5 && this.calcIDM() <= 25;
    }

    public boolean hoyEsCumpleaños(){
        return Objects.equals(this.fNacimiento, LocalDate.now());
    }

    public boolean puedeVotar(){
        return getEdad() >= 16;
    }

    public boolean esMayor(){
        return getEdad() >= 18;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", appellido='" + appellido + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fNacimiento=" + fNacimiento +
                ", altura=" + altura +
                ", peso=" + peso +
                ", edad=" + edad +
                '}';
    }
}
