package srcfor;

import java.util.Scanner;

public class Ejercicio009v2 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num;//número que introduce el usuario
		boolean primo = true;
		
		System.out.print("Introduce un número para saber si es primo: ");
		num = sc.nextInt();
		for (int n=2; n<num; n++) {
			if (num%n==0) {
			primo = false;
			break;
			}
		}
			if (primo=true) {
				System.out.println("No es primo.");
			}else if (primo=false){
				System.out.println("Es primo.");
			}
		
		sc.close();
	}
}