package Tema4.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        int [] dur={1,30};

        DvdCine KakatuasEnElTren=new DvdCine("Kakatuas en el tren","Julio Vereda","Yoda",
                "Fermin Trujillo y Agustin Palacios","Thriller","Todos mueren por las kakatuas",dur);

        DvdCine RomanceEnYugoslavia=new DvdCine("Romance en Yugoslavia","Paula palestra","Yoda",
                "Enrique Pastor y Hector Jimenez","Romance","Se enamoran y se casan los protas",dur);

        System.out.println(KakatuasEnElTren.toString());

        System.out.println(KakatuasEnElTren.esThriller());

        System.out.println(RomanceEnYugoslavia.mimsaProductora(KakatuasEnElTren));
    }
}
