package ejerciciost203;
import java.util.Scanner;
public class Ejercicio005 {

	public static void main(String[] args) {
			//Variables
			Scanner sc = new Scanner(System.in);
			int contador = 0;
			int n;
			int suma=0;
			int sumaNeg = 0;
			int contNeg = 0;
			int media;
			int ceros = 0;
			//Pedir número al usuario
			System.out.println("Introduce 10 números.");
			//while
			while(contador < 10) {
				System.out.print("Introduce el siguiente número: ");
				n = sc.nextInt();
				contador++;
					if (n==0) {
						ceros++;
					}else if (n<0) {
						sumaNeg = sumaNeg + n;
						contNeg++;
					}else if (n>0) {
						suma = suma + n;
					}
				
			}
			media = sumaNeg / contNeg;
			System.out.println("Suma de los números positivos: " + suma);
			System.out.println("Media de los números negativos " + media);
			System.out.println("Número de ceros " + ceros);
			sc.close();
		}
	}
