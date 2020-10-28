package orden;
import java.io.Serializable;
import java.util.*;
import interfaz.Main;
import sede.*;
import vehiculo.Vehiculo;
import gestionHumana.*;
public class Orden implements Serializable {
	private static final long serialVersionUID = 1L;
	private static LinkedList<Orden> ordenes = new LinkedList<Orden>();
	private int id;
	private Cliente cliente;
	private Sede sede;

	public Repartidor repartidor;

	private int valor;
	private int cantProductos;
	private List<Producto> productos= new ArrayList<>();
	private float pesoTotal;
	public String estado;
	public Orden(int id,Cliente c,Sede s,Repartidor r,int valor,int cantP,float peso,String es) {
		this.id=id;
		this.cliente=c;
		this.sede=s;
		this.repartidor=r;
		this.valor=valor;
		this.cantProductos=cantP;
		this.pesoTotal=peso;
		this.estado=es;
		ordenes.add(this);
	}
	static public void consultarOrdenesActivas() {
    	int i = 0;
    	for(Orden orden: ordenes) {
    		if(orden.getEstado().equals("Activa") || orden.getEstado().equals("Aceptada")) {
    			System.out.println(i+"- ID:"+orden.getId()+" Cliente:"+orden.getCliente().getNombre()+" Dirección sede:"+orden.getSede().getDireccion()+" Repartidor:"+orden.getRepartidor().getNombre()+" Valor:"+orden.getValor()+" Cantidad de productor:"+orden.getCantProductos()+" Peso total:"+orden.getPesoTotal()+" Estado:"+orden.getEstado());
    		}
    		i++;
    	}
    }
	public static void cancelarOrden(int i) {
		ordenes.remove(i);
	}
	public void aceptarOrden() {
		this.estado = "Aceptada";
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
	
	
	public void setId(int i) {
		this.id=i;
	}
	int getId() {
		return this.id;
	}
	public void setCliente(Cliente i) {
		this.cliente=i;
	}
	Cliente getCliente() {
		return this.cliente;
	}
	public void setSede(Sede i){
	this.sede=i;
	}
	Sede getSede(){
	return this.sede;
	}
	public void setRepartidor(Repartidor i) {
		this.repartidor=i;
	}
	Repartidor getRepartidor() {
		return this.repartidor;
	}
	public void setValor(int i) {
		this.valor=i;
	}
	int getValor() {
		return this.valor;
	}
	public void setCantProductos(int i) {
		this.cantProductos=i;
	}
	int getCantProductos() {
		return this.cantProductos;
	}
	public void setPesoTotal(float i) {
		this.pesoTotal=i;
	}
	float getPesoTotal() {
		return this.pesoTotal;
	}
	public void setEstado(String s) {
		this.estado=s;
	}
	String getEstado() {
		return this.estado;
	}
	public static LinkedList<Orden> getOrdenes(){
		return Orden.ordenes;
	}
	public static void adicionarOrden(Orden i) {
		ordenes.add(i);
	}
	
}
