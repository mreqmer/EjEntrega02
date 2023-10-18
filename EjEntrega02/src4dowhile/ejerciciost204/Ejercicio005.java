package ejerciciost204;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio005 {

	public static void main(String[] args) {
		// Variables
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		final String GANAS = "Ganas";
		int aleatorio = rand.nextInt(1,101);
		String prueba;
		aleatorio = rand.nextInt(1,101);
		System.out.println(aleatorio);
		
		do {
			
			System.out.println("Dime si es mayor o menor");
			prueba = sc.next();
				switch (prueba) {
					case "Mayor"->{
					aleatorio = rand.nextInt(aleatorio,101);
					System.out.println(aleatorio);
					}
					case "Menor"->{
					aleatorio = rand.nextInt(1,aleatorio);
					System.out.println(aleatorio);
					}
					case "Ganas"->{
						System.out.println("olee!!");
						}
			}
					
		}while(!prueba.equals(GANAS));	
		
	sc.close();
	}

}


