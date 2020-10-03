package gestionHumana;

public class Cliente extends Persona {
	
	private String direccion;
	private String metPago;
	private long tarjeta;
	
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
    
    public void crearOrden(){
        
    }
    
    public void pagar() {
        
    }
}
