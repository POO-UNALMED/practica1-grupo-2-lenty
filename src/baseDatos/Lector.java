package baseDatos;
import java.io.*;

import vehiculo.Vehiculo;

public class Lector {
	static ObjectInputStream objectInputStream;
	static File archivo = new File(" ");
	
	public static void leer() {
		

		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\scr\\baseDatos\\temp\\vehiculos.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numVehiculos = objectInputStream.readInt();
			Vehiculo vehiculo;
			for (int i =1; i<=numVehiculos; i++ ) {
				vehiculo = (Vehiculo) objectInputStream.readObject();
				Vehiculo.adicionarVehiculo(vehiculo);
				// Adicionar print en caso de querer mostrarlos por consola
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
	}
	
	

}
