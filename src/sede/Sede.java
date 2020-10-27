package sede;
import java.util.*;

import vehiculo.Vehiculo;

import java.io.*;
public class Sede implements Serializable {
	private static final long serialVersionUID = 1L;
	private static LinkedList<Sede> sedes= new LinkedList<Sede>();
	private String direccion;
	private long telefono;
	private long cantVentas; 
	
	public Sede(String direccion, long telefono) {
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	public void enviar() {
		
	}
	
	static public void consultarSedes() {
    	int i = 0;
    	for(Sede sede: sedes) {
    	System.out.println(i+"- Direccion:"+ sede.direccion+" teledono:"+sede.telefono+" Ventas:"+sede.cantVentas);
    	i++;
		}
    }
	
	
	public static Sede sedeMayorVentas() {
		long aux = 0;
		int contador = 0;
		Sede p = null;
		for (Sede sede : sedes) {
			if (sede.cantVentas>aux) {
				aux = sede.cantVentas;
				p = sedes.get(contador);
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
