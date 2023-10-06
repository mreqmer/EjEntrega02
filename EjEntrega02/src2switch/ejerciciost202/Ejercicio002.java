package ejerciciost202;

import java.util.Scanner;

public class Ejercicio002 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Scanner
		int nDia;//guarda el número introducida por el usuario
		//Pedir nota al usuario
		System.out.println("Introduce un número entre 1 y 7");
		nDia = sc.nextInt();//escner del número
		//Calcular el día de la semana
		switch(nDia) {
			case 1 ->{
			System.out.println("Lunes");}
			case 2 ->
			System.out.println("Martes");
			case 3 ->
			System.out.println("Miercoles");
			case 4 ->
			System.out.println("Jueves");
			case 5 ->
			System.out.println("Viernes");
			case 6 ->
			System.out.println("Sábado");
			case 7 ->
			System.out.println("Domingo");
			default ->
			System.out.println("Introduce una número válido.");
		}
					
		sc.close();
			
	}

}

