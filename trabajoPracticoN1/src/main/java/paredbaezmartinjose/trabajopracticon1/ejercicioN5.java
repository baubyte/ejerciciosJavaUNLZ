/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paredbaezmartinjose.trabajopracticon1;
//Importo las Librerias
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author BAUBYTE
 */
public class ejercicioN5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String frase;
       System.out.println("Cuenta el Numero de Palabras de una Frase ");
       System.out.println("----------------------------------------- ");
       System.out.print("Introduce una frase: ");
       frase = sc.nextLine();
       StringTokenizer st = new StringTokenizer(frase);
       System.out.println("Número de palabras: " + st.countTokens());
       System.out.println("----------------------------------------- ");
    }    
}
