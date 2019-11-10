/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paredbaezmartinjose.trabajopracticon1;
//Importo las Librerias
import java.util.Random;
/**
 *
 * @author BAUBYTE
 */
public class ejercicioN4 {
    static int limiteArray = 150;
    static int saltoLinea = 0;
    public static void main(String[] args){
	int[] arrayAleatorio = new int[limiteArray];
        System.out.println("LLena un Array Con 150 Numeros Aleatorios y Lo Muestra ");
        System.out.println("------------------------------------------------------ ");
	llenarArray(arrayAleatorio);
	mostrarArray(arrayAleatorio);
        System.out.println("------------------------------------------------------ ");
    }
    public static int[] llenarArray(int[] arrayAleatorio){

	for(int i=0;i<arrayAleatorio.length;i++){
	arrayAleatorio[i] = new Random().nextInt(40);
	}
            return arrayAleatorio;
    }
    public static void mostrarArray(int[] arrayAleatorio){
	for(int i=0;i<arrayAleatorio.length;i++){
            System.out.print(String.valueOf(arrayAleatorio[i])+"| ");
            saltoLinea++;
             if (saltoLinea == 10){
                 System.out.println();
                 saltoLinea = 0;
             }
	}

    }
}
