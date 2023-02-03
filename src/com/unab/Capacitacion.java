package com.unab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * @author Luis Zenteno
 * @version 1.0
 * 
 * Esta clase utilizara los siguientes parametros para cada metodo:
	 * @param mensaje se muestra al usuario para solicitar el ingreso del valor que guardará cada atributo.
	 * @param sc Scanner para la entrada de datos por parte del usuario.
	 * @return La cadena de caracteres correspondiente al valor ingresado, validado y asignado a cada atributo.
 */
public class Capacitacion {

	private String id, rutCliente, día, hora, lugar, duración, asistentes;
	
	/*Constructor vacio. Crea una nueva instancia de Capacitación*/
	public Capacitacion() {
	}

	/**
	Método toString sobreescrito para la clase Capacitacion.
	Devuelve una representación en forma de cadena de los valores de los atributos de un objeto de la clase Capacitacion.
	@return Una cadena con los valores de los atributos de la capacitación.
	*/
	@Override
	public String toString() {
		return "\nDATOS CAPACITACIÓN" + "\n\\\\\\\\\\\\\\\\" + "\n* ID CLIENTE --> " + "#" +  id + "\n* RUT CLIENTE --> " + rutCliente + "\n* DÍA --> " + día + "\n* HORA --> " + hora + "\n* LUGAR --> "
				+ lugar + "\n* DURACIÓN --> " + duración + " Horas" + "\n* CANTIDAD ASISTENTES --> " + asistentes;
	}

	
	/**
	 * Método que valida el formato del RUN ingresado por el usuario.
	*/
	public String validarRun(String mensaje, Scanner sc) {

		boolean condRun = true;
		String entrada = "";

		while (condRun) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("\\d{2}.\\d{3}.\\d{3}")) {

				condRun = false;
			} else {

				System.out.println("Run ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	/** 
	 * Metodo que valida el formato de un evento ingresado por el usuario.
	 */
	public String validarLugar(String mensaje, Scanner sc) {

		boolean condicion2 = true;
		String entrada = "";

		while (condicion2) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[a-z A-Z 0-9]{5,50}")) {

				condicion2 = false;
			} else {

				System.out.println("Direccion ingresada no valida, intentelo nuevamente");
			}
		}
		return entrada;
	}

	/**
	 * Metodo que valida el formato de un ID ingresado por el usuario, con una longitud de digitos de 5 a 8.
	 */
	public String validarId(String mensaje, Scanner sc) {

		boolean condicionId = true;
		String entrada = "";

		while (condicionId) {

			System.out.print(mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[a-zA-Z 0-9]{5,8}")) {

				condicionId = false;
			} else {

				System.out.println("ID ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}

	/**
	 * Metodo que valida el formato del día de un evento ingresado por el usuario, se compara con las 7 opciones de los días de la semana.
	 */
	public String validarDia(String mensaje, Scanner sc) {

		boolean condDia = true;
		String entrada = "";

		while (condDia) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[a-zA-Z]{1,}")) {

				if (entrada.equals("lunes") || entrada.equals("martes") || entrada.equals("miercoles")
						|| entrada.equals("jueves") || entrada.equals("viernes") || entrada.equals("sabado")
						|| entrada.equals("domingo")) {
					
					condDia = false;
					
				} else {
					System.out.println("Día ingresado no válido");
				}
			} else {
				System.out.println("Dato ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}


	/**
	 * Valida que una entrada de usuario sea una hora en formato "HH:mm".
	 * 	
	 * SimpleDateFormat es una clase de Java que permite formatear o convertir un objeto de tipo Date a una cadena de texto con un formato específico, y viceversa. 
	 * 
	 * La propiedad "lenient" de la clase java.text.DateFormat es una bandera que indica si se permite la interpretación flexible de fechas y horas.
	 * Si está establecido en true, el formato de fecha y hora será más permisivo y permitirá fechas y horas que no cumplen con los requisitos exactos. 
	 * Si está establecido en false, el formato de fecha y hora será más estricto y sólo aceptará fechas y horas que cumplan con los requisitos exactos.	
	 * 
	 * @param mensaje Mensaje a mostrar al usuario para pedir la entrada de hora.
	 * @param sc Objeto Scanner para leer la entrada de usuario.
	 * @return La hora en formato "HH:mm" si es válida, o una cadena vacía en caso contrario.
	 */
	public String validarHora(String mensaje, Scanner sc) {
		
		boolean condHora = true;
		String entrada = "";
		
		while (condHora) {
			
			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();
			
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			sdf.setLenient(false); 

			try {
				
			  Date hora = sdf.parse(entrada);
			  
			  condHora = false;
			} 
			catch (ParseException e) {
			  System.out.println("Formato de hora inválido, intentalo nuevamente");
			}
		}
		
		return entrada;
	}
	
	
	/**
	 * Este método valida la duración de un evento.
	*/
	public String validarDuracion(String mensaje, Scanner sc) {
		
		boolean condicion3 = true;
		String entrada = "";
		
		while (condicion3) {
			
			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();
			
			/*
			 * Esta sección utilizada para la validacion de la duración de un evento, valida que lo ingresado por el usuario sean solo números .
			 * Si la duración del evento está en un rango de 1 a 5, el ciclo continuará.
			 * Si lo ingresado por el usuario no es un dato numerico ni esta dentro del rango establecido, el ciclo volverá a repetirse para pedir los datos nuevamente.
			*/
			if (entrada.matches("[1-5]{1}")) {
				
				condicion3 = false;
			}
			else {
				
				System.out.println("Cantidad de horas no valida, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	/**
	 * Metodo que valida el formato de una cantidad de asistentes a un evento ingresado por el usuario, solo pueden ser datos numericos con un rango de 1 a 999 asistentes.
	 */
	public String validarAsistentes(String mensaje, Scanner sc) {
		
		boolean condAsist = true;
		String entrada = "";
		
		while (condAsist) {
			
			System.out.println("\n" + mensaje);
			entrada = sc.nextLine();
			
			if (entrada.matches("[0-9]{1,3}")) {
				
				if (!entrada.equals("0")) {
					
					condAsist = false;
				}else {
					
					System.out.println("Tiene que haber al menos 1 asistente, intentelo de nuevo");
				}
			}
			else {
				
				System.out.println("Cantidad de asistenes no validos, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return "El ID es --> #" + id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the rutCliente
	 */
	public String getRutCliente() {
		return "El rut es --> " + rutCliente;
	}

	/**
	 * @param rutCliente the rutCliente to set
	 */
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * @return the día
	 */
	public String getDía() {
		return "El día de la capacitación es --> " + día;
	}

	/**
	 * @param día the día to set
	 */
	public void setDía(String día) {
		this.día = día;
	}

	/**
	 * @return the hora
	 */
	public String getHora() {
		return "La hora de la capacitación es --> " + hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return "El lugar de la capacitación es --> " + lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the duración
	 */
	public String getDuración() {
		return "La duración de la capacitación es --> " + duración;
	}

	/**
	 * @param duración the duración to set
	 */
	public void setDuración(String duración) {
		this.duración = duración;
	}

	/**
	 * @return the asistentes
	 */
	public String getAsistentes() {
		return "La cantidad de asistentes es --> " + asistentes;
	}

	/**
	 * @param asistentes the asistentes to set
	 */
	public void setAsistentes(String asistentes) {
		this.asistentes = asistentes;
	}

}