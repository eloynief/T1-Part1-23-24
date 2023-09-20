package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Int
		int nota1, nota2, media;

		// mensaje que te dice que introduzcas un valor
		System.out.println("Introduce un numero: ");

		// introduce el valor de la primera nota
		nota1 = sc.nextInt();

		// salto de linea
		sc.nextLine();
		
		// introduce el valor de la segunda nota
		nota2 = sc.nextInt();
		
		// calcula la media entre las dos notas
		media = (nota1 + nota2) / 2;

		System.out.println("La edad que tendra el año que viene es: " + media);
	}

}
