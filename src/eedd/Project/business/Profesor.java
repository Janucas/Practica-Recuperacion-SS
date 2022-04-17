package eedd.Project.business;

import java.util.Date;
/**
 * Clase Profesor
 * @author Juanan
 *
 */

public class Profesor extends PuestoTrabajo {
	
	//Declaramos los atributos no comunes
	private String especialidad;

	
	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellidos, String dni, Date fechaNacimiento, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.especialidad = especialidad;
	}

	
	/**
	 * Devuelve la especialidad del profesor
	 * @return especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}
	
/**
 * Modifica la especialidad del profesor
 * @param especialidad
 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	/**
	 * Devuelve el salario del profesor 
	 * @return salaeio=1900
	 */
	public float getSalario() {
		float result;

		result = 1900;
		return result;
	}
	
	

}
