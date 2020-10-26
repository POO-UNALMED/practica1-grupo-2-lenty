package gestionHumana;

import java.util.LinkedList;

import orden.Producto;
import sede.Sede;

public class Cliente extends Persona {
	
	private String direccion;
	private String metPago;
	private long tarjeta;
	private static LinkedList<Cliente> clientes = new LinkedList<Cliente>();
	
	public Cliente(String direccion, String metPago, long tarjeta, long id, String nombre, String genero, String telefono) {
        super(id, nombre, genero, telefono);
        this.direccion = direccion;
        this.metPago = metPago;
        this.tarjeta = tarjeta;
    }

    public Cliente(String direccion, String metPago, long tarjeta, long id, String nombre, String telefono) {
        super(id, nombre, telefono);
        this.direccion = direccion;
        this.metPago = metPago;
        this.tarjeta = tarjeta;
    }

    public Cliente(String direccion, String metPago, long tarjeta) {
        this.direccion = direccion;
        this.metPago = metPago;
        this.tarjeta = tarjeta;
    }
	
	public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetPago() {
        return metPago;
    }

    public void setMetPago(String metPago) {
        this.metPago = metPago;
    }

    public long getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(long tarjeta) {
        this.tarjeta = tarjeta;
    }
    
	public static void agregarCliente(String direccion, String metPago, long tarjeta, long id, String nombre, String genero, String telefono) {
		clientes.add(new Cliente(direccion, metPago, tarjeta, id, nombre, genero, telefono));
		System.out.println("Cliente creado con exito.");
	}
	
	public static void verClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println("\nCliente "+ (i+1));
			System.out.println(clientes.get(i));
		}
	}
	
	public static LinkedList<Cliente> getClientes() {
		return clientes;
	}
	
	public static void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
    
    public void crearOrden(){
        
    }
    
    public void pagar() {
        
    }
}
