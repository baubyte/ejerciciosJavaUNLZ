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
public class ejercicioN10 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    boolean passCorrecto = false;
    int maxIntentos = 3;
    String passwordSys = "cosmeBonilla";
    System.out.println("Comprueba que la Contrasela Ingresada se la Correcta");
    System.out.println("----------------------------------------------------");
    for (int i=0;i<maxIntentos && !passCorrecto;i++){
       System.out.print("Ingrese la Contraseña: ");
        String passwordUser = sc.next();
        if(passwordUser.equals(passwordSys)){
          System.out.print("La Contraseña Ingresada es la Correcta");
          passCorrecto = true;
        }else {
            System.out.print("Cintraseña Incorreta, Intentos Disponibles: ");
            System.out.println(maxIntentos-i-1);
        }
    }
  }   
}
