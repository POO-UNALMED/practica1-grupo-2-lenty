package Vehiculo1;
import gestionHumana.*;

public class Vehiculo {
	private String placa;
	//private String propietario;
	private int matricula;
	private String marca;
	private Boolean documentosAlDia;
	private Repartidor repartidor;
	
	Vehiculo() {
		this(null, 0, null, null);
	}
	
	Vehiculo(String placa, int matricula) {
		this(placa, matricula, null, null);
	}
	Vehiculo(int matricula, String marca) {
		this(null, matricula , marca, null);
	}
	Vehiculo(int matricula) {
		this(null, matricula, null, null);
	}
	Vehiculo(Repartidor repartidor) {
		this(null, 0, null, repartidor);
	} 
	Vehiculo(String placa, int matricula, String marca) {
		this(placa, matricula, marca, null);
	}
		
	
	Vehiculo(String placa, int matricula, String marca, Repartidor repartidor) {
		this.placa = placa;
		this.matricula = matricula;
		this.marca = marca;
		this.repartidor = repartidor;
		this.estadoDocumentos();
	}
	
	public Boolean estadoDocumentos() {
		if  (placa.equals(null) || matricula == 0 || marca.equals(null) )  {
			
			return documentosAlDia = false;
		}
		else {
			return documentosAlDia = true;
		}
		
	}
	
				
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/*public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}*/
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/*public Boolean getDocumentosAldia() {
		return documentosAlDia;
	}
	public void setDocumentosAldia(Boolean documentosAldia) {
		this.documentosAlDia = documentosAldia;
	}*/
	public Repartidor getRepartidor() {
		return repartidor;
	}
	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}
	
	

}


