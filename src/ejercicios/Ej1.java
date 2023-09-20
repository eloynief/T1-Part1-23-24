package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		//Objeto tipo scanner
		Scanner sc=new Scanner(System.in);
		
		//Int
		int num;
		
		//mensaje que te dice que introduzcas un valor
		System.out.println("Introduce un numero: ");
		
		
		//introduce el valor del int mediante el scanner
		num=sc.nextInt();
		
		System.out.println(num);
	}

}
