package gestionHumana;
import java.util.Iterator;
import java.util.LinkedList;

import vehiculo.*;


public class Repartidor extends Persona {

	private String entSalud;
	Vehiculo vehiculo;
    private int salario;
    public boolean disponibilidad;
    public static LinkedList <Repartidor> repartidores = new LinkedList<Repartidor>();
    int sumCalificaciones;
    int numCalificaciones;
    float calificacion = sumCalificaciones/numCalificaciones;
    
    
    
    public Repartidor(String entSalud, int salario, boolean disponibilidad, long id, String nombre, String genero, String telefono) {
        super(id, nombre, genero, telefono);
        this.entSalud = entSalud;
        this.salario = salario;
        this.disponibilidad = disponibilidad;
    }

    public Repartidor(String entSalud, int salario, boolean disponibilidad, long id, String nombre, String telefono) {
        super(id, nombre, telefono);
        this.entSalud = entSalud;
        this.salario = salario;
        this.disponibilidad = disponibilidad;
        
    }

    public Repartidor(String entSalud, int salario, boolean disponibilidad) {
        this.entSalud = entSalud;
        this.salario = salario;
        this.disponibilidad = disponibilidad;
    }
    
    public void aceptarPedido() {
    	disponibilidad = false;
    }
    public void terminarPedido() {
    	disponibilidad = true;
    }
    
    public void asignarVehiculo() {
        Iterator <Vehiculo> iterador = (Vehiculo.getVehiculos()).listIterator(); 
        while(iterador.hasNext()) {
        	vehiculo = iterador.next();
        	if (vehiculo.getDocumentosAlDia() == true && vehiculo.getRepartidor() == null ) {
        		vehiculo.setRepartidor(this);
        	}
        }
    }
    
    public void desasignarVehiculo() {
    	vehiculo.setRepartidor(null);
        vehiculo = null;    	
    }
    public void calificarRepartidor(int calificacion) {
    	if(0 <= calificacion && calificacion <= 5 ) {
    		sumCalificaciones+= calificacion;
    		numCalificaciones++;
    	}
    }

    public String getEntSalud() {
        return entSalud;
    }

    public void setEntSalud(String entSalud) {
        this.entSalud = entSalud;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
     
    public static void agregarRepartidor(String entSalud, int salario, boolean disponibilidad, long id, String nombre, String genero, String telefono) {
		repartidores.add(new Repartidor(entSalud, salario, disponibilidad, id, nombre, genero, telefono));
		System.out.println("Repartidor creado con exito.");
	}
	
	public static void verRepartidores() {
		for (int i = 0; i < repartidores.size(); i++) {
			System.out.println("\nRepartidor "+ (i+1));
			System.out.println(repartidores.get(i));
		}
	}
	
	public static LinkedList<Repartidor> getRepartidores() {
		return repartidores;
	}
	
	public static void adicionarRepartidor(Repartidor repartidor) {
		repartidores.add(repartidor);
	}
    
}
