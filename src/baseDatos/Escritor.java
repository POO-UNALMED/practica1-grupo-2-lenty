package baseDatos;
import java.io.*;

import sede.Sede;
import vehiculo.*;

public class Escritor {

	static File archivo = new File("");
	private static ObjectOutputStream objectOutputStream;
	public static void Escribir() {
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\scr\\baseDatos\\temp\\vehiculos.txt");
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
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\scr\\baseDatos\\temp\\sedes.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Vehiculo.getVehiculos()).size()));
			for (Sede sede : Sede.getSede())
				objectOutputStream.writeObject(sede);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
	}
}	    
	

