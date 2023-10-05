package ejEntrega02;
import java.util.Scanner;
public class Ejercicio001 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		int n1;//Guarda el número introducido por el usuario
		//Pedir número al usuario para ver si es par o impar
		System.out.println("Introduce un número:");
		n1= sc.nextInt();//escaner del número
		//Calcular si es par o impar
		if (n1 % 2==0) {
				System.out.println(n1 + " es par.");//Resultado si es par
		} else { 
			System.out.println(n1 + " es impar.");//Resultado si es impar
		}
		sc.close();//cierre de escaner
	}

}
