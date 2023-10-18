package ejerciciost204;

import java.util.Scanner;

public class Ejercicio007 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		final String A = "A", B = "B", C = "C", D = "D", E = "E";
		int n1, n2;
		String menu;
		int suma, resta, mult, div;
	
		//Empieza el bucle principal
		do {
			//Pedir dos números al usuario
			System.out.print("Introduce el primer número:");
			n1 = sc.nextInt();
			System.out.print("Introduce el segundo número:");
			n2 = sc.nextInt();
			//Empieza otro bucle para que vuelva al menu si no se introduce una opcion valida
			do {
			//Menú 
				System.out.println("A.SUMAR LOS NÚMEROS");
				System.out.println("B.RESTAR LOS NÚMEROS");
				System.out.println("C.MULTIPLICAR LOS NÚMEROS");
				System.out.println("D.DIVIDIR LOS NÚMEROS");
				System.out.println("E.SALIR");
				//escaner para ver opcion del menú elige el usuario
				menu = sc.next();
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
				}
				//fin del bucle secundario que vuelve al menu
			}while(!menu.equals(A)&& !menu.equals(B)&& !menu.equals(C)&& !menu.equals(D)&& !menu.equals(E));
			//fin del bucle que vuelve al principio si no se sale
		}while(!menu.equals(E));
		
		sc.close();
	}


}


