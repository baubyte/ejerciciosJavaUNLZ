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
public class ejercicioN17 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) { 
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                             System.out.print(i != 3 ? i: "E");
                             System.out.print(j != 3 ? "-"+j : "-E");
                             System.out.print(k != 3 ? "-"+k : "-E");
                             System.out.print(l != 3 ? "-"+l : "-E");
                             System.out.println(m != 3 ? "-"+m : "-E");
                        }
                    }
                }
            }
        }
    }
}
