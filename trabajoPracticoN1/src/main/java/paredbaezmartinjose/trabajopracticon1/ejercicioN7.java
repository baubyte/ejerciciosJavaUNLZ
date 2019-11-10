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
public class ejercicioN7 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Lee un número por teclado y muestra, el carácter");
        System.out.println("       al que pertenece en la tabla ASCII");
        System.out.println("------------------------------------------------");
        System.out.print("Ingrese un Numero: ");
        int numACaracter = sc.nextInt();
        char caracter = (char)numACaracter;
        System.out.println("El Numero Ingresado es el Caracter: "+"\""+caracter+"\"");
        System.out.println("------------------------------------------------");
    }
}
