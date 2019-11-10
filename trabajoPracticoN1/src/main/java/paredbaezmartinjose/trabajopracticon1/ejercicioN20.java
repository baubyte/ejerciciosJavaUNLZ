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
public class ejercicioN20 {
    public static void main(String[] args){
      int marco[][] = new int[8][6];
      
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (i==0 || i==7) {
                  marco[i][j]=1;
                }else if (j==0 || j==5) {
                  marco[i][j]=1;
                }else{
                  marco[i][j]=0;
                }
 
            }
        }
    System.out.println("----------------------------------------");
    System.out.println("Los Datos de la Matriz Marco son los Siguientes");
     for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 6; j++) {
            System.out.print(marco[i][j]+" | ");
            if ((j+1) == 6 ) {
              System.out.println();  
            }
         }     
      }
    }
}
