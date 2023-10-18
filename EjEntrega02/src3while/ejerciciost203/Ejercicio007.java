package ejerciciost203;
import java.util.Scanner;
public class Ejercicio007 {

	public static void main(String[] args) {
			// Variables
			Scanner sc = new Scanner(System.in);
			final int MIN = 1;
			final int MAX = 3;
			int random;
			int n;
			random = (int) (Math.random()* MAX + MIN);
			
			System.out.print("Introduce un número: ");
			n = sc.nextInt();
			
			
			while (n>=0 ) {
				if (n>random) {
					System.out.println("Tu número es mayor.");
					System.out.print("Introduce otro número o uno negativo para rendirte: ");
					n = sc.nextInt();
				}else if(n<random){
					System.out.println("Tu número es menor.");
					System.out.print("Introduce otro número o uno negativo para rendirte: ");
					n = sc.nextInt();
				}else if (n==random) {
					System.err.println("CORRECTO");
					break;
				}
			
			}
			if (n<0) {
				System.out.println("Usted se ha rendido.");
			}
			
			sc.close();
		}
	}

