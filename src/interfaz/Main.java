package interfaz;

import java.util.*;

import gestionHumana.*;
import orden.*;
import sede.*;
import vehiculo.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String op;
		
		System.out.println("Bienvenido");
		System.out.println("Seleccione una opcion");
		
		String aux="1 - Men� de Usuarios \n2 - Men� de Ordenes\n3 - Men� de Productos \n4 - Men� de Vehiculos \n5 - Men� de Sedes";
		System.out.println(aux);
		while (true) {
			op=in.next();
			if(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4") || op.equals("5")) {
				break;
			}
			else {
				System.out.println("Ingresa una opcion valida");
				System.out.println(aux);	
			}
		}
		
		switch(op) {
			case "1":
				System.out.println("Se entro 1");
				break;
				
			case "2":
				System.out.println("Se entro 2");
				break;
				
			case "3":
				System.out.println("Se entro 3");
				break;
				
			case "4":
				System.out.println("Se entro 4");
				break;
				
			case "5":
				System.out.println("Se entro 5");
				break;
		}
	}

}
