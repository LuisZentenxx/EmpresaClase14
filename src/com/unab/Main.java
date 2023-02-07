
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
		cliente1.setSistemaSalud(cliente1.validarSalud("Ingresa tu Sistema de Salud (fonasa o isapre) --> ", sc).toLowerCase());
		
		System.out.println(cliente1.toString());

		System.out.println("Nombre completo: "+ cliente1.obtenerNombre());
		System.out.println("Sistema de salud: "+ cliente1.obtenerSistemaSalud());
	}
	
	public static void usuario() {
		
		//Creación de un objeto de la clase Usuario.
		Usuario user1 = new Usuario();
		
		System.out.println("\nFORMULARIO DE USUARIOS");
		
		//Llamado a método para validar los datos de la capacitación y asignación del resultado.
		user1.setNombre(user1.validarLetras("\nIngresa el nombre del usuario --> ", sc).toLowerCase());
		user1.setRut(user1.validarRut("Ingresa tu rut (99.999.999) --> ", sc));
		user1.setFechaNac(user1.validarFecha("Ingresa tu fecha de nacimiento (dd-mm-yyyy) --> ", sc));
		
		// Entrega un detalle de los datos ingresados por el usuario
		System.out.println(user1.toString());
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
		
		// Entrega un detalle de los datos ingresados por el usuario
		System.out.println(cap1.toString());
		System.out.println(cap1.mostrarDetalle());

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println("\n-------------------------------");
		//cliente();
		System.out.println("\n-------------------------------");
		capacitacion();
		System.out.println("\n-------------------------------");
		//usuario();
		System.out.println("\n-------------------------------");

	}
}