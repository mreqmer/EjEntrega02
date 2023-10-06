package ejerciciost202;
import java.util.Scanner;
public class Ejercicio005 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		String carnet;
		//Pedir datos al usuario
		System.out.print("Introduce tu tipo de carnet: ");
		carnet = sc.next();
		switch (carnet) {
			case "E" ->
			System.out.println("Remolques.");
			case "D" ->
			System.out.println("Autobuses.");
			case "C1", "C2", "C3", "C4", "C5" ->
			System.out.println("Camiones.");
			case "B1", "B2" ->
			System.out.println("Automóviles.");
			case "A" ->
			System.out.println("Motocicletas.");
			default ->
			System.out.println("Categoría no contemplada.");
		}
	
		sc.close();

	}

}
