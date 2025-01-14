/*1. Diseña un programa en Java que trabaje con una clase llamada Alumno. Serán
atributos del alumno su número de expediente, nombre, apellidos, fecha de nacimiento
y curso en el que se matricula. La clase debe incluir un constructor y los métodos get
y set correspondientes y toString. Instancia varios objetos de esta clase y prueba los
métodos creados*/

package Tema4.Ejercicio5;
import java.time.LocalDate;

public class Alumno {

private int numExpediente;
private String nombre;
private String apellidos;
private LocalDate fechaNacimiento;
private String cursoMatricula;
private double nota1;
private double nota2;

public Alumno(int numExpediente, String nombre, String apellidos, LocalDate fechaNacimiento, String cursoMatricula,double nota1,double nota2){

    this.numExpediente=numExpediente;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.fechaNacimiento=fechaNacimiento;
    this.cursoMatricula=cursoMatricula;
    this.nota1=nota1;
    this.nota2=nota2;
}

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCursoMatricula() {
        return cursoMatricula;
    }

    public void setCursoMatricula(String cursoMatricula) {
        this.cursoMatricula = cursoMatricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double mediaNotas (){
    return (nota1+nota2)/2;
    }

    public String devolver() {
        return "Numero de expediente: " + numExpediente + " Nombre: " + nombre   + " Nota media: " + mediaNotas();
    }

    @Override
    public String toString() {
        return "Numero de expediente: " + numExpediente + " Nombre: " + nombre + " Apellidos: " + apellidos +
                " Fecha de nacimiento: " + fechaNacimiento + " Curso al que matricula: " + cursoMatricula;
    }
}
