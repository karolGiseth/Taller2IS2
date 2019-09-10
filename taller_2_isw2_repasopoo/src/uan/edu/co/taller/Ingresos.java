package uan.edu.co.taller;

import java.util.ArrayList;
import java.util.List;

public class Ingresos {

	private static List<Empresa> empresas = new ArrayList<Empresa>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Empleado> empleados = new ArrayList<Empleado>();

	// Iniciar Empresa 1
	private Empleado empleado1 = new Empleado("Alejandro", 28, 817700.00);
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
	private Empleado empleado12 = new Empleado("Cesar", 30, 817700.00);
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
	private Cliente cliente1_3 = new Cliente("Brayan", 22, "pepsi", 3285789);
	private Cliente cliente2_3 = new Cliente("Ángelica", 32, "pepsi", 3698521);
	private Cliente cliente3_3 = new Cliente("Alicia", 45, "pepsi", 7485968);
	private Cliente cliente4_3 = new Cliente("Oscar", 27, "pepsi", 6584795);
	private Cliente cliente5_3 = new Cliente("Carlos", 30, "pepsi", 2456987);

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

	}

}
