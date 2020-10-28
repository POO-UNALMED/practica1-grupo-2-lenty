package orden;
import java.util.*;
import gestionHumana.*;
import sede.Sede;
public class Producto {
	private String nombre;
	private String descripcion;
	private long precio;
	private static LinkedList<Producto> productos = new LinkedList<>();
	private static LinkedList<Producto> ventas = new LinkedList<>();
	Producto(String nom,String des,long pre){
		this.nombre=nom;
		this.descripcion=des;
		this.precio=pre;
		this.adicionarProducto(this);
	}
	
	
	public static Producto productoMasVendido() {
		int aux = 0;
		Producto p = null;
		for (int i=0;i<ventas.size();i++) {
			if (Collections.frequency(ventas, ventas.get(i))>aux) {
				aux = Collections.frequency(ventas, ventas.get(i));
				p = ventas.get(i);
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
	
	public static void agregarProducto(String nom,String des,long pre,int can) {
		for (int i = 0; i < can; i++) {	
			productos.add(new Producto(nom, des, pre));
		}
		System.out.println("Producto creado con exito.");
	}
	public static void verProductos() {
		for (int i = 0; i<productos.size();i++) {
			System.out.println("\nProducto "+ (i+1));
			System.out.println(productos.get(i));
		}
	}

	public String toString() {
		return "Nombre: "+this.nombre+", descripcion: " + this.descripcion + ", precio: " + this.precio;
	}
	public static void adicionarProducto(Producto p) {
		productos.add(p);
	}



	public static LinkedList<Producto> getProductos() {
		return productos;
	}


	static void setProductos(LinkedList<Producto> productos) {
		Producto.productos = productos;
	}


	static LinkedList<Producto> getVentas() {
		return ventas;
	}


	static void setVentas(LinkedList<Producto> ventas) {
		Producto.ventas = ventas;
	}
	
	
}
