package uan.edu.co.taller;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado{

	private String categoria;
	private List<Empleado> lista_empleados = new ArrayList<Empleado>();

	public Directivo(String nombre, Integer edad, Double sueldo_bruto, String categoria) {
		super(nombre, edad, sueldo_bruto);
		this.categoria = categoria;
	}
	
	public List<Empleado> getLista_empleados() {
		return lista_empleados;
	}

	public void setLista_empleados(List<Empleado> lista_empleados) {
		this.lista_empleados = lista_empleados;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void mostrar() {
		System.out.println("Soy la clase directivo...");
		super.mostrar();
	}
	
}
