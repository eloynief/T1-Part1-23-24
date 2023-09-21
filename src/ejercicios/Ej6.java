package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

		//los dos numeros para las operaciones
		int num1,num2;
		
		
		//las operaciones mencionadas
		int suma,resta,multiplicacion;
		
		//division como double porqe puede dar decimales
		double division;
		
		//pide en pantalla introducir un numero
		System.out.println("Introduce un numero: ");
		
		//se escribe el primer numero
		num1=sc.nextInt();
		
		//pide introducir el otro numero
		System.out.println("Introduce otro numero: ");
		//escritura del segundo numero
		num2=sc.nextInt();
		
		//las variables creadas para las operaciones le dan valor
		suma=num1+num2;
		resta=num1-num2;
		multiplicacion=num1*num2;
		division=num1/num2;
		
		//muestra en pantalla la suma de los numeros
		System.out.println("La suma de los numeros es: "+suma);

		//muestra la resta de los dos numeros
		System.out.println("La resta de los numeros es: "+resta);

		//muestra la multiplicacion de ambos numeros
		System.out.println("La multiplicacion de los numeros es: "+multiplicacion);

		//muestra el resultado de division
		System.out.println("La division de los numeros es: "+division);
		
		
		sc.close();
		
	}

}
