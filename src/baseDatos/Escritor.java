package baseDatos;
import java.io.*;


import gestionHumana.*;
import orden.Orden;
import orden.Producto;

import sede.Sede;
import vehiculo.*;

public class Escritor {

	static File archivo = new File("");
	private static ObjectOutputStream objectOutputStream;
	public static void Escribir() {
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\vehiculos.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Vehiculo.getVehiculos()).size()));
			for (Vehiculo vehiculo : Vehiculo.getVehiculos())
				objectOutputStream.writeObject(vehiculo);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\sedes.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Sede.getSede()).size()));
			for (Sede sede : Sede.getSede())
				objectOutputStream.writeObject(sede);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\clientes.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Cliente.getClientes()).size()));
			for (Cliente cliente : Cliente.getClientes())
				objectOutputStream.writeObject(cliente);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\repartidores.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Repartidor.getRepartidores()).size()));
			for (Repartidor repartidor : Repartidor.getRepartidores())
				objectOutputStream.writeObject(repartidor);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\ordenes.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer(Orden.getOrdenes().size()));
			for (Orden orden : Orden.getOrdenes())
				objectOutputStream.writeObject(orden);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\productos.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Vehiculo.getVehiculos()).size()));
			for (Producto producto : Producto.getProductos())
				objectOutputStream.writeObject(producto);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		

	}
}	    
	

