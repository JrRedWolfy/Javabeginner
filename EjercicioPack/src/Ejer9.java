import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cero;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero");
		cero = leer.nextInt();
		
		
		if (cero%2 != 0) {
			System.out.println("El numero introducido es impar");
		} else {
			if (cero == 0) {
				System.out.println("El numero introducido es el numero mas par de todos ya que el 0 podria dividirse infinitamente por 2 y siempre resultaria en un numero par y entero.");
			} else {
				
				System.out.println("El numero introducido es par");
				
			}
		}
	}
}
