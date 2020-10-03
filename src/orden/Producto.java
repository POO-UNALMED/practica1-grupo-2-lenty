package orden;
import java.util.*;
import gestionHumana.*;
public class Producto {
	private String nombre;
	private String descripcion;
	private long precio;
	Producto(String nom,String des,long pre){
		this.nombre=nom;
		this.descripcion=des;
		this.precio=pre;
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
