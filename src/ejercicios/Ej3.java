package ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Int
		int nacimiento, año, edad;

		// mensaje que te dice que introduzcas un valor
		System.out.println("Introduce el año actual: ");

		// introduce el valor del int mediante el scanner
		año = sc.nextInt();

		// se hace salto de linea
		sc.nextLine();

		System.out.println("Introduce el año en el que nacistes: ");
		// se introduce el valor del año del nacimiento
		nacimiento = sc.nextInt();
		
		//
		edad = año - nacimiento;
		
		
		
		//
		System.out.println("La edad que tendra el año que viene es: " + edad);
		
		
		//cierre de scanner
		sc.close();
		
	}

}
