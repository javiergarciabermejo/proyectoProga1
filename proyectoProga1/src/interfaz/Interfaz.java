package interfaz;

import java.util.ArrayList;
import dominio.*;
import java.io.*;
import java.util.Scanner;

public class Interfaz {
    
    private ArrayList<Parcela> parcelas;
    private Scanner sc = new Scanner(System.in);

    public Interfaz()
    {
        leer();
    }
    public void leer()
    {
        ObjectInputStream obj;
        File file = new File ("explotacion.txt");
            try
            {
                 obj = new ObjectInputStream(new FileInputStream(file));
                    try
                    {
                        parcelas=(ArrayList<Parcela>) obj.readObject();
                        obj.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error al abrir el archivo");
                        parcelas=new ArrayList<>();
                    }
            }
            catch(Exception e)
            {
                parcelas=new ArrayList<>();
            }

    }

    private void grabar()
    {
        ObjectOutputStream obj;
        File file = new File("explotacion.txt");
            try
            {
                obj = new ObjectOutputStream(new FileOutputStream(file));
                obj.writeObject(parcelas);
                    obj.close();
                System.out.println("Guardado");
            }
            catch(Exception e)
            {
                System.out.println("Error al guardar");
                System.out.println(e);
            }
    }




    private void annadirParcela()
    {
        System.out.println("Introduzca el nombre de la parcela:"); 
        String nombre = sc.nextLine();
        parcelas.add(new Parcela(nombre));
     
    }



    private void annadirOlivar() {
        System.out.println("Introduzca el nombre de la Parcela de Olivos");
        String nombre = sc.nextLine();
    
        System.out.println("Introduzca el número de árboles");
        int numeroArbolesOlivar = Integer.parseInt(sc.nextLine());
    
    
        System.out.println("Introduzca las arrobas de aceite");
        double arrobasAceite = Double.parseDouble(sc.nextLine());
    
        System.out.println("Introduzca el precio de arroba de aceite");
        double precioArrobaAceite = Double.parseDouble(sc.nextLine());

         System.out.println("Introduzca los ingresos del Olivar");
        double ingresosOlivar = Double.parseDouble(sc.nextLine());

        System.out.println("Introduzca los gastos del Olivar");
        double gastosOlivar = Double.parseDouble(sc.nextLine());

    
        
        parcelas.add(new Olivar(nombre,numeroArbolesOlivar, arrobasAceite, precioArrobaAceite, ingresosOlivar, gastosOlivar));
    }
    


    private void annadirAlmendro() {
        System.out.println("Introduzca el nombre de la Parcela de Almendros");
        String nombre = sc.nextLine();
    
        System.out.println("Introduzca el número de árboles");
        int numeroArbolesAlmendro = Integer.parseInt(sc.nextLine());
    
        // Aquí puedes introducir el resto de las variables específicas de Almendro
        System.out.println("Introduzca los kilos de almendra");
        double kilosAlmendra = Double.parseDouble(sc.nextLine());
    
        System.out.println("Introduzca el escandallo");
        double escandallo = Double.parseDouble(sc.nextLine());
    
        System.out.println("Introduzca el precio de almendra limpia");
        double precioAlmendraLimpia = Double.parseDouble(sc.nextLine());

        System.out.println("Introduzca los ingresos de Almendros");
        double ingresosAlmendro = Double.parseDouble(sc.nextLine());

         System.out.println("Introduzca los gastos del Almendro");
        double gastosAlmendro = Double.parseDouble(sc.nextLine());
    
    
        parcelas.add(new Almendro(nombre, numeroArbolesAlmendro, kilosAlmendra, escandallo, precioAlmendraLimpia,ingresosAlmendro, gastosAlmendro));
    }
    

    

    private void borrarParcela()
    {
        System.out.println("Nombre de la parcela a borrar: ");
        String n = sc.nextLine();
        Parcela p = new Parcela(n);
        int posicion = parcelas.indexOf(p);

        if (posicion == -1)
        {
            System.out.println("Parcela no encontrada");
        }
        else
        {
            parcelas.remove(posicion);
            System.out.println("Parcela borrada");
            System.out.println("Pulse <enter> para continuar");
            sc.nextLine();
        }
    }


     
    private String menu()
    {
        System.out.println("\n----------Menú----------");
        System.out.println("1. Agregar Parcela");
        System.out.println("2. Agregar Olivar");
        System.out.println("3. Agregar Almendro");
        System.out.println("4. Borrar Parcela");
        System.out.println("5. Mostrar Parcela");
        System.out.println("6. Salir");
       

        String opcion = sc.nextLine();
        return opcion;

    }

    public void ejecutar()
    {   String opcion;
        do
        {
             opcion = menu();
            switch (opcion) 
            {
                case "1":
                    annadirParcela();
                    break;

                case "2":
                    annadirOlivar();
                    break;
                    
                case "3":
                    annadirAlmendro();
                    break;

                case "4":
                    borrarParcela();
                    break;
                
                case "5":
                    mostrar();
                    break;

                case "6":
                    grabar();
                    break;

                default:
                System.out.println("opción incorrecta ");
                    break;
            }

        }while (! opcion.equals("6"));
        
    }




    public void mostrar()
    {
        System.out.println("Parcelas " + parcelas);
        System.out.println("Pulse <enter> para continuar");
        sc.nextLine();
        
    }
}