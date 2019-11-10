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
public class auto {

	  // atributo de clase
	  private static int consumoTotal = 0;
	  
	  public static int obtenerConsumoTotal() {
	    return auto.consumoTotal;
	  }
	  private String propietario;
	  private String marca;
	  private String modelo;
	  private int consumo;

	  public auto(String propietario,String marca, String modelo) {
            this.propietario = propietario;
	    this.marca = marca;
	    this.modelo = modelo;
	    this.consumo = 0;
	  }
	  
	  public int obtenerConsumo() {
	    return this.consumo;
	  }
          
	  public void consume(int con) {
	    this.consumo += con;
	    auto.consumoTotal += consumo;
	  }

		public void ver() {
			System.out.println("Propietario: "+propietario);
			System.out.println("Marca: "+marca);
			System.out.println("Modelo: "+modelo);
		}
	}