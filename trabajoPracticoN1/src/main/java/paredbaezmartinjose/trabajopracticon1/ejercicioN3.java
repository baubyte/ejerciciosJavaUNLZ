/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paredbaezmartinjose.trabajopracticon1;
//Importo las Librerias
import java.util.*;
/**
 *
 * @author BAUBYTE
 */
public class ejercicioN3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //creamos los arrays
        String[] nombresEmpleados = new String[10];
        double[] sueldosEmpleados = new double[10];

        //variables donde guardar el nombre y sueldo del empleado que más gana
        String nombreMayorSueldo;
        double mayorSueldo;

        int i = 0;

        //se lee el primer empleado
        System.out.println("Muestra el Nombre y el Sueldo del Empleado que más Gana ");
        System.out.println("------------------------------------------------------- ");
        System.out.println("Ingreso de Nombres y Sueldo de los Empleados: ");
        System.out.print("Nombre del Empleado " + (i + 1) + ": ");
        nombresEmpleados[i] = sc.nextLine();
        System.out.print("Sueldo del Empleado: ");
        sueldosEmpleados[i] = sc.nextDouble();

        //lo guardamos como el mayor sueldo para ir comparando
        mayorSueldo = sueldosEmpleados[i];
        nombreMayorSueldo = nombresEmpleados[i];

        //ingresamos el resto de los empleados 
        for (i = 1; i < nombresEmpleados.length; i++) {
            sc.nextLine(); //limpiar el buffer
            System.out.print("Nombre del Empleado " + (i + 1) + ": ");
            nombresEmpleados[i] = sc.nextLine();
            System.out.print("Sueldo del Empleado: ");
            sueldosEmpleados[i] = sc.nextDouble();
            //se compara el sueldo
            if (sueldosEmpleados[i] > mayorSueldo) {
                mayorSueldo = sueldosEmpleados[i];
                nombreMayorSueldo = nombresEmpleados[i];
            }
        }

        //muestro los resultados
        System.out.println("-------------------------------------------------");
        System.out.println("El Nombre del Empleado que mas Gana: " + nombreMayorSueldo );
        System.out.println("El Sueldo del Empleado que mas Gana: " + mayorSueldo);
        System.out.println("-------------------------------------------------");
    }
}
