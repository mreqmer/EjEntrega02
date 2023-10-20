package ejerciciost204;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio005 {

	public static void main(String[] args) {
		// Variables
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		final String GANAS = "Ganas", MAYOR ="Mayor", MENOR="Menor";
		int max = 101, min = 1;
		int random = rand.nextInt(min,max);
		String prueba;
		
		
		do {
			random = rand.nextInt(min,max);
			System.out.println(random);
			System.out.println("Dime si es Mayor o Menor");
			prueba = sc.next();
			while(!prueba.equals(GANAS)&& !prueba.equals(MAYOR)&&!prueba.equals(MENOR)){
				System.err.println("Error");
				System.out.println("Introduce Mayor, Menor o Ganas:");
				prueba = sc.next();
			}
			if (prueba.equals(MENOR)) {
				max = random ;
			}else if (prueba.equals(MAYOR)){
				min = random+1;	
			}
		}while(!prueba.equals(GANAS)&& min!=max);
		if (min==max) {
		System.out.println("Me trolleaste :(");
		}else 
		System.out.println("oleee");
	
	sc.close();
	}

}


