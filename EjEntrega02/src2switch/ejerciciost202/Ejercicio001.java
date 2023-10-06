package ejerciciost202;
import java.util.Scanner;
public class Ejercicio001 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Scanner
		int nota;//guarda la nota introducida por el usuario
		//Pedir nota al usuario
		System.out.println("Introduce tu nota:");
		nota = sc.nextInt();//escner de la nota
		//Calcular la nota del usuario
		switch(nota) {
			case 0, 1, 2, 3, 4 ->{
			System.out.println("SUSPENSO");}
			case 5 ->
			System.out.println("SUFICIENTE");
			case 6 ->
			System.out.println("BIEN");
			case 7, 8 ->
			System.out.println("NOTABLE");
			case 9, 10 ->
			System.out.println("SOBRESALIENTE");
			default ->
			System.out.println("Introduce una nota válida");
		}
			
		sc.close();
	}

}
