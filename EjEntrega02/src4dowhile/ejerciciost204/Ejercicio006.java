package ejerciciost204;
import java.util.Scanner;
public class Ejercicio006 {

	public static void main(String[] args) {
		// Variables
		final String PIEDRA = "PIEDRA", PAPEL = "PAPEL", TIJERA = "TIJERA";
		final String S="S";
		Scanner sc = new Scanner (System.in);
		String j1;
		String j2;
		String cont;
		
		do {
			System.out.println("PIEDRA, PAPEL O TIJERA");
			do {
				System.out.println("Jugador 1:");
				j1 = sc.next();
			}while (!j1.equals(PIEDRA) && (!j1.equals(PAPEL)) && !j1.equals(TIJERA) );
			do {
				System.out.println("Jugador 2:");
				j2 = sc.next();
			}while (!j2.equals(PIEDRA) && (!j2.equals(PAPEL)) && !j2.equals(TIJERA) );
			if( (j1.equals(PAPEL)&& j2.equals(PAPEL))||(j1.equals(TIJERA)&& j2.equals(TIJERA))||(j1.equals(PIEDRA)&& j2.equals(PIEDRA))) {
				System.out.println("EMPATE");
			//recoge los condicionales para que gane j2
			}else if((j2.equals(PAPEL) && j1.equals(PIEDRA)) || (j2.equals(PIEDRA) && j1.equals(TIJERA) || (j2.equals(TIJERA)&& j1.equals(PAPEL)) )) {
				System.out.println("J2 gana");
			//recoge los condicionales para que gane j1	
			}else if((j1.equals(PAPEL) && j2.equals(PIEDRA)) || (j1.equals(PIEDRA) && j2.equals(TIJERA) || (j1.equals(TIJERA)&& j2.equals(PAPEL)) )) {
				System.out.println("J1 gana");
			}
			System.out.println("¿Quieres continuar?");
			cont = sc.next();
		}while (cont.equals(S));
		sc.close();
	}

}
