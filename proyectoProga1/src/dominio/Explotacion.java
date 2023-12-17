package dominio;

import java.util.ArrayList;

public class Explotacion {


    private String nombre;

    public Explotacion (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Explotacion" +
                "nombre='" + nombre + '\'' +
                '}';
    }


    private ArrayList<Parcela> parcelas;

    public Explotacion() {
        this.parcelas = new ArrayList<>();
    }

    public void annadirParcela(Parcela parcela) {


        parcelas.add(parcela);
    }





    
}