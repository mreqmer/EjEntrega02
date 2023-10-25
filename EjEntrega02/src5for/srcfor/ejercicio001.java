package srcfor;
import java.util.Scanner;
public class ejercicio001 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int n;//numero que introduce el usuario
		//Pide el número hasta el que se contará
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		//empieza el for
		for(int num = 1; n>=num; num++ ) {
			System.out.print(num + " ");
		}//acaba
		sc.close();
		
	}

}
