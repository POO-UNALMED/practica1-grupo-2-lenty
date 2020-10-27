package orden;
import java.util.*;
import interfaz.Main;
import sede.*;
import vehiculo.Vehiculo;
import gestionHumana.*;
public class Orden {
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
	public void modificarOrden() {
		System.out.println("________________________\n");
		Scanner in=new Scanner(System.in);
		String op,ch;
		System.out.println("¿Qué desea modificar?");
		System.out.println("Seleccione una opcion: ");
		String aux="\n1 - ID de orden \n2 - Cliente de orden \n3 - Sede de orden \n4 - Repartidor de orden \n5 - Valor de orden \n6 - Cantidad de productos de orden \n7 - Peso total de orden \n8 - Estado de la Orden \n9 - Regresar";
		System.out.println(aux);
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5") || op.equals("6") || op.equals("7") || op.equals("8") || op.equals("9")) {
				break;
			}
			else {
				System.out.println("Ingresa una opcion valida");
				System.out.println(aux);	
			}
		}
		switch(op) {
		case "1":
			System.out.println("Ingrese un nuevo ID de la orden :");
			aux="Ingrese un nuevo ID de la orden :";
			while(true) {
				ch=in.next();
				if(isNumeric(ch)){
					this.setId(Integer.parseInt(ch));
					System.out.print("Cambio realizado, siga modificando \n");
					modificarOrden();
				}
				else {
					System.out.println("Ingresa una opcion valida");
					System.out.println(aux);
				}
			}
		case "2":
			//Seleccionar un nuevo cliente para la orden, luego cambiar el anterior por este.
			break;
			
		case "3":
			//Seleccionar una nueva Sede para la orden
			break;
			
		case "4":
			//Asignar un nuevo repartidor a la orden
			break;
			
		case "5":
			System.out.println("Ingrese un nuevo valor de la orden :");
			aux="Ingrese un nuevo valor de la orden :";
			while(true) {
				ch=in.next();
				if(isNumeric(ch)){
					this.setValor(Integer.parseInt(ch));
					System.out.print("Cambio realizado, siga modificando \n");
					modificarOrden();
				}
				else {
					System.out.println("Ingresa una opcion valida");
					System.out.println(aux);
				}
			}
		case "6":
			System.out.println("Ingrese una nueva cantidad de productos en la orden :");
			aux="Ingrese una nueva cantidad de productos en la orden :";
			while(true) {
				ch=in.next();
				if(isNumeric(ch)){
					this.setCantProductos(Integer.parseInt(ch));
					System.out.print("Cambio realizado, siga modificando \n");
					modificarOrden();
				}
				else {
					System.out.println("Ingresa una opcion valida");
					System.out.println(aux);
				}
			}
		case "7":
			System.out.println("Ingrese un nuevo peso total de la orden :");
			aux="Ingrese un nuevo peso total de la orden :";
			while(true) {
				ch=in.next();
				if(isNumeric(ch)){
					this.setPesoTotal(Integer.parseInt(ch));
					System.out.print("Cambio realizado, siga modificando \n");
					modificarOrden();
				}
				else {
					System.out.println("Ingresa una opcion valida");
					System.out.println(aux);
				}
			}
		case "8":
			System.out.println("Ingrese un nuevo estado de la orden :");
			this.setEstado(in.next());
			System.out.print("Cambio realizado, siga modificando \n");
			modificarOrden();
		case "9":
			Main.menuOrden();
		}
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
	void setEstado(String s) {
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
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
}
