package srcfor;
import java.util.Scanner;
public class Ejercicio004 {

	public static void main(String[] args) {
		// Variable
		Scanner sc= new Scanner(System.in);
		int n;//número del usuario
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		for (int num=3; num<=n; num = num+3) {
			System.out.print(num+ " ");
			
		}
		sc.close();

	}

}
