package ejecutables;

public class Ejercicio05IFConString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad1 = "susan", cad2="susan";
		
		if(cad1.equals(cad2)) {
			
			System.out.println("Son iguales");
		}
			else {
			
				System.out.println("son distintas");
			
			}
	
		String cad3 = new String("andres");
		String cad4 = new String("andres");
		
		if(cad3.equals(cad4) ) {
			
			System.out.println("SON IGUALES");
		}
			else {
				
				System.out.println("SON DISTINTAS");
			
			}
		
	}

}
