package Tema4.Ejercicio3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        double [] coor={7777,9999};
        Taxixis primerTaxi=new Taxixis("2088AAA",Distritos.Oeste,TipoMotor.Diesel);
        Taxixis segundoTaxi= new Taxixis("7777BBB",Distritos.Sur,TipoMotor.Gasolina,coor);
        Taxixis tercerTaxi= new Taxixis("23523JNA",Distritos.Sur,TipoMotor.Gasolina,coor);

        System.out.println(primerTaxi.operanDistrito(segundoTaxi));
        System.out.println(segundoTaxi.coordenadasConjunto());
    }
}
