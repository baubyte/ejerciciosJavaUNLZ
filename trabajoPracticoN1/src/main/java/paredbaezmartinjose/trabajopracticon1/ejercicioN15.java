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
public class ejercicioN15 {
 public static void main(String[] args){
     
   double estatura = 0,estaturaMedia = 0,edadMedia = 0, totalEstaturas = 0;
   int edad,totalEdades = 0,cantMayores = 0,cantEstaturaMayor = 0;
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Calcula la edad y la estatura media, la cantidad de mayores");
   System.out.println("de 18 años y la cantidad de alumnos que miden más de 1.75");
   System.out.println("-----------------------------------------------------------");
   
     for (int i = 0; i < 6; i++) {
          System.out.print("Ingrese la Edad del Alumno "+ (i+1)+": ");
          edad = sc.nextInt();
          totalEdades = totalEdades+edad;
          System.out.print("Ingrese la Eatatura del Alumno "+(i+1)+": ");
          estatura = sc.nextDouble();
          totalEstaturas = totalEstaturas+estatura;
         if (edad > 18) {
             cantMayores++;
         }
         if (estatura >(1.75)) {
             cantEstaturaMayor++;
         }
     }
     estaturaMedia = totalEstaturas/6;
     edadMedia = totalEdades/6;
    System.out.println("Edad Media de los Alumnos: "+edadMedia);
    System.out.println("Estatura Media de los Alumnos: "+estaturaMedia);
    System.out.println("Cantidad de Alumnos Mayores a 18: "+cantMayores);
    System.out.println("Cantidad de Alumnos con Estatura Mayor a 1.75: "+cantEstaturaMayor);
 }
    
}
