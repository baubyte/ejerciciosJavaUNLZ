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
public class ejercicioN8 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Lee un número por teclado y un Carater y los convierte al");
    System.out.println("numero o al caracter que pertenece en la tabla ASCII");
    System.out.println("-------------------------------------------------------");
    System.out.print("Ingrese un Numero: ");
    int numACaracter = sc.nextInt();
    System.out.print("Ingrese un Caracter: ");
    char charANumero = sc.next().charAt(0);
    char caracter = (char)numACaracter;
    int codigo = (int)caracter;
    System.out.println("El Numero Ingresado es el Caracter: "+"\""+caracter+"\"");
    System.out.println("El Caracter Ingresado es el Codigo: "+"\""+codigo+"\"");
    System.out.println("------------------------------------------------------");
}
    
}
