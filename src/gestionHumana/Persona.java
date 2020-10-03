package gestionHumana;

public class Persona {
	
	private long id;
	private String nombre;
	private String genero;
	private String telefono;
	
	public Persona(long id, String nombre, String genero, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.telefono = telefono;
    }

    public Persona(long id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public Persona() {
        this(00, "Prueba", "123456");
    }
	
	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
	
}
