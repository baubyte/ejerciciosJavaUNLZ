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
public class ejercicioN14 {
  public static void main(String []args){
    int numeroAconvertir, unidad, decena;
    String unidadEnLetra = "", decenaMayorLetra = "", decenaMenorLetra = "";
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Convierte el Numero Ingresado a Letras");
    System.out.println("--------------------------------------");
    
    System.out.print("Ingresa un numero del 0 al 99: ");
    numeroAconvertir = sc.nextInt();
   
    decena = numeroAconvertir / 10;
    unidad = (numeroAconvertir % 10) / 1;
   
      switch (unidad) {
          case 0:
              unidadEnLetra = "Cero";
              break;
          case 1:
              unidadEnLetra = "Uno";
              break;
          case 2:
              unidadEnLetra = "dos";
              break;
          case 3:
              unidadEnLetra = "Tres";
              break;
          case 4:
              unidadEnLetra = "Cuatro";
              break;
          case 5:
              unidadEnLetra = "Cinco";
              break;
          case 6:
              unidadEnLetra = "Seis";
              break;
          case 7:
              unidadEnLetra = "Siete";
              break;
          case 8:
              unidadEnLetra = "Ocho";
              break;
          case 9:
              unidadEnLetra = "Nueve";
              break;
          default:
              break;
      }

    if (decena == 1 && unidad == 0){
      decenaMayorLetra = "Diez";
    }else if (decena == 1 && unidad == 1){
      decenaMayorLetra = "Once";
    }else if (decena == 1 && unidad == 2){
      decenaMayorLetra = "doce";
    }else if (decena == 1 && unidad == 3){
      decenaMayorLetra = "Trece";
    }else if (decena == 1 && unidad == 4){
      decenaMayorLetra = "Catorce";
    }else if (decena == 1 && unidad == 5){
      decenaMayorLetra = "Quince";
    }else if (decena == 1 && unidad == 6){
      decenaMayorLetra = "Dieciseis";
    }else if (decena == 1 && unidad == 7){
      decenaMayorLetra = "Diecisiete";
    }else if (decena == 1 && unidad == 8){
      decenaMayorLetra = "Dieciocho";
    }else if (decena == 1 && unidad == 9){
      decenaMayorLetra = "Diecinueve";   
    }
      switch (decena) {
          case 2:
              decenaMenorLetra = "Veinte";
              break;
          case 3:
              decenaMenorLetra = "Treinta";
              break;
          case 4:
              decenaMenorLetra = "Cuarenta";
              break;
          case 5:
              decenaMenorLetra = "Cincuenta";
              break;
          case 6:
              decenaMenorLetra = "Sesenta";
              break;   
          case 7:
              decenaMenorLetra = "Setenta";
              break;
          case 8:
              decenaMenorLetra = "Ochenta";
              break;
          case 9:
              decenaMenorLetra = "Noventa";
              break;
          default:
              break;
      }
   
    if (numeroAconvertir < 10){
      System.out.println("El numero es: "+ unidadEnLetra);
    }else if(numeroAconvertir < 20){
      System.out.println("El numero es: "+ decenaMayorLetra);
    }else if(numeroAconvertir < 100){
      if (numeroAconvertir % 10 == 0){
        System.out.println("El numero es: "+ decenaMenorLetra);
      }
      else{
        System.out.printf("El numero es: %s y %s\n",decenaMenorLetra,unidadEnLetra);
      }
    }
    System.out.println("--------------------------------------");
    }
}
