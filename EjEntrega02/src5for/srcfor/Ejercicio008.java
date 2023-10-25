package srcfor;

import java.util.Scanner;

public class Ejercicio008 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int nota, contNota=0;
		
		for (int n=0; n<5; n++) {
			System.out.print("Introduce tu nota: ");
			nota = sc.nextInt();
			if(nota<5) {
				contNota++;
			}
		}
		if (contNota >0) {
			System.out.println("Hay " + contNota + " suspensos.");
		}else {
			System.out.println("No hay suspensos.");
		}
			
		sc.close();
	}

}
