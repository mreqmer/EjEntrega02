package ejerciciost203;
import java.util.Scanner;
public class Ejercicio001 {

	public static void main(String[] args) {
		// Variables
		int n;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		//Pide un número al usuario para ir sumandolos mientras no sean negativos
		System.out.println("Introduce números para sumarlos, introduce un número negativo para parar.");
		n = sc.nextInt();
		//Suma los números mientras no sean negativos
		while (n >=0) {
			suma += n;
			System.out.print("Siguiente número: ");
			n = sc.nextInt();
		}
		//Devuelve al usuario el resultado
		System.out.print("La suma de los números es: " + suma);
		sc.close();
	}
		
}
