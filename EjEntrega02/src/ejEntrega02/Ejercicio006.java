package ejEntrega02;
import java.util.Scanner;
public class Ejercicio006 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		double a;//recoge el coeficiente a
		double b;//recoge el coeficiente b
		double c;//recoge el coeficiente c
		double comprobar;//recoge lo que hay dentro de la raid cuadrada
		double calculo1;//calcula la ecuacion +
		double calculo2;//calcula la ecuacion -
		//Pedir datos al usuario
		System.out.println("Introduzca los coeficientes: ");
		System.out.print("a: "); //Recoge a
		a=sc.nextDouble();//escanea a
		System.out.print("b: ");//Recoge b
		b=sc.nextDouble();//escanea b
		System.out.print("c: ");//Recoge c
		c=sc.nextDouble();//escanea c
		//Cálculo de la ecuación de segundo grado:
		comprobar = Math.pow(b,2) -(4*a*c) ;//calcula lo que hay dentro de la raid cuadrada
		calculo1 = (-b + Math.sqrt(comprobar))/(2*a); //operacion +
		calculo2 = (-b - Math.sqrt(comprobar))/(2*a);//operacion -
		//condicionales
		if (2*a == 0) { // mira si el divisor es 0
			System.out.println("La ecuación de segundo grado no es válida");//mensaje de error
			} else if (comprobar <=0) {//mira si la raid es negativa
				System.out.println("La ecuación de segundo grado no es válida");//mensaje de error
			} else {//si no se cumple lo anterior devuelve la solución
				System.out.println("La soluciones son:\n" + calculo1 + "\n y \n" + calculo2 );
		}
		sc.close();//cierre de escaner

	}

}
