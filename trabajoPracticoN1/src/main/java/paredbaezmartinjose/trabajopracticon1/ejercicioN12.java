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
public class ejercicioN12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String frase,fraseFinal;
    int opcion;
    System.out.println("Convierte la Frase Ingrsada a Mayûsculas o Minûsculas");
    System.out.println("           segûn la Opciôn Elegida");
    System.out.println("----------------------------------------------------");
    System.out.print("Introduce una frase: ");
    frase = sc.nextLine();
    do{
        System.out.println("1 - Convertir a Mayûsculas");
        System.out.println("2 - Convertir a Minûsculas");
        System.out.print("Ingrese una Opcion: ");
        opcion = sc.nextInt();
    }while(opcion !=1 && opcion !=2);
    switch (opcion){
        case 1:
            fraseFinal = frase.toUpperCase();
            System.out.println("Frase Ingresada a Mayûsculas: "+ fraseFinal);
        break;
        case 2:
            fraseFinal = frase.toLowerCase();
            System.out.println("Frase Ingresada a Minûsculas: "+ fraseFinal);
        break;
    }
  }
    
}
