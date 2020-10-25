package interfaz;

import java.util.*;

import gestionHumana.*;
import orden.*;
import sede.*;
import vehiculo.*;

public class Main {
	static Scanner in = new Scanner(System.in);
	static String op;
	
	public static void main(String[] args) {		
		System.out.println("Bienvenido");				
		
		menuInicial();
				
	}
	
	static void menuInicial () {
		System.out.println("________________________\n");
		System.out.println("Seleccione una opcion");
		String aux="1 - Menú de Usuarios \n2 - Menú de Ordenes\n3 - Menú de Productos \n4 - Menú de Vehiculos \n5 - Menú de Sedes";
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
				System.out.println("Se entro 4");
				break;
				
			case "5":
				System.out.println("Se entro 5");
				break;
		}
	}
	
	static void menuUsuarios() {
		System.out.println("________________________\n");
		System.out.println("Menú Usuarios");
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
				menuClientes();
				break;
				
			case "2":
				menuRepartidores();
				break;
				
			case "3":
				menuInicial();
				break;

		}
	}
	
	static void menuClientes() {
		System.out.println("________________________\n");
		System.out.println("Menú Clientes");
		System.out.println("Seleccione una opcion");
		String aux="1 - Ver Clientes \n2 - Agregar Cliente\n3 - Regresar";
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
				menuUsuarios();
				break;

		}
	}
	
	static void menuRepartidores() {
		System.out.println("________________________\n");
		System.out.println("Menú Repartidores");
		System.out.println("Seleccione una opcion");
		String aux="1 - Ver Repartidores \n2 - Agregar Repartidor\n3 - Regresar";
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
				menuUsuarios();
				break;

		}
	}
	
}
