
package dominio;


public class Almendro extends Parcela {

    private double kilosAlmendra;
    private double escandallo;
    private double precioAlmendraLimpia;
    private int numeroArbolesAlmendro;
    private double gastosAlmendro;
    private double ingresosAlmendro;

    public Almendro(String nombre, int numeroArbolesAlmendro, double kilosAlmendra, double escandallo, double precioAlmendraLimpia, double ingresosAlmendro, double gastosAlmendro) {
        super(nombre);
        this.kilosAlmendra = kilosAlmendra;
        this.escandallo = escandallo;
        this.precioAlmendraLimpia = precioAlmendraLimpia;
        this.numeroArbolesAlmendro = numeroArbolesAlmendro;
        this.gastosAlmendro = gastosAlmendro;
        this.ingresosAlmendro = ingresosAlmendro;
        

    }



    public double getIngresosAlmendro() {
        return ingresosAlmendro;
    }

    public double getKilosAlmendra() {
        return kilosAlmendra;
    }

    public double getEscandallo() {
        return escandallo;
    }

    public double getPrecioAlmendraLimpia() {
        return precioAlmendraLimpia;
    }

    public int getNumeroArbolesAlmendro() {
        return numeroArbolesAlmendro;
    }


    public double getGastosAlmendro(){
        return gastosAlmendro;
    }



    @Override
    public String toString() {
        return "Almendro{" +
                "nombre='" + getNombre() + '\'' +
                ", numeroArbolesAlmendro=" + numeroArbolesAlmendro +
                ", kilosAlmendra=" + kilosAlmendra +
                ", escandallo=" + escandallo +
                ", precioAlmendraLimpia=" + precioAlmendraLimpia + ", ingresosAlmendro=" + ingresosAlmendro +
                ", gastosAlmendro=" + gastosAlmendro 
                ;
    }










    

    


}
