package srcfor;
public class ejercicio006 {

	public static void main(String[] args) {
		// Variables
		int suma = 0;
		for (int n=1; n<=19; n += 2) {
			suma = suma + n;
			System.out.print(n + " ");
		}
		System.out.println("\nLa suma de los 10 primeros números impares es: "+suma);
	}

}
