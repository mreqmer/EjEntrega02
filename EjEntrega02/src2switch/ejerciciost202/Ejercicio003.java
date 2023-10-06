package ejerciciost202;

import java.util.Scanner;

public class Ejercicio003 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		String menu;
		int suma;
		int resta;
		int mult;
		int div;
		//Pedir dos números al usuario
		System.out.print("Introduce el primer número:");
		n1 = sc.nextInt();
		System.out.print("Introduce el segundo número:");
		n2 = sc.nextInt();
		//Menú 
		System.out.println("A.SUMAR LOS NÚMEROS");
		System.out.println("B.RESTAR LOS NÚMEROS");
		System.out.println("C.MULTIPLICAR LOS NÚMEROS");
		System.out.println("D.DIVIDIR LOS NÚMEROS");
		//escaner para ver opcion del menú elige el usuario
		menu = sc.next();
		//Devuelve la opción del menú elegida por el usuario
		switch(menu) {
			case "A" -> {
			suma = n1 + n2;
			System.out.println(suma);
			}
			case "B" -> {
			resta = n1 - n2;
			System.out.println(resta);
			}
			case "C" ->{
			mult = n1 * n2;
			System.out.println(mult);
			}
			case "D" ->{
			div = n1 / n2;
			System.out.println(div);
			}
			default ->
			System.out.println("ERROR. Introduce un caracter válido.");
		}
		sc.close();
	}

}


