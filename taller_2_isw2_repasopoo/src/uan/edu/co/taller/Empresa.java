package uan.edu.co.taller;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
}
