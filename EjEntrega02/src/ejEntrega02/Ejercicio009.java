package ejEntrega02;

import java.util.Scanner;

public class Ejercicio009 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		final String PIEDRA="Piedra"; //recoge la constante piedra
		final String PAPEL="Papel"; //recoge la constante papel
		final String TIJERA="Tijera";//Recoge la constante tijera
		String j1;//recoge el resultado del jugador 1
		String j2;// recoge el resultado del jugador 2
		//Pedir datos al j1
		System.out.print("PIEDRA, PAPEL, TIJERA \nEscriba Piedra, Papel o Tijera para comenzar. \nJ1:");
		j1 = sc.nextLine();//escaner de j1
		//pedir datos al j2
		System.out.print("J2:");
		j2 = sc.nextLine();//escaner de j2
		//devuelve empate si ambos introducen lo mismo
		if( (j1.equals(PAPEL)&& j2.equals(PAPEL))||(j1.equals(TIJERA)&& j2.equals(TIJERA))||(j1.equals(PIEDRA)&& j2.equals(PIEDRA))) {
			System.out.println("EMPATE");
		//recoge los condicionales para que gane j2
		}else if((j2.equals(PAPEL) && j1.equals(PIEDRA)) || (j2.equals(PIEDRA) && j1.equals(TIJERA) || (j2.equals(TIJERA)&& j1.equals(PAPEL)) )) {
			System.out.println("J2 gana");
		//recoge los condicionales para que gane j1	
		}else if((j1.equals(PAPEL) && j2.equals(PIEDRA)) || (j1.equals(PIEDRA) && j2.equals(TIJERA) || (j1.equals(TIJERA)&& j2.equals(PAPEL)) )) {
			System.out.println("J1 gana");
		//Mensaje de error	
		}else {
			System.out.println("Error");
		}
		
		sc.close();//cierre de escaner
	}

}
