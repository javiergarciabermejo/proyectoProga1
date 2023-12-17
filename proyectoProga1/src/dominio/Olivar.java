package dominio;


public class Olivar extends Parcela{
    private double arrobasAceite;
    private double precioArrobaAceite;
    private int numeroArbolesOlivar;
    private double gastosOlivar;
private double ingresosOlivar;


    public Olivar(String nombre, int numeroArbolesOlivar, double arrobasAceite, double precioArrobaAceite ,double ingresosOlivar, double gastosOlivar) {
        super(nombre);
        this.arrobasAceite = arrobasAceite;
        this.precioArrobaAceite = precioArrobaAceite;
        this.numeroArbolesOlivar = numeroArbolesOlivar;
        this.gastosOlivar = gastosOlivar;
        this.ingresosOlivar = ingresosOlivar;
    }



    public double getArrobasAceite() {
        return arrobasAceite;
    }

    public double getPrecioArrobaAceite() {
        return precioArrobaAceite;
    }

    public int getNumeroArbolesOlivar() {
        return numeroArbolesOlivar;
    }

    public double getBeneficiosOlivar() {
        return ingresosOlivar - gastosOlivar;
    }

    
    public double getIngresosOlivar() {
        return ingresosOlivar;
    }


    public double getGastosOlivar() {
        return gastosOlivar;
    }

    @Override
    public String toString() {
        return "Olivar{" +
                "nombre='" + getNombre() + '\'' +
                ", numeroArbolesOlivar=" + numeroArbolesOlivar +
                ", arrobasAceite=" + arrobasAceite +
                ", precioArrobaAceite=" + precioArrobaAceite + ", ingresosOlivar" + ingresosOlivar +
                ", gastosOlivar=" + gastosOlivar
                ;
    }



}
