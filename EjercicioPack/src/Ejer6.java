import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe un numero entero");
		num = leer.nextInt();
		
		if (num > 0) {
			
			System.out.println("Del numero " + num + " su raiz es " + Math.sqrt(num) + " y su potencia es " + Math.pow(num, 2));
			
		} else {
			System.out.println("¡Error al inicializar programa!");
		}
		
	}

}
