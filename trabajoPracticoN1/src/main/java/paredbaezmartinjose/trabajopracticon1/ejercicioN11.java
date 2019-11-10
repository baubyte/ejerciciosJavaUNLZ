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
public class ejercicioN11 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String frase;
    int contadorVocales =0,cantVocalA = 0,cantVocalE = 0,cantVocalI = 0,cantVocalO = 0,cantVocalU = 0;
    System.out.println("Cuenta la Cantidad de Vocales en la Fase Ingresada y");
    System.out.println("           la cantidad de cada Vocal");
    System.out.println("----------------------------------------------------");
    System.out.print("Introduce una frase: ");
    frase = sc.nextLine();
    for (int i = 0;i<frase.length();i++){
        if(frase.charAt(i)=='a' || frase.charAt(i)=='A'){
            contadorVocales++;
            cantVocalA++;
        }else if(frase.charAt(i)=='e' || frase.charAt(i)=='E'){
            contadorVocales++;
            cantVocalE++;
        }else if(frase.charAt(i)=='i' || frase.charAt(i)=='I'){
            contadorVocales++;
            cantVocalI++;
        }else if(frase.charAt(i)=='o' || frase.charAt(i)=='O'){
            contadorVocales++;
            cantVocalO++;
        }else if(frase.charAt(i)=='u' || frase.charAt(i)=='U'){
            contadorVocales++;
            cantVocalU++;
        }
    }
    System.out.println("Número de Vocales en la Frase es : " +contadorVocales);
    System.out.println("Número de Vocales \"A\"en la Frase es : " +cantVocalA);
    System.out.println("Número de Vocales \"E\"en la Frase es : " +cantVocalE);
    System.out.println("Número de Vocales \"I\"en la Frase es : " +cantVocalI);
    System.out.println("Número de Vocales \"O\"en la Frase es : " +cantVocalO);
    System.out.println("Número de Vocales \"U\"en la Frase es : " +cantVocalU);
    System.out.println("--------------------------------------------------- ");
  }
}
