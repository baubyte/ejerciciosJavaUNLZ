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
public class ejercicioN6 {
    public static void main(String[] args){
        int i,nFilas,nColumnas,nFilas1 = 0;//para la cantidad de meses
        
        float valorInicial = 10000;//valor incial
        float valorMesActual = 0;//donde se va guardando como incrementa el valor incial
        float incrementoValorIncial[][]= new float[12][6] ;
        
        float porcentajeInteres = 0;//intereses
        
       /*System.out.println(valorInicial);
        for (i = 2; i <=12 ; i++){  
           valorMesActual = valorInicial*porcentajeInteres10;
           System.out.println(valorMesActual);
           valorInicial = (float) valorMesActual;
            
        }*/
       System.out.println("Muestra como un saldo inicial de $10000 va creciendo anualmente en función de los intereses");
       System.out.println("-------------------------------------------------------------------------------------------- ");
       System.out.println("---10%-------11%-------12%-------13%-------14%-------15%---- ");
       
       for (nFilas = 0; nFilas<=11 ; nFilas++){ 
        for (nColumnas = 0; nColumnas <=5 ; nColumnas++){ 
            switch(nColumnas) {
                case 0:
                   porcentajeInteres = (float) 1.10;
                   if (nFilas > 0){
                   nFilas1 = nFilas -1;
                   valorInicial = (float) incrementoValorIncial[nFilas1][nColumnas];
                   }
                  break;
                case 1:
                   porcentajeInteres = (float) 1.11;
                   if (nFilas > 0){
                   nFilas1 = nFilas -1;
                   valorInicial = (float) incrementoValorIncial[nFilas1][nColumnas];
                   }
                   
                  break;
                case 2:
                   porcentajeInteres = (float) 1.12;
                   if (nFilas > 0){
                   nFilas1 = nFilas -1;
                   valorInicial = (float) incrementoValorIncial[nFilas1][nColumnas];
                   }
                   
                  break;
                case 3:
                   porcentajeInteres = (float) 1.13;
                   if (nFilas > 0){
                   nFilas1 = nFilas -1;
                   valorInicial = (float) incrementoValorIncial[nFilas1][nColumnas];
                   }
                   
                  break;
                case 4:
                   porcentajeInteres = (float) 1.14;
                   if (nFilas > 0){
                   nFilas1 = nFilas -1;
                   valorInicial = (float) incrementoValorIncial[nFilas1][nColumnas];
                   }
                   
                  break;
                case 5:
                   porcentajeInteres = (float) 1.15;
                   if (nFilas > 0){
                   nFilas1 = nFilas -1;
                   valorInicial = (float) incrementoValorIncial[nFilas1][nColumnas];
                   }
                   
                  break;
                default:
                  // code block
              }
            valorMesActual = valorInicial*porcentajeInteres;
            incrementoValorIncial[nFilas][nColumnas]= valorMesActual;
            System.out.print(incrementoValorIncial[nFilas][nColumnas]+" | ");
             if (nColumnas == 5){
                 System.out.println();
             }
          }
        }
    } 
    
}
