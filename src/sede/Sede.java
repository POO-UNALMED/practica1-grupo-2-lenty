package sede;
import java.util.*;
public class Sede {
	private static List<Sede> sedes= new ArrayList<Sede>();
	private String direccion;
	private long telefono;
	private int ventas;
	
	public Sede(String direccion, long telefono) {
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	public void enviar() {
		
	}
	
	
	
	
	public Sede sedeMayorVenta() {
		int aux = 0;
		int p = 0;
		for (int i=0;i<sedes.size();i++) {
			if (sedes.get(i).ventas>aux) {
				aux = sedes.get(i).ventas;
				p = i;
			}
		}
		return sedes.get(p);
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	
}
