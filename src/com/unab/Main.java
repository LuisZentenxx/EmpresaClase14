
package com.unab;

import java.util.Scanner;

/**
 * Clase principal donde se ejecuta el programa
 * @author Luis Zenteno, Barbara Carvajal
 *@version 1.1
 */
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Metodo que almacena la instancia de la clase Clientes en donde se validan los datos ingresados por consola.
	 */
	public static void cliente() {
		
		/*Nueva instancia de la clase*/
		Cliente cliente1 = new Cliente();
		
		System.out.println("\nFORMULARIO DE CLIENTES");
		
		cliente1.setNombres(cliente1.validarLetras("\nIngresa tus nombres --> ", sc).toLowerCase());
		cliente1.setApellidos(cliente1.validarLetras("Ingresa tus apellidos --> ", sc).toLowerCase());
		cliente1.setRut(cliente1.validarRut("Ingresa tu rut (ej: 99.999.999) --> ", sc));
		cliente1.setEdad(cliente1.validarEdad("Ingresa tu edad (ej: 23) --> ", sc));
		cliente1.setTelefono(cliente1.validarTelefono("Ingresa tu numero de telefono (8 digitos) --> ", sc));
		cliente1.setDireccion(cliente1.validarDireccion("Ingresa tu dirección --> ", sc).toLowerCase());
		cliente1.setComuna(cliente1.validarDireccion("Ingresa tu comuna de residencia --> ", sc).toLowerCase());
		cliente1.setAfp(cliente1.validarLetras("Ingresa tu AFP --> ", sc).toLowerCase());
		cliente1.setSistemaSalud(cliente1.validarSalud("Ingresa tu Sistema de Salud (1. fonasa - 2. isapre) --> ", sc).toLowerCase());
		// Entrega un detalle de los datos ingresados por el usuario
		System.out.println("Cliente 1");
		System.out.println(cliente1.toString());
		// NOMBRE COMPLETO
		System.out.println("Nombre completo: "+ cliente1.obtenerNombre());

		//instancia clientes 2 directamente con parametros, no con teclado.
		
		Cliente cliente2 = new Cliente("barbara camila", "carvajal saez", "38784433", "Modelo", "2", "calle 123", "quilpue", "29");
		System.out.println(cliente2.toString());
		
		System.out.println("\nCliente 1");

		System.out.println("\nCliente 1 usando solo metodos accesores (getters)");
		System.out.println("\nRUT: "+cliente1.getRut()
												+"NOMBRES: "+cliente1.getNombres()
												+"APELLIDOS: "+cliente1.getApellidos()
												+"TELEFONO: "+cliente1.getTelefono()
												+"AFP: "+cliente1.getAfp()
												+"SISTEMA DE SALUD: "+cliente1.getSistemaSalud()
												+"DIRECCION: "+cliente1.getDireccion()
												+"COMUNA: "+cliente1.getComuna()
												+"EDAD: "+cliente1.getEdad()
												);


		System.out.println("\nCliente 2");

		System.out.println("\nCliente 2 usando solo metodos accesores (getters)");
		System.out.println("\nRUT: "+cliente2.getRut()
												+"NOMBRES: "+cliente2.getNombres()
												+"APELLIDOS: "+cliente2.getApellidos()
												+"TELEFONO: "+cliente2.getTelefono()
												+"AFP: "+cliente2.getAfp()
												+"SISTEMA DE SALUD: "+cliente2.getSistemaSalud()
												+"DIRECCION: "+cliente1.getDireccion()
												+"COMUNA: "+cliente1.getComuna()
												+"EDAD: "+cliente1.getEdad()
												);

		
	}
	
	public static void usuario() {
		
		//Creación de un objeto de la clase Usuario.
		Usuario user1 = new Usuario();
		
		System.out.println("\nFORMULARIO DE USUARIOS");
		
		//Llamado a método para validar los datos de la capacitación y asignación del resultado.
		user1.setNombre(user1.validarLetras("\nIngresa el nombre del usuario --> ", sc).toLowerCase());
		user1.setRut(user1.validarRut("Ingresa tu rut (99.999.999) --> ", sc));
		user1.setFechaNac(user1.validarFecha("Ingresa tu fecha de nacimiento (dd-mm-yyyy) --> ", sc));
		System.out.println(user1.mostrarEdad());

		// Entrega un detalle de los datos ingresados por el usuario
		System.out.println("Usuario 1");
		System.out.println(user1.toString());

		//instancia usuario 2 directamente con parametros, no con teclado.
		Usuario user2 = new Usuario("Luis", "02-02-2000", "19.200.222");
		System.out.println("Usuario 2");
		System.out.println(user2.toString());

		System.out.println("\nUsuario 1");
		System.out.println("\nUsuario 1 usando solo metodos accesores (getters)");
		System.out.println("NOMBRE: "+ user1.getNombre()
											+"FECHA DE NACIMIENTO: "+ user1.getFechaNac()
											+"RUN: "+user1.getRut()
											);

		System.out.println("\nUsuario 2");
		System.out.println("\nUsuario 2 usando solo metodos accesores (getters)");
		System.out.println("NOMBRE: "+ user2.getNombre()
											+"FECHA DE NACIMIENTO: "+ user2.getFechaNac()
											+"RUN: "+user2.getRut()
											);

		}
	
	public static void capacitacion() {

		//Creación de un objeto de la clase Capacitación
		Capacitacion cap1 = new Capacitacion();

		System.out.println("\nFORMULARIO DE CAPACITACIÓN");

		//Llamado a método para validar los datos de la capacitación y asignación del resultado.
		cap1.setId(cap1.validarId("\nIngresa un ID (5 a 8 cáracteres) --> ", sc).toLowerCase());
		cap1.setRutCliente(cap1.validarRut("Ingresa el rut de Cliente (99.999.999) --> ", sc));
		cap1.setDía(cap1.validarDia("Ingrese el día de la capacitación --> ", sc).toLowerCase());
		cap1.setHora(cap1.validarHora("Ingresa la hora de la capacitación (hh:mm) --> ", sc));
		cap1.setLugar(cap1.validarLugar("Ingresa el lugar de la capacitación --> ", sc).toLowerCase());
		cap1.setDuración(cap1.validarDuracion("Ingresa la duración de la capacitacion en horas --> ", sc));
		cap1.setAsistentes(cap1.validarAsistentes("Ingresa la cantidad de asistentes (max 999) --> ", sc));
		cap1.setNumeroInterno(cap1.validarNumeroInterno("Ingrese el numero interno (3-5 digitos)", sc));
		// Entrega un detalle de los datos ingresados por el usuario
		System.out.println(cap1.toString());
		// mostrar detalle de la capacitacion.
		System.out.println(cap1.mostrarDetalle());

		System.out.println("\nCapacitacion 1 usando solo metodos accesores (getters)");
		System.out.println("IDENTIFICADOR: "+cap1.getId()
												+"RUT: "+cap1.getRut()
												+"DÍA: "+cap1.getDía()
												+"HORA: "+cap1.getHora()
												+"LUGAR: "+cap1.getLugar()
												+"DURACION: "+cap1.getDuración()
												+"ASISTENTES: " +cap1.getAsistentes()
												+"NUMERO INTERNO: "+cap1.getNumeroInterno()
												);

		//instancia capacitacion 2 directamente con parametros, no con teclado.

		Capacitacion cap2 = new Capacitacion("22332","20.888.222","viernes","20:30","unab","4","5","44444");
		
		System.out.println("Capacitación 2 usando toString");
		System.out.println(cap2.toString());
		System.out.println("\nCapacitacion 2 usando solo metodos accesores (getters)");
		System.out.println("IDENTIFICADOR: "+cap2.getId()
												+"RUT: "+cap2.getRut()
												+"DÍA: "+cap2.getDía()
												+"HORA: "+cap2.getHora()
												+"LUGAR: "+cap2.getLugar()
												+"DURACION: "+cap2.getDuración()
												+"ASISTENTES: " +cap2.getAsistentes()
												+"NUMERO INTERNO: "+cap2.getNumeroInterno()
												);



	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println("\n-------------------------------");
		cliente();
		System.out.println("\n-------------------------------");
		//capacitacion();
		System.out.println("\n-------------------------------");
		//usuario();
		System.out.println("\n-------------------------------");

	}
}