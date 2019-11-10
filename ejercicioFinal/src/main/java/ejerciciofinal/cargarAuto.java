/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;
/** IMPORTO LAS LIBRERIAS*/
import java.util.Scanner;
/**
 *
 * @author BAUBYTE
 */
public class cargarAuto {
     public static void main(String[] args)
     {
         auto[] nuevoAuto = new auto[3];
         Scanner sc = new Scanner(System.in);
         /** PARA CARGAR LOS AUTOS*/
         for (int i = 0 ;i < nuevoAuto.length; i++ )
         {
            System.out.println("----------------------------------------------------------------------");
            System.out.print("\nIngrese el Nombre del Propietario del Automovil N° " +(i+1)+":");
            String propietario = sc.nextLine();
            System.out.print("\nIngrese Marca del Automovil N° " +(i+1)+":");
            String marca = sc.nextLine();
            System.out.print("\nIngrese Modelo del Automovil N° " +(i+1)+":");
            String modelo = sc.nextLine();
            nuevoAuto[i] = new auto(propietario,marca,modelo);
            System.out.print("\nIngrese Consumo del Automovil N° " +(i+1)+":");
            int consumo = sc.nextInt();
            nuevoAuto[i].consume(consumo);
            sc.nextLine();
           System.out.println("----------------------------------------------------------------------");
         }
         /**PARA MOSTRAR LOS AUTOS*/
         for(int i=0; i < nuevoAuto.length; i++)
         {
            System.out.println("\nLos Datos del Automovil N° "+(i+1)+" son:");
            nuevoAuto[i].ver();	
	}
         System.out.println("----------------------------------------------------------------------");
        System.out.println("El Consumo total de todos los Automoviles fuema de " + auto.obtenerConsumoTotal() + " Lt");
     }
}
