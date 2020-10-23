package orden;
import java.util.*;
import sede.*;
import gestionHumana.*;
public class Orden {
	private int id;
	private Cliente cliente;
	private Sede sede;

	public Repartidor repartidor;

	private int valor;
	private int cantProductos;
	// private List<Producto> productos= new ArrayList<>();
	private float pesoTotal;
	public String estado;
	public static void cancelarOrden(Orden i) {
		if(i.estado != "Entregada" && i.estado != "En camino") {
			i = null;
			System.out.println("Orden cancelada con exito");
		}
		else if (i.estado == "Entregada"){
			System.out.println("No se puede cancelar la orden, ya fue entregada");
		}
		else if (i.estado == "En camino"){
			System.out.println("No se puede cancelar la orden, ya fue enviada");
		}
		
	}
	public void modificarOrden(Orden i) {
		
	}
	public void aceptarOrden() {
		this.estado = "En proceso";
		System.out.println("La orden fue aceptada con exito");
		
	}
	public void rechazarOrden(Orden i) {
		
	}
	public void ordenEntregada() {
		this.estado = "Entregada";
		System.out.println("La orden fue entregada con exito");
		
	}
	public void ordenRecogida() {
		this.estado = "En camino";
		System.out.println("La orden fue recogida con exito");
	}
	
	
	void setId(int i) {
		this.id=i;
	}
	int getId() {
		return this.id;
	}
	void setCliente(Cliente i) {
		this.cliente=i;
	}
	Cliente getCliente() {
		return this.cliente;
	}
	void setSede(Sede i){
	this.sede=i;
	}
	Sede getSede(){
	return this.sede;
	}
	void setRepartidor(Repartidor i) {
		this.repartidor=i;
	}
	Repartidor getRepartidor() {
		return this.repartidor;
	}
	void setValor(int i) {
		this.valor=i;
	}
	int getValor() {
		return this.valor;
	}
	void setCantProductos(int i) {
		this.cantProductos=i;
	}
	int getCantProductos() {
		return this.cantProductos;
	}
	void setPesoTotal(float i) {
		this.pesoTotal=i;
	}
	float getPesoTotal() {
		return this.pesoTotal;
	}
}
