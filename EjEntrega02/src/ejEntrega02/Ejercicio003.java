package ejEntrega02;

import java.util.Scanner;

public class Ejercicio003 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		double n1;//Recoge el número decimal introducido por el usuario
		//Pide el número al usuario
		System.out.println("Introduzca un número:");
		n1=sc.nextDouble();//escaner del número
		if (n1==0) {//Mira si es 0 para decir que no es casi 0
			System.out.println(n1 + " no es un número casi 0.");
		} else if (n1 < 1 && n1 > -1) {//mira si es un número casi 0
			System.out.println(n1 + " es un número casi 0.");
		} else {//mensaje si no es casi 0
			System.out.println(n1 + " no es un número casi 0.");
		}
		sc.close();//Cierre de escaner
	}

}
