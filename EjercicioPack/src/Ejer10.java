import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cero = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero diferente de 0");
		while (cero == 0) {
		cero = leer.nextInt();
		}
		
		if (cero%2 != 0) {
			System.out.println("El numero introducido es impar");
		} else {
			System.out.println("El numero introducido es par");
		}
		
	}

}
