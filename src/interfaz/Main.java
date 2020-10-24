package interfaz;

import java.util.*;

import gestionHumana.*;
import orden.*;
import sede.*;
import vehiculo.*;

public class Main{
	static Scanner in = new Scanner(System.in);
	static String op;
	
	public static void main(String[] args) {		
		System.out.println("Bienvenido");				
		Producto.agregarProducto("Hamburguesa", "Llanera", 2500, 3);
		Producto.agregarProducto("Hamburguesa", "Ranchera", 5000, 5);
		menuInicial();
				
	}
	
	static void menuInicial () {
		System.out.println("________________________\n");
		System.out.println("Seleccione una opcion");
		String aux="1 - Menú de Usuarios \n2 - Menú de Ordenes\n3 - Menú de Productos \n4 - Menú de Vehiculos \n5 - Menú de Sedes \nIngrese -1 para cerrar el programa";
		System.out.println(aux);

		System.out.print("\nIngrese la opcion que desea: ");
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5") || op.equals("-1")) {
				break;
			}
			else {
				System.out.print("\nIngresa una opcion valida: ");
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
				menuProductos();
				break;
				
			case "4":
				System.out.println("Se entro 4");
				break;
				
			case "5":
				System.out.println("Se entro 5");
				break;
			case "-1":
				System.out.println("Cerrando, hasta pronto.");
				System.exit(0);
		}
	}
	
	static void menuProductos() {
		System.out.println("________________________\n");
		System.out.println("Menú Productos\n");
		System.out.println("Seleccione una opcion");
		String aux="1 - Agregar producto \n2 - Consultar productos en existencia \n3 - Consultar productos mas vendidos \n4 - Regresar";
		System.out.println(aux);
		System.out.print("\nIngrese la opcion que desea: ");
		while (true) {
			
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4")) {
				break;
			}
			else {
				System.out.print("\nIngresa una opcion valida: ");
			}
		}
		switch(op) {
			case "1":
				System.out.print("\nIngrese el nombre del producto: ");
				String nombre = in.next();
				System.out.print("\nIngrese la descripcion del producto: ");
				String descripcion = in.next();
				System.out.print("\nIngrese el precio del producto: ");
				long precio = in.nextLong();
				System.out.print("\nIngrese la cantidad del producto: ");
				int cantidad = in.nextInt();
				Producto.agregarProducto(nombre, descripcion, precio, cantidad);
				menuProductos();
				break;
				
			case "2":
				Producto.verProductos();
				menuProductos();
				break;
				
			case "3":
				break;

			case "4":
				menuInicial();
				break;
		}
		
	}
	
	static void menuUsuarios() {
		System.out.println("________________________\n");
		System.out.println("Menú Productos");
		System.out.println("Seleccione una opcion");
		String aux="1 - Clientes \n2 - Repartidores\n3 - Regresar";
		System.out.println(aux);
		System.out.print("\nIngrese la opcion que desea: ");
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3")) {
				break;
			}
			else {
				System.out.print("\nIngresa una opcion valida: ");
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
