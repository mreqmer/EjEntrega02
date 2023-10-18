package ejerciciost203;
import java.util.Scanner;
public class Ejercicio004 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int n;
		String paridad;
		//Pedir número al usuario
		System.out.println("Introduce un número para saber si es par o impar, introduce un número negativo para parar.");
		n = sc.nextInt();
		//Comprueba los números (par o impar) hasta que se introduce 0
		while (n != 0) {
			paridad = (n % 2 == 0) ? "par." : "impar." ;
			System.out.println("El número es " + paridad);
			System.out.print("Siguiente número: ");
			n = sc.nextInt();
			
		}
		System.out.println("FIN");
		sc.close();
	}

}
