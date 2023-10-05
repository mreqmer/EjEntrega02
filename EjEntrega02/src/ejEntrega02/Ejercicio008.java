package ejEntrega02;
import java.util.Scanner;
public class Ejercicio008 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		double nota;//Recoge la nota del alumno
		//Pedir nota al usuario
		System.out.print("Introduce tu nota: ");
		nota = sc.nextDouble();//escaner de la nota
		//Comprobar clasificaciónde la nota
		if (nota >=0 && nota<5){//entre 0 y 5 insuficiente
			System.out.println("INSUFICIENTE");
		}else if (nota >=5 && nota<6) {//desde 5 a 6 suficiente
			System.out.println("SUFICIENTE");
		}else if (nota >=6 && nota<7) {//desde 6 a 7 bien
			System.out.println("BIEN");
		}else if (nota >=7 && nota<9) {//desde 7 a 0 notable
			System.out.println("NOTABLE");
		}else if (nota >=9 && nota<=10) {//de 9 a 10 sobresaliente
			System.out.println("SOBRESALIENTE");
		}else {//si no se cumple lo anterior mensaje de error
			System.out.println("Introduce una nota válida");
		}
		sc.close();//cierre de escaner
	}

}
