package ejerciciost203;

import java.util.Scanner;

public class Ejercicio002 {

	public static void main(String[] args) {
		//Variables
		int n;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		//Suma cuantos números introduce el usuario mientras no sean negativos
		System.out.println("Introduce números para contarlos, introduce un número negativo para parar.");
		n = sc.nextInt();
		//contador de números positivos
		while (n>=0) {
			contador++;
			System.out.print("Siguiente número:");	
			n = sc.nextInt();
		}
		System.out.println("Usted ha introducido " + contador + " números");
		sc.close();
	}
	
}
