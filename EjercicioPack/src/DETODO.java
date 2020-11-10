import java.util.Random;

public class DETODO {

	
	public static void saludar()	{
		
		System.out.println("Hola Juan");
	}
	
	public static String saludar() {
		String nombre = "Juanfra";
		System.out.println("Hola " + nombre);
		return nombre;
		
	}
	
	//sout Sirve para algo: Pero no se como usarlo.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		//Cadenas con Vectores
		String vNombres[] = new String[10];
		
		
		
		int mNum[][] = new int [2][2];
		
		//Vectores
		int vNumeros[];
		vNumeros = new int[10];
		
		vNumeros[0] = 1;
		
		for (int i = 0; i < vNumeros.length; i++) {
			
			System.out.println(vNombres[]);
			
		}
		
		//Rellenar Matrices Aleatoriamente y mostrarlas
		
		Random azar = new Random();
		
		
		
		for (int i = 0; i < mNum[i].length; i++) {
			for (int j = 0; j < mNum[j].length; j++) {
				
				mNum[i][j]= Azar.nextInt(9);
				
			}
		}
		
		for (int i = 0; i < mNum[i].length; i++) {
			for (int j = 0; j < mNum[j].length; j++) {
				
				System.out.print(mNum[i][j]+ ' ');
		
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
