/**
 * 
 */
package uan.edu.co.taller;

/**
 * @author Karol
 *
 */
public class Cliente extends Persona {
	
	private String nombre_empresa;
	private Integer telefono_contacto;
	
	public Cliente(String nombre, Integer edad, String nombre_empresa, Integer telefono_contacto) {
		super(nombre, edad);
		this.nombre_empresa = nombre_empresa;
		this.telefono_contacto = telefono_contacto;
		// TODO Auto-generated constructor stub
	}

	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}

	public Integer getTelefono_contacto() {
		return telefono_contacto;
	}

	public void setTelefono_contacto(Integer telefono_contacto) {
		this.telefono_contacto = telefono_contacto;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Soy la clase cliente...");
		super.mostrar();
	}
	

}
