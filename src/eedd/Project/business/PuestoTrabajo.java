package eedd.Project.business;

import java.util.Date;

public class PuestoTrabajo {

	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected Date fechaNacimiento;
	public String horarioAsignado;
	public int horaEntrada;
	public int horaSalida;
	private Object categoria;

	public PuestoTrabajo() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFecha_nacimiento() {
		return fechaNacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fechaNacimiento = fecha_nacimiento;
	}

	public float getSalario() {
		float result = 0;
		if (this.categoria.equals("A"))
			result = 1500;
		else 
			result = 1200;
			
		return result;
	}

}