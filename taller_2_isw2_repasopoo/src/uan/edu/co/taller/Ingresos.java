package uan.edu.co.taller;

import java.util.ArrayList;
import java.util.List;

public class Ingresos {

	 static List<Empresa> empresas = new ArrayList<Empresa>();
	 static List<Cliente> clientes = new ArrayList<Cliente>();
	 static List<Empleado> empleados = new ArrayList<Empleado>();

	// Iniciar Empresa 1
	private Empleado empleado1 = new Empleado("Alejandro", 28, 800000.00);
	private Empleado empleado2 = new Empleado("María", 22, 1500000.00);
	private Empleado empleado3 = new Empleado("Camilo", 23, 1100000.00);
	private Empleado empleado4 = new Empleado("karol", 21, 900000.00);
	// directivo 1 empresa 1
	private Empleado directivo1 = new Directivo("David", 25, 1600000.00, "Jefe Mercadería");
	// clientes empresa 1
	private Cliente cliente1 = new Cliente("Brayan", 22, "cocacola", 3285789);
	private Cliente cliente2 = new Cliente("Ángelica", 32, "cocacola", 3698521);
	private Cliente cliente3 = new Cliente("Alicia", 45, "cocacola", 7485968);
	private Cliente cliente4 = new Cliente("Oscar", 27, "cocacola", 6584795);
	private Cliente cliente5 = new Cliente("Carlos", 30, "cocacola", 2456987);

	// Iniciar Empresa 2
	private Empleado empleado12 = new Empleado("Fernando", 30, 736588.00);
	private Empleado empleado22 = new Empleado("Leonardo", 22, 1500000.00);
	private Empleado empleado32 = new Empleado("Diego", 23, 1100000.00);
	private Empleado empleado42 = new Empleado("Andrea", 21, 900000.00);
	// directivo 2 empresa 2
	Empleado directivo2 = new Directivo("Giseth", 21, 1650000.00, "Directora Proyectos");
	// clientes empresa 2
	private Cliente cliente1_2 = new Cliente("Brayan", 22, "pepsi", 3285789);
	private Cliente cliente2_2 = new Cliente("Ángelica", 32, "pepsi", 3698521);
	private Cliente cliente3_2 = new Cliente("Alicia", 45, "pepsi", 7485968);
	private Cliente cliente4_2 = new Cliente("Oscar", 27, "pepsi", 6584795);
	private Cliente cliente5_2 = new Cliente("Carlos", 30, "pepsi", 2456987);

	// Iniciar Empresa 3
	private Empleado empleado1_3 = new Empleado("Cesar", 30, 817700.00);
	private Empleado empleado2_3 = new Empleado("Leonardo", 22, 1500000.00);
	private Empleado empleado3_3 = new Empleado("Diego", 23, 1100000.00);
	private Empleado empleado4_3 = new Empleado("Andrea", 21, 900000.00);
	// directivo 3 empresa 3
	Persona directivo3 = new Directivo("Eliana", 31, 1700000.00, "Gerente de invenciones");
	// clientes empresa 2
	private Cliente cliente1_3 = new Cliente("Brayan", 22, "Corona", 3285789);
	private Cliente cliente2_3 = new Cliente("Ángelica", 32, "Corona", 3698521);
	private Cliente cliente3_3 = new Cliente("Alicia", 45, "Corona", 7485968);
	private Cliente cliente4_3 = new Cliente("Oscar", 27, "Corona", 6584795);
	private Cliente cliente5_3 = new Cliente("Carlos", 30, "Corona", 2456987);

	public void iniciarEmpresa1() {

		empleados.add(this.empleado1);
		empleados.add(this.empleado2);
		empleados.add(this.empleado3);
		empleados.add(this.empleado4);
		empleados.add(this.directivo1);

		clientes.add(this.cliente1);
		clientes.add(this.cliente2);
		clientes.add(this.cliente3);
		clientes.add(this.cliente4);
		clientes.add(this.cliente5);
	}

	public void iniciarEmpresa2() {
		
		empleados.add(this.empleado12);
		empleados.add(this.empleado22);
		empleados.add(this.empleado32);
		empleados.add(this.empleado42);
		empleados.add(this.directivo2);

		clientes.add(this.cliente2_2);
		clientes.add(this.cliente2_2);
		clientes.add(this.cliente2_2);
		clientes.add(this.cliente2_2);
		clientes.add(this.cliente2_2);
		

	}
	public void iniciarEmpresa3() {
		empleados.add(this.empleado1_3);
		empleados.add(this.empleado2_3);
		empleados.add(this.empleado3_3);
		empleados.add(this.empleado3_3);
		empleados.add((Empleado)this.directivo3);

		clientes.add(this.cliente3_3);
		clientes.add(this.cliente3_3);
		clientes.add(this.cliente3_3);
		clientes.add(this.cliente3_3);
		clientes.add(this.cliente3_3);
		
		
	}
	
	public void evaluarDirectivo() {
		calcularSalarioDirectivoMax(directivo1, directivo2, (Empleado) directivo3);
	}
	
	public void calcularSalarioDirectivoMax(Empleado a, Empleado b, Empleado c) {
		
		if(a.getSueldo_bruto() > b.getSueldo_bruto() && a.getSueldo_bruto() > c.getSueldo_bruto()) {
			System.out.println("El directivo con mayor salario es: "+ a.getNombre());
		}else if( b.getSueldo_bruto() > a.getSueldo_bruto() && b.getSueldo_bruto() > c.getSueldo_bruto()) {
			System.out.println("El directivo con mayor salario es: "+ b.getNombre());
		}else if( c.getSueldo_bruto() > a.getSueldo_bruto() && c.getSueldo_bruto() > b.getSueldo_bruto() ) {
			System.out.println("El directivo con mayor salario es: "+ c.getNombre());
		}
		
	}
	
	public void salarioInferior() {
		iniciarEmpresa1();
		darEmpresa((Empresa) this.empresas);
	}
	
	public void darEmpresa(Empresa e) {
		
		for(Empleado em: e.getEmpleados()) {
			System.out.println(e.getEmpleados());
		}
		
		
	}
	
	public void calcularSueldoInferiorEmpleados() {
		
		System.out.println("Los empleados con un salario inferior al minimo en todas las empresas son: ");
		for(int i=0; i<empleados.size(); i++) {
			if(empleados.get(i).getSueldo_bruto() < 828116.00) {
			System.out.println(empleados.get(i).getNombre());
			System.out.println("con salario: " + empleados.get(i).getSueldo_bruto());
			}
		}
		
	}

}
