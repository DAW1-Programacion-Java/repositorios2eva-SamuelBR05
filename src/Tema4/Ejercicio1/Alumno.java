/*1. Diseña un programa en Java que trabaje con una clase llamada Alumno. Serán
atributos del alumno su número de expediente, nombre, apellidos, fecha de nacimiento
y curso en el que se matricula. La clase debe incluir un constructor y los métodos get
y set correspondientes y toString. Instancia varios objetos de esta clase y prueba los
métodos creados*/

package Tema4.Ejercicio1;
import java.time.LocalDate;

public class Alumno {

private int numExpediente;
private String nombre;
private String apellidos;
private LocalDate fechaNacimiento;
private String cursoMatricula;

public Alumno (int numExpediente, String nombre, String apellidos, LocalDate fechaNacimiento, String cursoMatricula){

    this.numExpediente=numExpediente;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.fechaNacimiento=fechaNacimiento;
    this.cursoMatricula=cursoMatricula;
}

    // Getters
    public int getNumExpediente() {
        return numExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCursoMatricula() {
        return cursoMatricula;
    }

    // Setters
    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCursoMatricula(String cursoMatricula) {
        this.cursoMatricula = cursoMatricula;
    }



    @Override
    public String toString() {
        return "Numero de expediente: " + numExpediente + " Nombre: " + nombre + " Apellidos: " + apellidos +
                " Fecha de nacimiento: " + fechaNacimiento + " Curso al que matricula: " + cursoMatricula;
    }
}
