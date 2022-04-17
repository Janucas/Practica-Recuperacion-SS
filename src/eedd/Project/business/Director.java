package eedd.Project.business;

import java.util.Date;
/**
 * Clase Director
 * @author Juanan
 *
 */

public class Director extends PuestoTrabajo {
	

	
	public Director() {
		super();
	}

	public Director(String nombre, String apellidos, String dni, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	 * Metodo que devuelve el salario del director
	 * @return salario=2300
	 */
	public float getSalario() {
		return 2300;
	}

	

}
