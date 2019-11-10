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
public class ejercicioN19 {
  public static void main(String[] args){
   int nFilas = 3,nColumnas = 3,sumarFilas, sumarColumnas;
   Scanner sc = new Scanner(System.in);
   int tabla[][] = new int[nFilas][nColumnas];
   
   System.out.println("Tabla de 10 x 10 Mostrar la Suma de Cada Fila y Columna");
   System.out.println("-------------------------------------------------------");
   
      for (int i = 0; i < nFilas; i++) {
          for (int j = 0; j < nColumnas; j++) {
               System.out.print("Cargar Datos Tabla {"+i+"}{"+j+"}:");
             tabla[i][j] = sc.nextInt();
    
          }  
      }
    System.out.println("----------------------------------------");
    System.out.println("Los Datos de la Tabla son los Siguientes");
     for (int i = 0; i < nFilas; i++) {
        for (int j = 0; j < nColumnas; j++) {
            System.out.print(tabla[i][j]+" | ");
            if ((j+1) == nColumnas ) {
              System.out.println();  
            }
         }     
      }
     System.out.println("--------------------------------------------------------");
      for (int i = 0; i < nFilas; i++) {
          sumarFilas = 0;
          for (int j = 0; j < nColumnas; j++) {
             sumarFilas += tabla[i][j];
          }
        System.out.println("El Resulatado de las Suma de la Fila {"+i+"}:"+sumarFilas);
      }
    System.out.println("--------------------------------------------------------");
    System.out.println();
    System.out.println("--------------------------------------------------------");
      for (int j = 0; j < nColumnas; j++) {
          sumarColumnas = 0;
          for (int i = 0; i < nFilas; i++) {
             sumarColumnas += tabla[i][j];
          }
        System.out.println("El Resulatado de las Suma de la Columna {"+j+"}:"+sumarColumnas);
      }
    System.out.println("--------------------------------------------------------");
  } 
}
