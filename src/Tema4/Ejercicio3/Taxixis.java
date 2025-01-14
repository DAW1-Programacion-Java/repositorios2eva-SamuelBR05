package Tema4.Ejercicio3;

public class Taxixis {
    private String matricula;
    private Distritos distrito;
    private TipoMotor tipoMotor;
    private double[] coordenadas;

    public Taxixis (String matricula,Distritos distritos, TipoMotor tipoMotor, double [] coordenadas){
        this.matricula=matricula;
        this.distrito=distritos;
        this.tipoMotor=tipoMotor;
        this.coordenadas=coordenadas;
    }

    public Taxixis (String matricula,Distritos distritos, TipoMotor tipoMotor){
        this.matricula=matricula;
        this.distrito=distritos;
        this.tipoMotor=tipoMotor;
        this.coordenadas=new double[] {0.0,0.0};
    }

    public String getMatricula() {
        return matricula;
    }

    public Distritos getDistrito() {
        return distrito;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public double[] getCoordenadas() {
        return coordenadas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDistrito(Distritos distrito) {
        this.distrito = distrito;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public boolean operanDistrito (Taxixis unTaxi){
        return this.distrito.equals(unTaxi.getDistrito());
    }

    public String coordenadasConjunto(){
        return "Longitud: " + coordenadas[0] + " Latitud: " + coordenadas[1];
    }
    @Override
    public String toString() {
        return "Matricula: " + matricula
                + "\nDistrito: " + distrito
                + "\nMotor: " + tipoMotor
                + "\nCoordenadas: " + coordenadasConjunto();
    }
}
