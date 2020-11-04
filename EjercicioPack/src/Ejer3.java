import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num1, num2;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		num1 = leer.nextInt();
		
		System.out.println("Escribe un segundo numero");
		num2 = leer.nextInt();
		
		if (num1 < num2) {
			
			System.out.println("El numero " + num2 + " es mayor que " + num1);
		}else {
			
			if (num1 > num2) {
				System.out.println("El numero " + num1 + " es mayor que " + num2);
				
			}else {
				System.out.println("Ambos numeros son iguales");
			}
			
		}
		
	}

}
