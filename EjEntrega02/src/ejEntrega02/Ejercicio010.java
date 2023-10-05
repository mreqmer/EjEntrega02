package ejEntrega02;

import java.util.Scanner;

public class Ejercicio010 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		int n1;//recoge el primer número introducido por el usuario
		int n2;//recoge el segundo número introducido por el usuario
		int n3;//recoge el tercer número introducido por el usuario
		//Pedir números al usuario
		System.out.print("Introduce el primer número:"); //pide el primer número al usuario
		n1 = sc.nextInt();//escaner n1
		System.out.print("Introduce el segundo número:");//pide el segundo número al usuario
		n2 = sc.nextInt();//escaner n2
		System.out.print("Introduce el tercer número:");//pide el tercer número al usuario
		n3 = sc.nextInt();//escaner n3
		//Ver si n1 es la suma de n2 y n3
		if ((n2 + n3) == n1) {
			System.out.println(n1 + " es la suma de " + n2 + " y " + n3);
		//ver si n2 es la suma de n1 y n3
		}else if ((n1 + n3) == n2) {
			System.out.println(n2 + " es la suma de " + n1 + " y " + n3);
			//ver si n3 es la suma de n1 y n2
		}else if ((n1 + n2) == n3) {
			System.out.println(n3 + " es la suma de " + n1 + " y " + n2);
		}else{//mensaje de error
			System.out.println("Error. Introduce un número entero.");
		}
			
		sc.close();//cierre de escaner
		}

	}