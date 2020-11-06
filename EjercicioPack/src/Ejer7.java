import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double neo, nea, suma, porcen;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Inserte el numero de niños");
		neo = leer.nextInt();
		System.out.println("Inserte el numero de niñas");
		nea = leer.nextInt();
		
		suma = neo + nea;
		porcen =(neo*100)/suma;
		
		System.out.println("El tanto por ciento de niños es: " + porcen + "%.");
		
		System.out.println("El tanto por ciento de niñas es: " + (100-porcen) + "%.");
		
	}

}
