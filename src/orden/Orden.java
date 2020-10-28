package orden;
import java.util.*;
import gestionHumana.*;
<<<<<<< Updated upstream
public class Orden {
=======
public class Orden implements Serializable {
	private static final long serialVersionUID = 1L;
	private static LinkedList<Orden> ordenes = new LinkedList<Orden>();
	private static int idG = 0;
>>>>>>> Stashed changes
	private int id;
	private Cliente cliente;
	// private Sede sede;
	private Repartidor repartidor;
	private int valor;
	private int cantProductos;
	// private List<Producto> productos= new ArrayList<>();
	private float pesoTotal;
<<<<<<< Updated upstream
	private boolean estado;
	public void cancelarOrden(Orden i) {
=======
	public String estado;
	public Orden(Cliente c,Sede s,Repartidor r,int valor,List<Producto> p,float peso,String es) {
		idG++;
		this.id=idG;
		this.cliente=c;
		this.sede=s;
		this.repartidor=r;
		this.valor=valor;
		productos = p;
		this.cantProductos=p.size();
		this.pesoTotal=peso;
		this.estado=es;
		s.sumarVenta();
		ordenes.add(this);
	}
	
	static public void consultarOrdenesActivas() {
    	int i = 0;
    	for(Orden orden: ordenes) {
    		if(true) {
    			System.out.println(i+"- ID: "+orden.getId()+" \nCliente: "+orden.getCliente().getNombre()+" \nDirección sede: "+orden.getSede().getDireccion()+" \nRepartidor: "+orden.getRepartidor().getNombre()+" \nValor: "+orden.getValor()+" \nCantidad de productos: "+orden.getCantProductos()+" \nPeso total: "+orden.getPesoTotal()+" \nEstado: "+orden.getEstado()+"\n\n");
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
>>>>>>> Stashed changes
		
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
	//void setSede(Sede i){
	//this.sede=i;
	//}
	//Sede getSede(){
	//return this.sede;
	//}
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
