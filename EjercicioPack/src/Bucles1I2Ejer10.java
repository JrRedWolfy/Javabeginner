
public class Bucles1I2Ejer10 {

	public static int cuentaletras (String frase, String letra) {
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if (frase.substring(i, i+1).equalsIgnoreCase(letra)) {
				contador++;
			}
			
			
			
		}
		
		
		return contador;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	System.out.println("Escribe una frase");
	num2 = leer.nextInt();
	
	System.out.println("Introduce una letra y te diremos el numero de veces que aparece en la frase");
	num2 = leer.nextInt();
	
	}

}
