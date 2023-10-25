package srcfor;

import java.util.Scanner;

public class Ejercicio009 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num;//número que introduce el usuario
		int cont = 0;
		
		System.out.print("Introduce un número para saber si es primo: ");
		num = sc.nextInt();
		for (int n=2; n<num; n++) {
			if (num%n==0) {
				cont++;
			}
		}
		if (cont>0) {
			System.out.println("No es primo.");
		}else {
			System.out.println("Es primo.");
		}
		sc.close();
	}
}

