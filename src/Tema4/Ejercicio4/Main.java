package Tema4.Ejercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaActores = new ArrayList<>();
        listaActores.add("Adela");
        listaActores.add("Red");
        listaActores.add("Fermin");
        listaActores.add("Julio");

        DvdCine KakatuasEnElTren=new DvdCine("Kakatuas en el tren","Julio Vereda","Yoda",
                listaActores,"Thriller","Todos mueren por las kakatuas",600);

        DvdCine RomanceEnYugoslavia=new DvdCine("Romance en Yugoslavia","Paula palestra","Yoda",
                listaActores,"Romance","Se enamoran y se casan los protas",700);

        System.out.println(KakatuasEnElTren.toString());

        if(KakatuasEnElTren.esThriller()){
            System.out.println("Kakatuas en el tren es Thriller");
        } else
            System.out.println("No es Thriller");

        System.out.println(RomanceEnYugoslavia.mimsaProductora(KakatuasEnElTren));
    }
}
