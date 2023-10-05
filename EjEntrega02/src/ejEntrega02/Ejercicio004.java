package ejEntrega02;

import java.util.Scanner;

public class Ejercicio004 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		double n1;//recoge el primer número introducido por el usuario
		double n2;//recoge el segundo número introducido por el usuario
		//Pedir números al usuario
		System.out.println("Introduce el primer número:");//Pide el primer número
		n1=sc.nextDouble();
		System.out.println("Introduce el segundo número:");//pide el segundo número
		n2=sc.nextDouble();
		//Comprobación de cual es el mayor
		if (n1 == n2) {//Mira si son iguales para devolver que son iguales
			System.out.println(n1 + " es igual a " + n2);
		} else if (n1 < n2) {// mira si n1 es menor que n2 para devolver que n1 es menor que n2
			System.out.println(n1 + " < " + n2);
		} else {//si n1 no es menor ni igual que n2 entonces devulve que n2 es mayor que n1
			System.out.println(n2 + " < " + n1);
		}
		sc.close();//cierre de escaner
	}

}
