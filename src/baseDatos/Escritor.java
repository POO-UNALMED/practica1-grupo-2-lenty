package baseDatos;
import java.io.*;
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
			
			objectOutputStream.flush();
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
	}
}	    
	

