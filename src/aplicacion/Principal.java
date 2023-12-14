
package aplicacion;

import dominio.*;

public class Principal{
    public static void main(String[] args) {

        Almendro almendroParcela = new Almendro("Almendro1", 50, 100, 0.8, 5);
        Olivar olivarParcela = new Olivar("Olivar1", 40, 20, 10);

        // Mostrar información de la parcela de almendros
        System.out.println("Nombre de la parcela: " + almendroParcela.getNombre());
        System.out.println("Número de árboles: " + almendroParcela.getNumeroArboles());
        System.out.println("Ingresos totales: " + almendroParcela.getIngresos());
        System.out.println("Gastos totales: " + almendroParcela.getGastos());
        System.out.println("Beneficios: " + almendroParcela.getBeneficios());
        System.out.println("Kilos de almendra: " + almendroParcela.getKilosAlmendra());
        System.out.println("Escandallo: " + almendroParcela.getEscandallo());
        System.out.println("Precio de almendra limpia: " + almendroParcela.getPrecioAlmendraLimpia());

        System.out.println(); // Separador

        // Mostrar información de la parcela de olivar
        System.out.println("Nombre de la parcela: " + olivarParcela.getNombre());
        System.out.println("Número de árboles: " + olivarParcela.getNumeroArboles());
        System.out.println("Ingresos totales: " + olivarParcela.getIngresos());
        System.out.println("Gastos totales: " + olivarParcela.getGastos());
        System.out.println("Beneficios: " + olivarParcela.getBeneficios());
        System.out.println("Arrobas de aceite: " + olivarParcela.getArrobasAceite());
        System.out.println("Precio de arroba de aceite: " + olivarParcela.getPrecioArrobaAceite());
    }
}
