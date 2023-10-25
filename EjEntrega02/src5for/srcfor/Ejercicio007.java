package srcfor;
import java.util.Scanner;
public class Ejercicio007 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num;
		int factorial=1;
		//Pedir número para realizar su factorial
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		for (int n=num; n>=1; n--) {
			factorial = factorial * n;
			if (n==1) {
				System.out.print(n+ "=");
			}else if (n!=1)
				System.out.print(n+"*");
		}
		System.out.println(factorial);
	
		sc.close();
	}

}
