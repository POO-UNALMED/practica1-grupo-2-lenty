package baseDatos;
import java.io.*;

import gestionHumana.Cliente;
import gestionHumana.Repartidor;
import vehiculo.Vehiculo;
import orden.Orden;
import orden.Producto;

public class Lector {
	static ObjectInputStream objectInputStream;
	static File archivo = new File("");
	
	public static void Leer() {
		

		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\vehiculos.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numVehiculos = objectInputStream.readInt();
			Vehiculo vehiculo;
			for (int i =1; i<=numVehiculos; i++ ) {
				vehiculo = (Vehiculo) objectInputStream.readObject();
				Vehiculo.adicionarVehiculo(vehiculo);
				
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\sedes.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numVehiculos = objectInputStream.readInt();
			
			for (int i =1; i<=numVehiculos; i++ ) {
				Vehiculo.adicionarVehiculo(((Vehiculo) objectInputStream.readObject()));
				// Adicionar print en caso de querer mostrarlos por consola
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}

		// Repartidores
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\repartidores.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numRepartidores = objectInputStream.readInt();
			Repartidor repartidor;
			for (int i =1; i <= numRepartidores; i++ ) {
				repartidor = (Repartidor) objectInputStream.readObject();
				Repartidor.adicionarRepartidor(repartidor);
				
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		// Clientes
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\clientes.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numClientes = objectInputStream.readInt();
			Cliente cliente;
			for (int i =1; i <= numClientes; i++ ) {
				cliente = (Cliente) objectInputStream.readObject();
				Cliente.adicionarCliente(cliente);
				
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\ordenes.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numOrdenes = objectInputStream.readInt();
			Orden orden;
			for (int i =1; i <= numOrdenes; i++ ) {
				orden = (Orden) objectInputStream.readObject();
				Orden.adicionarOrden(orden);
				
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}

		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\productos.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numProductos = objectInputStream.readInt();
			Producto producto;
			for (int i =1; i<=numProductos; i++ ) {
				producto = (Producto) objectInputStream.readObject();
				Vehiculo.adicionarProducto(producto);
				
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}

	}
}
