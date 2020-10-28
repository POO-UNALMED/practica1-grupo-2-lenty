/* Clase Repartidor tiene los atributos
 * y metodos necesarios para registrar la informacion de los repartidores
 * @Autor: Manuel Escobar
 * */
package gestionHumana;
import java.util.Iterator;
import java.io.*;
import java.util.LinkedList;

import vehiculo.*;


public class Repartidor extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	private String entSalud;
	Vehiculo vehiculo;
    private int salario;
    public boolean disponibilidad;
    public static LinkedList <Repartidor> repartidores = new LinkedList<Repartidor>();
    int sumCalificaciones;
    int numCalificaciones;
    
    
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
     
    // Implementacion de metodo abstracto que permite agregar un nuevo repartidor a la lista de repartidores
    // Recibe los argumentos necesarios apra crear un nuevo objeto de tipo Repartidor
    public static void registrar(String entSalud, int salario, boolean disponibilidad, long id, String nombre, String genero, String telefono) {
		repartidores.add(new Repartidor(entSalud, salario, disponibilidad, id, nombre, genero, telefono));
		System.out.println("Repartidor creado con exito.");
	}
	
    //Metodo que permite mostrar por consola la lista de repartidores
	public static void verRepartidores() {
		int i = 0;
    	for(Repartidor repartidor: repartidores) {
	    	System.out.println(i+"- Documento:"+repartidor.getId()+"\n Nombre:"+repartidor.getNombre()+"\n Telefono:"+repartidor.getTelefono()+"\n ¿Disponible?"+repartidor.isDisponibilidad()+"\n Salario:"+repartidor.getSalario());
	    	i++;
		}
	}
	
	public static LinkedList<Repartidor> getRepartidores() {
		return repartidores;
	}
	
	public static void adicionarRepartidor(Repartidor repartidor) {
		repartidores.add(repartidor);
	}
    
}
