package ejecutables;

public class Ejercicio02IfAnidados {

	public static void main(String[] args) {
		// nos dan 2 numeros y los comparamos
		int num1 = 4, num2 = 16;
		
		if (num1 > num2)
			System.out.println("Nume1 mayor que num2");
		else 
			if (num1 == num2) {
				System.out.println("Son iguales");
			}
			else {
				System.out.println("son SJDahdha");
				num1 -= num2;
			}

	}
}