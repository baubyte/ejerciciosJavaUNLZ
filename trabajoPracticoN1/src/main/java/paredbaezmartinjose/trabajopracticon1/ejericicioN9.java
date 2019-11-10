/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paredbaezmartinjose.trabajopracticon1;
//Importo las Librerias
import java.util.Scanner;
/**
 *
 * @author BAUBYTE
 */
public class ejericicioN9 {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    int cantVentas,i = 1;
    float montoTotalVentas = 0,montoVenta;
    System.out.println("Calcula el Total de las Ventas Realizadas");
    System.out.println("de acuerdo a la cantidad de Ventas Ingresada");
    System.out.println("-------------------------------------------------------");
    System.out.print("Ingrese la Cantidad de Ventas: ");
    cantVentas = sc.nextInt();
    while (cantVentas >= i){
     System.out.print("Ingrese el Monto de la Venta Nº"+i+": ");
     montoVenta = sc.nextFloat();
     montoTotalVentas = montoTotalVentas + montoVenta; 
     i++;
    }
    System.out.println("El Monto Total de las Ventas es "+"\""+montoTotalVentas+"\"");
    System.out.println("-----------------------------------------------------------");
    }
}
