package ejerciciost204;
import java.util.Scanner;
public class Ejercicio003 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int nUser;
		int suma=0;
		System.out.print("Introduce un número: ");
		nUser = sc.nextInt();
		do {
			suma = suma+ n;
			n++;
		}while(n<=nUser);
		System.out.println("La suma de los números es: " + suma);
		sc.close();
	}

}
