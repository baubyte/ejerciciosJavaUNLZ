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
public class ejercicioN16 {
 public static void main(String[] args){
     
   Scanner sc = new Scanner(System.in);
    int codProduct, litrosProduct,ventaMayor600 = 0;
    float precioProduct,importeFactura,facturacionTotal = 0,cantLitrosCodProduct1 = 0; 
   
   System.out.println("   Facturacion de una Empresa de Venta de Desinfectantes ");
   System.out.println("La Factura Muesta Cod.Product Cant.Vendida en Lts y Precio en Lts");
   System.out.println("-----------------------------------------------------------------");
   
     for (int i = 0; i < 5; i++) {
       System.out.println("***Factura N°:"+(i+1)+"***");
       System.out.print("***Ingrese Cod. Producto: ");
       codProduct = sc.nextInt();
       System.out.print("***Ingrese Cantidad Litros: ");
       litrosProduct = sc.nextInt();
       System.out.print("***Ingrese Precio x Litro: ");
       precioProduct = sc.nextFloat();
       importeFactura = precioProduct*litrosProduct;
       facturacionTotal = facturacionTotal + importeFactura;
         if (codProduct == 1) {
           cantLitrosCodProduct1 = cantLitrosCodProduct1 +  litrosProduct;
         }
         if (importeFactura > 600) {
            ventaMayor600++;
         }
     }
    System.out.println("-------------------------------------------------------------------");
    System.out.println("La Facturacion Total de las 5 Facturas es: "+facturacionTotal);
    System.out.println("Cantidad de Litros del Cod. Producto 1 es: "+cantLitrosCodProduct1);
    System.out.println("Cantidad de Facturas con Facturacion Mayor a $600 : "+ventaMayor600);
    System.out.println("-------------------------------------------------------------------");
 }
}
