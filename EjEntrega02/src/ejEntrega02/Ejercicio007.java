package ejEntrega02;
import java.util.Scanner;
public class Ejercicio007 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		int n1;//introduce el número del usuario
		//Pedir un número al usuario
		System.out.print("Introduce un número: ");
		n1 = sc.nextInt();//escaner de n1
		//Condicional si tiene 1 cifra
		if (n1 <= 9 && n1 >=0) {
			System.out.println(n1 + " tiene 1 cifra.");
		//Condicional si tiene 2 cifra
		}else if (n1 <= 99 && n1>=10 ){
			System.out.println(n1 + " tiene 2 cifras");
		//Condicional si tiene 3 cifra
		}else if (n1 <= 999 && n1>=100 ){
			System.out.println(n1 + " tiene 3 cifras");
		//Condicional si tiene 4 cifra
		}else if (n1 <=9999 && n1>=1000){
			System.out.println(n1 + " tiene 4 cifras");
		//Condicional si tiene 5 cifra
		}else if (n1 <=99999 && n1 >=10000){
			System.out.println(n1 + " tiene 5 cifras.");
		//Si no se cumple lo anterior devuelve mensaje de error
		}else 
			System.out.println("Error, introduce un número entre 0 y 99999");
		sc.close();//Cierre de escaner

	}

}
