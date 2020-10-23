package interfaz;

import java.util.*;

import baseDatos.Escritor;
import baseDatos.Lector;
import gestionHumana.*;
import orden.*;
import sede.*;
import vehiculo.*;

public class Main {
	static Scanner in = new Scanner(System.in);
	static String op;
	
	public static void main(String[] args) {		
		System.out.println("Bienvenido");				
		Lector.Leer();
		menuInicial();
				
	}
	
	static void menuInicial () {
		System.out.println("________________________\n");
		System.out.println("Seleccione una opcion");
		String aux="1 - Men� de Usuarios \n2 - Men� de Ordenes\n3 - Men� de Productos \n4 - Men� de Vehiculos \n5 - Men� de Sedes \n6 - Guardar cambios y salir";
		System.out.println(aux);
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5")) {
				break;
			}
			else {
				System.out.println("Ingresa una opcion valida");
				System.out.println(aux);	
			}
		}
		switch(op) {
			case "1":
				menuUsuarios();
				break;
				
			case "2":
				System.out.println("Se entro 2");
				break;
				
			case "3":
				System.out.println("Se entro 3");
				break;
				
			case "4":
				menuVehiculos();
				break;
				
			case "5":
				menuSedes();
				break;
			case "6":
				Escritor.Escribir();;
				break;
		}
	}
	
	static void menuUsuarios() {
		System.out.println("________________________\n");
		System.out.println("Men� Usuarios");
		System.out.println("Seleccione una opcion");
		String aux="1 - Clientes \n2 - Repartidores\n3 - Regresar";
		System.out.println(aux);
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3")) {
				break;
			}
			else {
				System.out.println("Ingresa una opcion valida");
				System.out.println(aux);	
			}
		}
		switch(op) {
			case "1":
				
				break;
				
			case "2":
				System.out.println("Se entro 2");
				break;
				
			case "3":
				menuInicial();
				break;

		}
	}
	static void menuVehiculos() {
		System.out.println("________________________\n");
		System.out.println("Men� Usuarios");
		System.out.println("Seleccione una opcion");
		String aux="1 - Consultar Vehiculos \n2 - Registrar Vehiculos \n3 - Modificar Vehiculos \n4 - Eliminar Vehiculos \n5 -Regresar al menu principal";
		System.out.println(aux);
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5")) {
				break;
			}
			else {
				System.out.println("Ingresa una opcion valida");
				System.out.println(aux);	
			}
		}
		switch(op) {
			case "1":
				
				break;
				
			case "2":
				
				break;
				
			case "3":
				
				break;
			case "4":
				
				break;
				
			case "5":
				menuInicial();
				break;	

		}
	}
	static void menuSedes() {
		System.out.println("________________________\n");
		System.out.println("Men� Usuarios");
		System.out.println("Seleccione una opcion");
		String aux="1 - Clientes \n2 - Repartidores\n3 - Regresar";
		System.out.println(aux);
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3")) {
				break;
			}
			else {
				System.out.println("Ingresa una opcion valida");
				System.out.println(aux);	
			}
		}
		switch(op) {
			case "1":
				
				break;
				
			case "2":
				System.out.println("Se entro 2");
				break;
				
			case "3":
				menuInicial();
				break;

		}
	}
	
}
