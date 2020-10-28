package gestionHumana;
import java.io.*;

import java.util.LinkedList;

public class Cliente extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String direccion;
	private String metPago;
	private long tarjeta;
	private static LinkedList<Cliente> clientes = new LinkedList<Cliente>();
	private int compras;
	
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
		int i = 0;
    	for(Cliente cliente: clientes) {
	    	System.out.println(i+"- Documento:"+cliente.getId()+"\n Nombre:"+cliente.getNombre()+"\n Telefono:"+cliente.getTelefono()+"\n Metodo Pago: "+cliente.getMetPago()+"\n Direccion:"+cliente.getDireccion());
	    	i++;
		}
	}
	
	public static LinkedList<Cliente> getClientes() {
		return clientes;
	}
	
	public static void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
}
