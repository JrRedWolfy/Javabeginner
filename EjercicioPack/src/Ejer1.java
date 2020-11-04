import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		int aux;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		num1 = leer.nextInt();
		
		System.out.println("Escribe un segundo numero");
		num2 = leer.nextInt();
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("El segundo numero escrito fue el " + num1);
		System.out.println("El primer numero escrito fue el " + num2);
		
	}

}
