package ejerciciost203;

import java.util.Scanner;

public class Ejercicio003 {

	public static void main(String[] args) {
		// Variables
				int n;
				int suma = 0;
				int contador = 0;
				int media;
				Scanner sc = new Scanner(System.in);
				//Pide un número al usuario para ir sumandolos mientras no sean negativos
				System.out.println("Introduce números para hacer media, introduce un número negativo para parar.");
				System.out.print("Primer número: ");
				n = sc.nextInt();
				//Suma los números mientras no sean negativos
				while (n >=0) {
					suma += n;
					contador ++;
					System.out.print("Siguiente número: ");
					n = sc.nextInt();
				}
				//Cálculo de la media
				media = (suma /contador);
				//Devuelve al usuario el resultado
				System.out.print("La media de los números es: " + media );
				sc.close();

	}

}
