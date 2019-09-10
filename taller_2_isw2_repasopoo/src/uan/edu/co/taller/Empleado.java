/**
 * 
 */
package uan.edu.co.taller;

/**
 * @author Karol
 *
 */
public class Empleado extends Persona{

	private Double sueldo_bruto;

	public Empleado(String nombre, Integer edad, Double sueldo_bruto) {
		super(nombre, edad);
		this.sueldo_bruto = sueldo_bruto;
	}
	
	public Empleado(String nombre, Integer edad, Double sueldo_bruto, String categoria) {
		super(nombre, edad);
		this.sueldo_bruto = sueldo_bruto;
		categoria = categoria;
	}

	public Double getSueldo_bruto() {
		return sueldo_bruto;
	}

	public void setSueldo_bruto(Double sueldo_bruto) {
		this.sueldo_bruto = sueldo_bruto;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Soy la clase Empleado...");
		super.mostrar();
	}
	
	public void calcular_salario_neto() {
		
	}
	
}
