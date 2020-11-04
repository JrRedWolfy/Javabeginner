import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;

		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe un numero, que puede ser negativo");
		num1 = leer.nextInt();

		System.out.println("Escribe un segundo numero");
		num2 = leer.nextInt();

		System.out.println("Escribe un tercer numero");
		num3 = leer.nextInt();
		
		if (num1 < 0) {
			
			System.out.println("La multiplicacion de los tres numeros es " + (num1*num2*num3));
			
		} else {
			
			System.out.println("La suma de los tres numeros es " + (num1+num2+num3));
			
		}
		
		
		
		
		
		
	}

}
