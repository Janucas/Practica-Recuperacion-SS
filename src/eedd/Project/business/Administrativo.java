package eedd.Project.business;

import java.util.Date;

/**
 * Clase Administrativo
 * @author Juanan
 *
 */

public class Administrativo extends PuestoTrabajo {

	//Declaramos los atributos
	String categoria;
	
	
	public Administrativo () {
		super();
	}

	public Administrativo(String nombre, String apellidos, String dni, Date fechaNacimiento, String categoria) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.categoria = categoria;
	}

	/**
	 * Devuelve la categoria del administrativo
	 * @return categoriaAdministrativo
	 */
	public String getCategoria() {
		return categoria;
	}
	
	/**
	 * Modifica la categoria del administrativo
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getSalario() {
		
		
		/**
		 * Una condición si la categoria del administartivo es A , el salario es 1500,
		 * sino es de 1200.
		 */
		float result = 0;
		if (this.categoria.equals("A"))
			result = 1500;
		else
			result = 1200;

		return result;
	}
	
}
