package orden;
import java.util.*;
import sede.*;
import gestionHumana.*;
public class Orden {
	private int id;
	private Cliente cliente;
	private Sede sede;
	private Repartidor repartidor;
	private int valor;
	private int cantProductos;
	// private List<Producto> productos= new ArrayList<>();
	private float pesoTotal;
	private boolean estado;
	public void cancelarOrden(Orden i) {
		
	}
	public void modificarOrden(Orden i) {
		
	}
	public void aceptarOrden(Orden i) {
		
	}
	public void rechazarOrden(Orden i) {
		
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
	void setEstado(boolean i) {
		this.estado=i;
	}
	boolean getEstado() {
		return this.estado;
	}
}
