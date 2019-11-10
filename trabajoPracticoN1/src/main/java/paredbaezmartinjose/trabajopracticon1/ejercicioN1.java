/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paredbaezmartinjose.trabajopracticon1;
// Importo las Librerias
import java.util.Scanner;
/**
 *
 * @author BAUBYTE
 */
public class ejercicioN1 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, contador=0;
        System.out.println("Contar los Numeros que Terminan en 2");
        System.out.println("-------------------------------------");
        System.out.println("Ingresa 0 para finalizar el programa.");
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        
        while(n > 0){
              if(n%10==2)  //Si el número termina en 2
                 contador++; //con esta se va sumando las numeros que terminan en 2
              System.out.print("Introduce un número entero: ");
              n = sc.nextInt();
        }
        System.out.println("Se han introducido " + contador + " números que Terminan en 2");
        System.out.println("--------------------------------------------------------------");
    }
    
}
