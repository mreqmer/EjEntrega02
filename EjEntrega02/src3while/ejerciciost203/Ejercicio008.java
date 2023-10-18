package ejerciciost203;
import java.util.Scanner;
public class Ejercicio008 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int masAlto = 0;
		int arbol;
		
		System.out.print("Introduce la altura del árbol: ");
		arbol = sc.nextInt();
		
		while (arbol >=0) {
			if (arbol>masAlto) {
				masAlto = arbol;
			}
		System.out.print("Introduce la altura del árbol: ");
		arbol = sc.nextInt();
		}
		System.out.println("El árbol más alto mide: " + masAlto + "cm");
		sc.close();
	}
}

