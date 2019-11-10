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
public class ejercicioN18 {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int numeros[] = new int[10];
     boolean creciente = false, decreciente=false;
   System.out.println("Nos indica si los números ingresados están ordenado");
   System.out.println(" de forma creciente, decreciente, o desordenados ");
   System.out.println("---------------------------------------------------");
   
      for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese el "+(i+1)+"° Numero: ");
        numeros[i] = sc.nextInt();
      }
      for (int i = 0; i < 9; i++) {
          if (numeros[i] < numeros[i+1]) {
              creciente = true;
          }
          if (numeros[i] > numeros[i+1]) {
              decreciente=true;
          }
      }
      if (creciente==true && decreciente==false) {
        System.out.println("-----------------------------------------------");
        System.out.println("Los Numero Fueron Ingresados de Forma Creciente");
        System.out.println("-----------------------------------------------");
      }else if (creciente==false && decreciente==true) {
        System.out.println("------------------------------------------------");
        System.out.println("Los Numero Fueron Ingresados de Forma Decreciente");
        System.out.println("-------------------------------------------------");
          
      }else if (creciente==true && decreciente==true) {
        System.out.println("-------------------------------------------------");
        System.out.println("Los Numero Fueron Ingresados de Forma Desordenada");
        System.out.println("--------------------------------------------------");
          
      }else if (creciente==false && decreciente==false) {
        System.out.println("---------------------------------------");
        System.out.println("Los Numero Ingresados son todos Iguales");
        System.out.println("---------------------------------------");
          
      }
  }
}
