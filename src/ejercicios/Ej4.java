package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Int
		int nota1, nota2, media;

		// mensaje que te dice que vayas a introducir la primera nota
		System.out.println("Introduzca un numero: ");

		// introduce el valor de la primera nota
		nota1 = sc.nextInt();

		// salto de linea
		sc.nextLine();

		// mensaje que te dice que introduzcas el valor de la segunda nota
		System.out.println("Introduzca un numero: ");
		
		// introduce el valor de la segunda nota
		nota2 = sc.nextInt();
		
		// calcula la media entre las dos notas
		media = (nota1 + nota2) / 2;

		System.out.println("La nota media es: " + media);
		
		//cierre de scanner
		sc.close();
		
	}

}
