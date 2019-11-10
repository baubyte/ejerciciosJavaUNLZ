/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author BAUBYTE
 */
public class mostrar {
    public static void main(String[] args) {     
            auto miAuto1 = new auto("EDUARDO","FORD", "2017");
            auto miAuto2 = new auto("MIGUEL","AUDI", "2019");
		    miAuto1.consume(40);
		    miAuto1.consume(30);
		    miAuto1.consume(10);
		    miAuto2.consume(80);
		    miAuto2.consume(40);
		    miAuto2.consume(50);
		    miAuto1.ver();
		    System.out.println("El combustible que consumio el Auto de Eduardo fue " + miAuto1.obtenerConsumo() + " Lt");
		    miAuto2.ver();
		    System.out.println("El combustible que consumio el Auto de Miguel fue " + miAuto2.obtenerConsumo() + " Lt");
		    System.out.println("----------------------------------------------------------------------");
		    System.out.println("El Consumo total ha sido de " + auto.obtenerConsumoTotal() + " Lt");
		  }
}
