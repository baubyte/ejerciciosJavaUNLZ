/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paredbaezmartinjose.trabajopracticon1;

/**
 *
 * @author BAUBYTE
 */
public class ejercicioN13 {
    public static void main(String[] args) throws InterruptedException {
        int horas = 0, minutos = 0, segundos = 0;
       while (true) {
          //Si HORA es menor le agregamos un 0 Ej 09
          if (horas < 10) {
              System.out.print("0");
          }
          //Mostramos las HORAS
          System.out.print(horas + ":");
          //Si MINUTO es menor le agregamos un 0 Ej 09
          if (minutos < 10) {
              System.out.print("0");
          }
          //Mostramos los MINUTOS
          System.out.print(minutos + ":");
          
          //Si SEGUNDO es menor le agregamos un 0 Ej 09
          if (segundos < 10) {
              System.out.print("0");
          }
          //Mostramos los SEGUNDOS
          System.out.println(segundos);
          //Sumamos un segundo
          segundos++;
          //Hacemos las Comprobaciones de los segundos/minutos/horas 
          if (segundos == 60) {
              //volvemos a 0
              segundos = 0;
              //y le sumamas 1 minuto
              minutos++;
              if (minutos == 60) {
                   //volvemos a 0
                  minutos = 0;
                  //y le sumamas 1 hora
                  horas++;
                  if (horas == 24) {
                      //volvemos a 0
                      horas = 0;
                  }
              }
          }

          Thread.sleep(1000);

      }

    }
    
}
