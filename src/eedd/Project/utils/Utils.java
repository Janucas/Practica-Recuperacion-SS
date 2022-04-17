package eedd.Project.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
	
	/**
	 * Metodo que devuelve el formato largo de la hopra actual
	 * @return horaActual
	 */
	public static String horaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Metodo que devuelve el formato largo de la hopra actual
	 * @return horaActual
	 */
	public static int horaCortaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		
		return Integer.parseInt(dtf.format(LocalDateTime.now()));
	}
	
	/**
	 * Método que nos devuelve la fecha actual
	 * 
	 * @return fechaActual
	 */
	public static String fechaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método para calcular las horas pendientes
	 * 
	 * @return horaSalida
	 * @return horasPendientes
	 */
	public static int calcularHorasPendientes (int horaSalida) {
		int result = 0;
		result = horaSalida - horaCortaActual();
		return result;
	}

}
