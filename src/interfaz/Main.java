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
						
		Lector.Leer();
		menuInicial();
				
	}
	
	static void menuInicial () {
		System.out.println("________________________\n");
		System.out.println("Seleccione una opcion");
		String aux="1 - Menú de Usuarios \n2 - Menú de Ordenes\n3 - Menú de Productos \n4 - Menú de Vehiculos \n5 - Menú de Sedes \n6 - Guardar cambios y salir";
		System.out.println(aux);
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5") || op.equals("6")) {
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
		System.out.println("Menú Usuarios");
		System.out.println("Seleccione una opcion");
		String aux="1 - Consultar Vehiculos \n2 - Registrar Vehiculo \n3 - Modificar Vehiculo \n4 - Eliminar Vehiculo \n5 - Regresar al menu principal";
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
				Vehiculo.consultarVehiculo();
				menuVehiculos();
				break;
				
			case "2":
				System.out.println("Ingrese la placa del vehiculo"); 
				String placa = in.next();
				System.out.println("Ingrese el modelo del vehiculo(Sin espacios)");
				String modelo = in.next();
				System.out.println("Ingrese la matricula (Solo numeros)");
				int matricula = in.nextInt();
				System.out.println("Ingrese true si el vehiculo se encuentra aegurado o false en caso contrario");
				boolean asegurado = in.nextBoolean();
				Vehiculo vehiculo = new Vehiculo(placa, modelo, matricula, asegurado);
				Vehiculo.adicionarVehiculo(vehiculo);
				menuVehiculos();
				break;
				
			case "3":
				Vehiculo.consultarVehiculo();
				System.out.println("Ingrese el numero de la lista del vehiculo que desea modificar");
				int numero = in.nextInt();
				Vehiculo vehiculo1 =(Vehiculo.getVehiculos()).get(numero);
				System.out.println("Seleccione la caracteristica a modificar");
				System.out.println("1 - Placa \n2 - Modelo \n3 - Matricula \n4 - Seguro \n5 -Regresar al menu vehiculo");
				op=in.next();
				switch(op) {
				
				    case"1":
				    	
					    System.out.println("Ingrese la placa del vehiculo (sin espacios)");
					    String placa1 = in.next();
					    vehiculo1.setPlaca(placa1);
					    menuVehiculos();
					    break;
				    case"2":
					    System.out.println("Ingrese el modelo del vehiculo (sin espacios)");
					    String modelo1 = in.next();
					    vehiculo1.setModelo(modelo1);
					    menuVehiculos();
					    break;
				    case"3":
					    System.out.println("Ingrese la placa del vehiculo (Solo numeros)");
					    int matricula1 = in.nextInt();
					    vehiculo1.setMatricula(matricula1);
					    menuVehiculos();
					    break;    
				    case"4":
					    System.out.println("Ingrese true si el vehiculo se encuentra aegurado o false en caso contrario");
					    boolean asegurado1 = in.nextBoolean();
					    vehiculo1.setAsegurado(asegurado1);
					    menuVehiculos();
					    break;
				    case"5":
					    menuVehiculos();
					    break; 
				
				}
				break;
			case "4":
				Vehiculo.consultarVehiculo();
				System.out.println("Ingrese el numero de la lista del vehiculo que desea Eliminar");
				int numero1 = in.nextInt();
				(Vehiculo.getVehiculos()).remove(numero1);
				menuVehiculos();
				break;
				
			case "5":
				menuInicial();
				break;	

		}
	}
	
	

	static void menuSedes() {
		System.out.println("________________________\n");
		System.out.println("Menú Usuarios");
		System.out.println("Seleccione una opcion");
		String aux= "1 - Consultar sede \n2 - Registrar sede \n3 - Modificar sede \n4 - Eliminar sede \n5 - Contultar sede de mayor ventas  \n6 Regresar al menu principal";
		System.out.println(aux);
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5") || op.equals("6")) {
				break;
			}
			else {
				System.out.println("Ingresa una opcion valida");
				System.out.println(aux);	
			}
		}
		switch(op) {
			case "1":
				Sede.consultarSedes();
				menuSedes();
				break;
				
			case "2":
				System.out.println("Ingrese la direccion(Sin espacios)"); 
				String dir = in.next();
				System.out.println("Ingrese el numero telefonico(Sin espacios)");
				int telefono = in.nextInt();
				Sede sede = new Sede (dir, telefono);
				Sede.adicionarSede(sede);
				break;
				
			case "3":
				Sede.consultarSedes();
				System.out.println("Ingrese el numero de la lista de la sede que desea modificar");
				int numero = in.nextInt();
				Sede sede1 =(Sede.getSede()).get(numero);
				System.out.println("Seleccione la caracteristica a modificar");
				System.out.println("1 - Direccion \n2 - Telefono \n3 -Regresar al menu sede");
				op=in.next();
				
				switch(op) {
				
			    case"1":
			    	
				    System.out.println("Ingrese la nueva direccion (sin espacios)");
				    String dir1 = in.next();
				    sede1.setDireccion(dir1);
				    menuSedes();
				    break;
			    case"2":
			    	 System.out.println("Ingrese el nuevo numero telefonico (sin espacios)");
					    long dir11 = in.nextLong();
					    sede1.setTelefono(dir11);
					    menuSedes();
			    case"3":
				     	menuSedes();
				break;
				}
			case "4":
				Sede.consultarSedes();
				System.out.println("Ingrese el numero de la lista de la sede que desea Eliminar");
				int numero1 = in.nextInt();
				(Sede.getSede()).remove(numero1);
				menuSedes();
				break;
			case "5":
				Sede.sedeMayorVentas();
				menuSedes();
				break;
			case "6":
				menuInicial();
				

		}
	}
	
}
