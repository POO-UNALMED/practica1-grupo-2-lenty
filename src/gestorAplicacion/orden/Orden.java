package gestorAplicacion.orden;
import java.io.Serializable;
import java.util.*;
import gestorAplicacion.sede.*;
import gestorAplicacion.vehiculo.Vehiculo;
import gestorAplicacion.gestionHumana.*;
public class Orden implements Serializable {
	/*La clase orden fue realizada por Danilo, es la estructura principal del sistema de envios, ya que almacena y manipula objetos con las caracteristicas
	Necesarias para tener claridad en cuento a lo que se estar�a enviando, cuenta con los parametros necesarios para su identificacion y manipulacion,
	Como un ID que se le asigna a cada orden, se le adjunta un objeto de la clase Cliente para esclarecer a quien ir�a dirigido el envio, un objeto
	De la clase Sede que se referira al lugar donde se realizara la aceptada y el despacho de la orden, otro onjeto de clase Repartidor que se asignara
	Como el empleado que repartira, valga la redundacia, la misma orden, al final van los parametros m�s especificos, como el valor, los productos, guardados
	Como una lista, su cantidad de onjetos total, el peso total de la orden y, por ultimo, el estado de la orden, que mostrara en que parte del proceso va el 
	objeto ("Aceptada", "Activa","Enviada" y "Entregada").
	
	Tiene sus metodos unicos, suficientemente especificos, como para que se entida su funcion con el nombre de los mismos, como el de aceptar las ordenes, 
	cancelarlas, consultar las ordenes dentro de la base de datos, rechazar la orden. */
	private static final long serialVersionUID = 1L;	
	private static LinkedList<Orden> ordenes = new LinkedList<Orden>();
	private static int idG = 0;
	private int id;
	private Cliente cliente;
	private Sede sede;

	public Repartidor repartidor;

	private int valor;
	private int cantProductos;
	private List<Producto> productos= new ArrayList<>();
	private float pesoTotal;
	public String estado;
	public Orden(Cliente c,Sede s,Repartidor r,int valor,List<Producto> p,float peso,String es) {
		idG++;
		this.id=idG;
		this.cliente=c;
		this.sede=s;
		this.repartidor=r;
		this.valor=valor;
		setProductos(p);
		this.cantProductos=p.size();
		this.pesoTotal=peso;
		this.estado=es;
		c.sumarVenta();
		s.sumarVenta();
		r.aceptarPedido();
		ordenes.add(this);
		
	}
	static public void consultarOrdenesActivas() {
    	int i = 0;
    	for(Orden orden: ordenes) {
    		if(true) {
    			System.out.println(i+"- ID: "+orden.getId()+" \nCliente: "+orden.getCliente().getNombre()+" \nDirecci�n sede: "+orden.getSede().getDireccion()+" \nRepartidor: "+orden.getRepartidor().getNombre()+" \nValor: "+orden.getValor()+" \nCantidad de productos: "+orden.getCantProductos()+" \nPeso total: "+orden.getPesoTotal()+" \nEstado: "+orden.getEstado()+"\n\n");
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
		this.getRepartidor().terminarPedido();
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
	public static void ConsultarOrdenesTotales(){
		int i = 0;
    	for(Orden orden: ordenes) {
    			System.out.println(i+"- ID:"+orden.getId()+" Cliente:"+orden.getCliente().getNombre()+" Direcci�n sede:"+orden.getSede().getDireccion()+" Repartidor:"+orden.getRepartidor().getNombre()+" Valor:"+orden.getValor()+" Cantidad de productor:"+orden.getCantProductos()+" Peso total:"+orden.getPesoTotal()+" Estado:"+orden.getEstado());
    		i++;
    	}
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
}