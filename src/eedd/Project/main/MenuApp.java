package eedd.Project.main;

import java.util.Scanner;

/**
 * @author Juanan
 * Clase Main
 */

import eedd.Project.business.Administrativo;
import eedd.Project.business.Profesor;
import eedd.Project.business.Director;
import eedd.Project.utils.Utils;

public class MenuApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mostrarPresentacion();
		
		//Preguntamos por el nombre de la persona
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		//Preguntamos por el primer apellido de la persona
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();
		
		bienvenidoBienvenida(nombre, primerApellido);
		
		administrativo(sc);
		
		profesor(sc);  
		
		calcularSalarioDirector(nombre, primerApellido);
		
		sc.close();
		/**
		 * Con este motodo vamos a obtener el salario de los profesores que hayamos introducido
		 * @param sc
		 */
		
	}

	private static void profesor(Scanner sc) {
		//Pregunta por el numero de profesores
		System.out.println("Introduce el número de profesores : ");
		int numProf= sc.nextInt();
		Profesor[] listaProf = new Profesor[numProf];
		//Bucle que dara los salarios de los profesores en funcion a la cantidad que se haya indicado
		for (int i=0; i<numProf; i++) {
			listaProf[i] = new Profesor();
			listaProf[i].getSalario();
			System.out.println("El salario del profesor es: " + listaProf[i].getSalario());
		}
	}
	
	/**
	 * Metodo con el que nos va a devolver el salario de cada adeministrativo en funcion a la cantidad que se haya introducido
	 * @param sc
	 */
	private static void administrativo(Scanner sc) {
		System.out.println("Introduce el número de administrativos : ");
		int numAdmins= sc.nextInt();
		Administrativo[] listaAdmins = new Administrativo[numAdmins];
		for (int i=0; i<numAdmins; i++) {
			listaAdmins[i] = new Administrativo();
			if (i<2) listaAdmins[i].setCategoria("A");
			else listaAdmins[i].setCategoria("B");
			//listaAdmins[i].getSalario();
			System.out.println("El salario del administrativo es: " + listaAdmins[i].getSalario());
		}
	}

	/**
	 * Metodo el cual ha sido extraido
	 * Nos va a devolver la bienvenida con tu nombre y primer apellido
	 * @param nombre
	 * @param primerApellido
	 */
	
	
	private static void bienvenidoBienvenida(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fechaActual() );
		System.out.println("/*** " + Utils.horaActual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	
	/**
	 * Metodo que devuelve un mensaje por pantalla
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     Y DE NUEVO...                                                       ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	
	private static void calcularSalarioDirector(String n, String a)
	{
		Director d = new Director();
		d.setNombre(n);
		d.setApellidos(a);
		
		System.out.println("El salario del director es: " + d.getSalario());
	}

}
