package ejEntrega02;

import java.util.Scanner;

public class Ejercicio005 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		double n1;//Recoge el primer numero introducido por el usuario
		double n2;//Recoge el segundo número introducido por el usuario
		double n3;//Recoge el tercer número introducido por el usuario
		//Pedir números al usuario
		System.out.println("Introduce el primer número:");
		n1=sc.nextDouble();//
		System.out.println("Introduce el segundo número:");
		n2=sc.nextDouble();
		System.out.println("Introduce el tercer número:");
		n3=sc.nextDouble();
		//Comprobación de cual es el mayor
		if (n1 > n2 && n1 > n3 && n2 > n3) { //condicional para ordenar en orden n1 > n2 > n3
			System.out.println(n1 + " > " + n2 + " > " + n3);
			//condicional para ordenar en orden n1 > n3 > n2
		} else if (n1 > n2 && n1 > n3 && n2 < n3) {
			System.out.println(n1 + " > " + n3 + " > " + n2 );
			//condicional para ordenar en orden n2 > n1 > n3
		} else if (n2 > n1 && n2 > n3 && n1 > n3 ) {
			System.out.println(n2 + " > " + n1 + " > " + n3);
			//condicional para ordenar en orden n2 > n3 > n1
		} else if (n2 > n1 && n2 > n3 && n3 > n1 ) {
			System.out.println(n2 + " > " + n3 + " > " + n1);
			//condicional para ordenar en orden n3 > n1 > n2
		} else if (n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.println(n3 + " > " + n1 + " > " + n2);
			//si no se cumple ninguna da n3 > n2 > n1
		} else {
			System.out.println(n3 + " > " + n2 + " > " + n1);
	}
		sc.close();//cierre de escaner
}

}