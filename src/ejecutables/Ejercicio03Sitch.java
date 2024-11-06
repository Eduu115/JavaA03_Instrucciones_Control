package ejecutables;

import java.util.Scanner;

public class Ejercicio03Sitch {

	public static void main(String[] args) {
		/* Alternativa multiple, variable entera caracter o string
		 *  con valores especificos, y cada uno con un trato
		 *  En java se hace con Switch
	     */
		
		Scanner leer = new Scanner(System.in);
		
		String opcion = null; // null es un literal especial para clases, 
							  //no tiene valor porque no apunta a nada, no ocupa memoria
		
		System.out.println("Teclea una opcion entre: sumar, restar, multiplicar, dividir");
		opcion = leer.next();

		switch (opcion) {

		case "sumar":
			System.out.println("sumando");
			break;
		case "restar":
			System.out.println("restando");
			break;
		case "multiplicar":
			System.out.println("multiplicando");
			break;
		case "dividir":
			System.out.println("dividiendo");
			break;
		default:
			System.out.println("opcion erronea");
		
		}

		System.out.println("Fin de programa");
	
	}
	
}
