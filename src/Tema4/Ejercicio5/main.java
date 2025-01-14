package Tema4.Ejercicio5;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Alumno primerAlumno= new Alumno(7777,"Samuel","Briones Rivera", LocalDate.of(2005,03,04),"Matematicas",6.4,8.2);
        Alumno segundoAlumno= new Alumno(3333,"Jesus","Jimenez Fermin", LocalDate.of(1900,01,21),"Lengua",7.4,3.2);


        System.out.println("La media de Jesus es: " + segundoAlumno.mediaNotas());

        System.out.println(primerAlumno.devolver());


    }
}
