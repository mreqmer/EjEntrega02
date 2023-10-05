package ejEntrega02;

import java.util.Scanner;

public class Ejercicio002 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		int n1;//Recogerá el primer número del usuario
		int n2;//Recogerá el segundo número del usuario
		//Pedir números al usuario
		System.out.println("Introduce un número:");
		n1= sc.nextInt();//escaner del número
		System.out.println("Introduce otro número:");
		n2= sc.nextInt();//escaner del número
		//Ver si son iguales o no
		if (n1==n2) {//Mira si son iguales
				System.out.println(n1 + " y " + n2 + " son el mismo número");
		} else { //mensaje si no son iguales
			System.out.println(n1 + " y " + n2 + " son distintos números");
		}
		sc.close();//cierre de escaner
	}

}
