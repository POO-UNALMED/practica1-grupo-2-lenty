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
			int id,cli,sed,rep;
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
			Cliente.verClientes();
			System.out.println("Ingrese el indice del cliente de la orden");
			while(true) {
				cli=in.nextInt();
				if(cli>=0 && cli<Cliente.getClientes().size()) {
					c=Cliente.getClientes().get(cli);
					break;
				}
				else {
					System.out.println("Ingrese un indice valido");
				}
			}
			Sede.consultarSedes();
			System.out.println("Ingrese el indice de la sede de la orden");
			while(true) {
				sed=in.nextInt();
				if(sed>=0 && sed<Sede.getSede().size()) {
					s=Sede.getSede().get(sed);
					break;
				}
				else {
					System.out.println("Ingrese un indice valido");
				}
			}
			Repartidor.verRepartidores();
			System.out.println("Ingrese el indice del repartidor de la orden");
			while(true) {
				rep=in.nextInt();
				if(rep>=0 && rep<Repartidor.getRepartidores().size() && Repartidor.getRepartidores().get(rep).disponibilidad==true ) {
					r=Repartidor.repartidores.get(rep);
					break;
				}
				else {
					System.out.println("Ingrese un indice valido");
				}
			}
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
			Orden.consultarOrdenesActivas();
			System.out.println("Ingrese el indice de la orden que desea modificar");
			Orden aux2=null;
			while(true) {
				int o=in.nextInt();
				if(o>=0 && o<Orden.getOrdenes().size()) {
					aux2=Orden.getOrdenes().get(o);
					break;
				}
				else {
					System.out.println("Ingrese un indice valido");
				}
			}
			String op,ch;
			System.out.println("________________________\n");
			System.out.println("¿Qué desea modificar?");
			System.out.println("Seleccione una opcion: ");
			String aux4="\n1 - ID de orden \n2 - Cliente de orden \n3 - Sede de orden \n4 - Repartidor de orden \n5 - Valor de orden \n6 - Cantidad de productos de orden \n7 - Peso total de orden \n8 - Estado de la Orden \n9 - Regresar";
			System.out.println(aux);
			while (true) {
				op=in.next();
				if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5") || op.equals("6") || op.equals("7") || op.equals("8") || op.equals("9")) {
					break;
				}
				else {
					System.out.println("Ingresa una opcion valida");
					System.out.println(aux4);	
				}
			}
			switch(op) {
				case "1":
					System.out.println("Ingrese un nuevo ID de la orden :");
					aux="Ingrese un nuevo ID de la orden :";
					while(true) {
						ch=in.next();
						if(isNumeric(ch)){
							aux2.setId(Integer.parseInt(ch));
							System.out.print("Cambio realizado\n");
							menuOrden();
							break;
						}
						else {
							System.out.println("Ingresa una opcion valida");
							System.out.println(aux);
						}
					}
			case "2":
				Cliente.verClientes();
				System.out.println("Ingrese el indice del cliente nuevo de la orden");
				while(true) {
					int cli1=in.nextInt();
					if(cli1>=0 && cli1<Cliente.getClientes().size()) {
						aux2.setCliente(Cliente.getClientes().get(cli1));;
						System.out.println("Cambio realizado\n");
						menuOrden();
						break;
					}
					else {
						System.out.println("Ingrese un indice valido");
					}
				}
				
			case "3":
				Sede.consultarSedes();
				System.out.println("Ingrese el indice de la sede nueva de la orden");
				while(true) {
					int sed1=in.nextInt();
					if(sed1>=0 && sed1<Sede.getSede().size()) {
						aux2.setSede(Sede.getSede().get(sed1));
						System.out.println("Cambio realizado, siga modificando \n");
						menuOrden();
						break;
					}
					else {
						System.out.println("Ingrese un indice valido");
					}
				}
				
			case "4":
				Repartidor.verRepartidores();
				System.out.println("Ingrese el indice del repartidor nuevo de la orden");
				while(true) {
					int rep1=in.nextInt();
					if(rep1>=0 && rep1<Repartidor.getRepartidores().size() && Repartidor.getRepartidores().get(rep1).disponibilidad==true ) {
						aux2.setRepartidor(Repartidor.getRepartidores().get(rep1));
						System.out.println("Cambio realizado, siga modificando \n");
						menuOrden();
						break;
					}
					else {
						System.out.println("Ingrese un indice valido");
					}
				}
				
			case "5":
				System.out.println("Ingrese un nuevo valor de la orden :");
				aux="Ingrese un nuevo valor de la orden :";
				while(true) {
					ch=in.next();
					if(isNumeric(ch)){
						aux2.setValor(Integer.parseInt(ch));
						System.out.print("Cambio realizado\n");
						menuOrden();
						break;
					}
					else {
						System.out.println("Ingresa una opcion valida");
						System.out.println(aux);
					}
				}
			case "6":
				System.out.println("Ingrese una nueva cantidad de productos en la orden :");
				aux="Ingrese una nueva cantidad de productos en la orden :";
				while(true) {
					ch=in.next();
					if(isNumeric(ch)){
						aux2.setCantProductos(Integer.parseInt(ch));
						System.out.print("Cambio realizado, siga modificando \n");
						menuOrden();
						break;
					}
					else {
						System.out.println("Ingresa una opcion valida");
						System.out.println(aux);
					}
				}
			case "7":
				System.out.println("Ingrese un nuevo peso total de la orden :");
				aux="Ingrese un nuevo peso total de la orden :";
				while(true) {
					ch=in.next();
					if(isNumeric(ch)){
						aux2.setPesoTotal(Integer.parseInt(ch));
						System.out.print("Cambio realizado, siga modificando \n");
						menuOrden();
						break;
					}
					else {
						System.out.println("Ingresa una opcion valida");
						System.out.println(aux);
					}
				}
			case "8":
				System.out.println("Ingrese un nuevo estado de la orden :");
				aux2.setEstado(in.next());
				System.out.print("Cambio realizado, siga modificando \n");
				menuOrden();
				break;
			case "9":
				Main.menuOrden();
				break;
			}
		case "4":
			Orden.consultarOrdenesActivas();
			System.out.println("Ingrese el indice de la orden que desea eliminar");
			while(true) {
				int u=in.nextInt();
				if(u>=0 && u<Orden.getOrdenes().size()) {
					Orden.cancelarOrden(u);
					System.out.println("Se ha eliminado el elemento, volvera al menu de ordenes");
					menuOrden();
				}
				else {
					System.out.println("Ingresa una opcion valida");
					System.out.println(aux);
				}
			}
			
		case "5":
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
				System.out.print("\nIngrese la direccion del Cliente (Sin espacios): ");
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
		String aux="1 - Ver Repartidores \n2 - Agregar Repartidor \n3 - Regresar";
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
				Repartidor.verRepartidores();
				menuRepartidores();
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
				String entSalud = in.nextLine();
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
		System.out.println("Menú Sedes");
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
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
