import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		num1 = leer.nextInt();
		
		System.out.println("Escribe un segundo numero");
		num2 = leer.nextInt();
		
		System.out.println("La suma de los numeros introducidos es " + (num1+num2));
		System.out.println("La multiplicacion de los numeros introducidos es " + (num1*num2));
		System.out.println("La resta de los numeros introducidos es " + (num1-num2));
		
		if (num2 != 0) {
			System.out.println("La division de los numeros introducidos es " + (num1/num2));
		}
		else {
		System.out.println("La division de cualquier numero entre 0 es indeterminacion");	
		}
		
		
		
		
	}

}
