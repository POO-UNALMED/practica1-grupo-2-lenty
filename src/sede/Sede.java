package sede;
import java.util.*;

import vehiculo.Vehiculo;

import java.io.*;
public class Sede implements Serializable {
	private static final long serialVersionUID = 1L;
	private static LinkedList<Sede> sedes= new LinkedList<Sede>();
	private String direccion;
	private long telefono;
	
	public Sede(String direccion, long telefono) {
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	public void enviar() {
		
	}
	
	
	
	
	public Sede sedeMayorVenta() {
		int aux = 0;
		Sede p = null;
		for (int i=0;i<sedes.size();i++) {
			if (Collections.frequency(sedes, sedes.get(i))>aux) {
				aux = Collections.frequency(sedes, sedes.get(i));
				p = sedes.get(i);
			}
		}
		return p;
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
	public static LinkedList<Sede> getSede() {
		return sedes;
	}

	public static void adicionarSede(Sede sede) {
		sedes.add(sede);
	}
	
	
}
