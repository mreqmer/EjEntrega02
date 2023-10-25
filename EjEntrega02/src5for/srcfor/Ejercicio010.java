package srcfor;

import java.util.Scanner;

public class Ejercicio010 {

	public static void main(String[] args) {
		// Variable
		Scanner sc = new Scanner(System.in);
		int a, b;
		//Pedir los dos números al usuario
		System.out.println("Introduce dos números, asegúrate de que A sea menor que B");
		do {
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
			if (a>b) {
				System.out.println("Error. A es mayor que B.");
			}
		}while(a>b);
		for (int n = a ; n<=b ; n++) {
			System.out.print(n + " ");
		}
		
	
		sc.close();
	}
}
