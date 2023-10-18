package ejerciciost203;
import java.util.Scanner;
public class Ejercicio006 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		int suma = 0;
		double media;
		int mEdad = 0;
		int contador = 0;
		//Pedir datos
		System.out.println("Estadísticas de edades.");
		System.out.print("Edad de alumno: ");
		edad = sc.nextInt();
		//while
	
		while(edad >= 0) {
			if(edad>=18) {
				mEdad++;
			}
			contador++;
			suma = suma + edad;
			System.out.print("Edad de alumno: ");
			edad = sc.nextInt();
		
			
			
		}
			
		media = suma / contador;
		System.out.println("Hay " + contador + " alumnos, de los cuales " + mEdad + " son mayores de edad.");
		System.out.println("La media de edad es de " + media + " años");
		sc.close();
	}
}

