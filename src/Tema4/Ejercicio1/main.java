package Tema4.Ejercicio1;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Alumno primerAlumno = new Alumno(1,"Samuel","Briones Rivera", LocalDate.of(2005,04,03),"Matematicas");
        Alumno segundoAlumno = new Alumno(2,"Julio","Amante jj",LocalDate.of(1990,12,01),"Filosofia");

        System.out.println("El año de nacimiento de Samuel es: " + primerAlumno.getFechaNacimiento() + " y quiere estudiar " + primerAlumno.getCursoMatricula());

        System.out.println(segundoAlumno.toString());

    }
}
