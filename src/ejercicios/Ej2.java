package ejercicios;

import java.util.Scanner;

public class Ej2 {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//Int
		int edad;
		
		//mensaje que te dice que introduzcas un valor
		System.out.println("Introduce un numero: ");
		
		
		//introduce el valor del int mediante el scanner
		edad=sc.nextInt();
		edad+=1;
		
		System.out.println("La edad que tendra el año que viene es: "+edad);
		
		//cierre de scanner
		sc.close();
		
	}
	
}
