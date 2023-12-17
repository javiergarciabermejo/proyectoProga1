package dominio;

import java.io.Serializable;

public class Parcela implements Serializable{
    private String nombre;

    public Parcela(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Parcela{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
