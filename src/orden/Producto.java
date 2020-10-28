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
	public long getPrecio() {
		return this.precio;
	}
<<<<<<< Updated upstream
=======
	
	public static void agregarProducto(String nom,String des,long pre) {
		Producto p = (new Producto(nom, des, pre));
		System.out.println("\nProducto creado con exito.");
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
	
	public static void agregarVenta(Producto p) {
		ventas.add(p);
	}
	
>>>>>>> Stashed changes
}
