package ejerciciost204;

import java.util.Scanner;

public class Ejercicio008 {

	public static void main(String[] args) {
		//variables
		Scanner sc = new Scanner(System.in);
		String dado1, dado2;
		int suma;
		int num1, num2;
		//Preguntar al usuario por el primer número
		do {
		System.out.print("Introduce la primera tirada: ");
		dado1 = sc.next();
		
		System.out.print("Introduce la segunda tirada: ");
		dado2 = sc.next();
		//Cacular la suma de los números
		num1 = switch(dado1) {
			case "UNO"  -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" ->{
				yield 3;
			}
			case "CUATRO" ->{
				yield 4;
			}	
			case "CINCO" ->{
				yield 5;
			}
			case "SEIS" ->{
				yield 6;
			}
		}while (num1<1 && num1>6);
		
		num2 = switch(dado2) {
			case "UNO"  -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" ->{
				yield 3;
			}	
			case "CUATRO" ->{
				yield 4;
			}	
			case "CINCO" ->{
				yield 5;
			}
			case "SEIS" ->{
				yield 6;
			}
			default ->{
			System.out.println("Introduce un número válido");
				yield -1;
			}
		};

		if (num1 >=1 && num2 <=6) {
			suma = num1 + num2;
			System.out.println("La suma de los dados es: " + suma);
		}else	{
			System.err.println("ERROR");
		}
	
		sc.close();
		
	}

}