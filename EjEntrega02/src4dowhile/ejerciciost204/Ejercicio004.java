package ejerciciost204;
import java.util.Scanner;
public class Ejercicio004 {

	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		int nUser;
		int contador = 0;
		int multiplicacion;
		
		System.out.print("Introduce un número: ");
		nUser = sc.nextInt();
		
		do {
			contador++;
			multiplicacion =nUser*contador;
			System.out.println(nUser + " * " + contador + " = " + multiplicacion);
		}while(contador <10);
		sc.close();
	}

}
