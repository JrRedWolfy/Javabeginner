import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;

		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe un numero");
		num1 = leer.nextInt();

		System.out.println("Escribe un segundo numero distinto al anterior");
		num2 = leer.nextInt();

		System.out.println("Escribe un tercer numero distinto a los anteriores");
		num3 = leer.nextInt();

		if ((num1 > num2) || (num1 > num3)) {

			System.out.println("El numero " + num1 + " es el mayor de los 3.");

		} else {
			if (num2 > num3) {
				System.out.println("El numero " + num2 + " es el mayor de los 3.");

			} else {
				System.out.println("El numero " + num3 + " es el mayor de los 3.");

			}
		}
	}
}
