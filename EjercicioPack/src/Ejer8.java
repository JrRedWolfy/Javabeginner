import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes;
		double importe;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el numero del mes");
		mes = leer.nextInt();
		System.out.println("Inserte el coste");
		importe = leer.nextInt();
		
		if (mes == 8) {
			System.out.println("El precio a pagar es " + importe*0.85 + "$");
		} else {
			System.out.println("El precio a pagar es " + importe + "$");
		}
	}

}
