package orden;
import java.util.*;
import gestionHumana.*;
public class Producto {
	private String nombre;
	private String descripcion;
	private long precio;
	private int cantidad;
	private static ArrayList<Producto> productos = new ArrayList<>();
	Producto(String nom,String des,long pre,int can){
		this.nombre=nom;
		this.descripcion=des;
		this.precio=pre;
		this.cantidad = can;
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
	void setCantidad(int i) {
		this.cantidad = i;
	}
	int getCantidad() {
		return this.cantidad;
	}
	
	public static void agregarProducto(String nom,String des,long pre,int can) {
		productos.add(new Producto(nom, des, pre, can));
		System.out.println("Producto creado con exito.");
	}
	public static void verProductos() {
		for (int i = 0; i<productos.size();i++) {
			System.out.println("\nProducto "+ (i+1));
			System.out.println(productos.get(i));
		}
	}
	
	public String toString() {
		return "Nombre: "+this.nombre+", descripcion: " + this.descripcion + ", precio: " + this.precio + ", cantidad.";
	}
}
