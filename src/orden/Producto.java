package orden;
import java.util.*;
import gestionHumana.*;
import sede.Sede;
public class Producto {
	private static List<Producto> productos= new ArrayList<>();
	private String nombre;
	private String descripcion;
	private long precio;
	Producto(String nom,String des,long pre){
		this.nombre=nom;
		this.descripcion=des;
		this.precio=pre;
	}
	
	
	public Producto productoMasVendido() {
		int aux = 0;
		Producto p = null;
		for (int i=0;i<productos.size();i++) {
			if (Collections.frequency(productos, productos.get(i))>aux) {
				aux = Collections.frequency(productos, productos.get(i));
				p = productos.get(i);
			}
		}
		return p;
	}
	
	
	
	void setNombre(String i) {
		this.nombre=i;
	}
	String getNombre() {
		return this.nombre;
	}
	void setDescripcion(String i) {
		this.descripcion=i;
	}
	String getDescripcion() {
		return this.descripcion;
	}
	void setPrecio(long i) {
		this.precio=i;
	}
	long getPrecio() {
		return this.precio;
	}
}
