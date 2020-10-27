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
				menuOrden();
				break;
				
			case "3":
				menuProductos();
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
	public static void menuOrden() {
		System.out.println("________________________\n");
		System.out.println("Menú Orden");
		System.out.println("Seleccione una opcion");
		String aux="1 - Ver ordenes activas \n2 - Crear orden \n3 - Modificar orden\n4 - Eliminar orden \n5 - Regresar";
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
			Orden.consultarOrdenesActivas();
			menuOrden();
		case "2":
			int id;
			Cliente c=null;
			Sede s=null;
			Repartidor r=null;
			int valor;
			int cantP;
			float peso;
			String es;
			System.out.println("ingrese los parametros de la orden: \n");
			System.out.println("ID de la orden:");
			id=in.nextInt();
			System.out.println("Ingrese el indice del cliente de la orden, si lo desconoce, ingrese -1");
			int cli=in.nextInt();
			if(cli==-1) {
				Cliente.verClientes();
				System.out.println("Ingrese el indice del cliente de la orden");
				cli=in.nextInt();
			}
			else if(cli>=0 && cli<Cliente.getClientes().size()) {
				c=Cliente.getClientes().get(cli);
			}
			//FALTA CLIENTE, SEDE Y REPARTIDOR
			System.out.println("Sede de la orden: ");
			System.out.println("Repartidor de la orden: ");
			System.out.println("Valor de la Orden: ");
			valor=in.nextInt();
			System.out.println("Cantidad de productos: ");
			cantP=in.nextInt();
			System.out.println("Peso total de la orden: ");
			peso=in.nextFloat();
			System.out.println("Estado de la orden: ");
			es=in.next();
			new Orden(id,c,s,r,valor,cantP,peso,es);
		
		case "3":
			System.out.println("Ingrese el indice de la orden que desea modificar, sí desconoce los indices, ingrese -1 ");
			int o=in.nextInt();
			if(o==-1) {
				Orden.consultarOrdenesActivas();
			}
			else if(o>=0 && o<Orden.getOrdenes().size()) {
				Orden.getOrdenes().get(o).modificarOrden();
			}
		
		case "4":
			System.out.println("Ingrese el indice de la orden que desea eliminar, sí desconoce los indices, ingrese -1 ");
			int u=in.nextInt();
			if(u==-1) {
				Orden.consultarOrdenesActivas();
			}
			else if(u>=0 && u<Orden.getOrdenes().size()) {
				Orden.cancelarOrden(u);
				System.out.println("Se ha eliminado el elemento, volvera al menu de ordenes");
				menuOrden();
			}
			
		case "5":
			menuInicial();
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
				Cliente.verClientes();
				menuClientes();
				break;
				
			case "2":
				System.out.print("\nIngrese el numero de documento del Cliente: ");
				long id = in.nextLong();
				System.out.print("\nIngrese el nombre del Cliente: ");
				String nombre = in.next();
				System.out.print("\nIngrese el telefono del Cliente: ");
				String telefono = in.next();
				System.out.print("\nIngrese el genero del Cliente: ");
				String genero = in.next();
				System.out.print("\nIngrese la direccion del Cliente: ");
				String dir = in.next();
				System.out.print("\nIngrese el metodo de pago del Cliente: \n1 - Efectivo \n2 - Tarjeta");
				String pago = in.next();
				String metPago;
				long tarj;
				if (pago.equals("1")) {
					metPago = "Efectivo";
					tarj = 0000000000;
				} else {
					metPago = "Tarjeta";
					System.out.print("\nIngrese el numero de tarjeta del Cliente: ");
					tarj = in.nextLong();
				}
				Cliente.agregarCliente(dir, metPago, tarj, id, nombre, genero, telefono);
				menuClientes();
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
				Cliente.verClientes();
				menuClientes();
				break;
				
			case "2":
				System.out.print("\nIngrese el numero de documento del Repartidor: ");
				long id = in.nextLong();
				System.out.print("\nIngrese el nombre del Repartidor: ");
				String nombre = in.next();
				System.out.print("\nIngrese el telefono del Repartidor: ");
				String telefono = in.next();
				System.out.print("\nIngrese el genero del Repartidor: ");
				String genero = in.next();
				System.out.print("\nIngrese la entidad de salud del Repartidor: ");
				String entSalud = in.next();
				System.out.print("\nIngrese el salario del Repartidor: ");
				int salario = in.nextInt();
				Repartidor.agregarRepartidor(entSalud, salario, true, id, nombre, genero, telefono);
				menuRepartidores();
				break;
				
			case "3":
				menuUsuarios();
				break;

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
			System.out.println(Producto.productoMasVendido());
			menuProductos();
			break;

		case "4":
			menuInicial();
			break;
	}
	
}

	static void menuVehiculos() {
		System.out.println("________________________\n");
		System.out.println("Menú Vehiculos");
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
					break;
				case"2":
					System.out.println("Ingrese el modelo del vehiculo (sin espacios)");
					String modelo1 = in.next();
					vehiculo1.setModelo(modelo1);
					break;
				case"3":
					System.out.println("Ingrese la placa del vehiculo (Solo numeros)");
					int matricula1 = in.nextInt();
					vehiculo1.setMatricula(matricula1);
					break;    
				case"4":
					System.out.println("Ingrese true si el vehiculo se encuentra aegurado o false en caso contrario");
					boolean asegurado1 = in.nextBoolean();
					vehiculo1.setAsegurado(asegurado1);
					break;
				case"5":
					menuVehiculos();
					break; 
				//default:
					//System.out.println("Ingresa una opcion valida");
					
				}
				break;
			case "4":
				Vehiculo.consultarVehiculo();
				System.out.println("Ingrese el numero de la lista del vehiculo que desea modificar");
				int numero1 = in.nextInt();
				(Vehiculo.getVehiculos()).remove(numero1);
				break;
				
			case "5":
				menuInicial();
				break;	

		}
	}
	
	

	static void menuSedes() {
		System.out.println("________________________\n");
		System.out.println("Menú Sedes");
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
