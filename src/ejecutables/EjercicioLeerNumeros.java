package ejecutables;

import java.util.Scanner;

public class EjercicioLeerNumeros {

	public static void main(String[] args) {
	/*la maquina genera un numero aleatorio y vamos a leer numeros 
		y todo el rato comparar con el aleatorio, contar los intentos y ponerlos al final del programa;
		Se acaba el programa cuando aciertas el numero
	*/
	
		Scanner	leer = new Scanner(System.in);
	
		int numAleatorio = 17, numeroIntroducido = 0, numIntentos= 0;
	 
		System.out.println("Dime un numero y lo comparo con el aleatorio");
	
		numeroIntroducido = leer.nextInt();	
		
		while (numeroIntroducido != numAleatorio) {
			
			numIntentos ++;
			System.out.println("Dime un numero y lo comparo con el aleatorio");
			numeroIntroducido = leer.nextInt();
		}
		
		//recuento
		System.out.println("Has adivinado que era " + numAleatorio +" en " + numIntentos++ + " intentos");
		
	}
}
