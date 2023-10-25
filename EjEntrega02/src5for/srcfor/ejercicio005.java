package srcfor;
import java.util.Scanner;
public class ejercicio005 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num;
		int suma = 0;
		double  media;
		//Bucle para pedir números
		for (int n=0; n<10; n++) {
			System.out.println("Introduce un número");
			num = sc.nextInt();
			suma = suma + num;
		}
		
		media = (double)suma/10;
		System.out.println(media);
		sc.close();
	}

}
