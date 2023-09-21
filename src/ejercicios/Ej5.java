package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		// Int
		//variable double para el valor pi
		double radio,pi,longitud,area;

		pi=Math.PI;
		
		// mensaje que te dice que vayas a introducir la primera nota
		System.out.println("Introduzca el radio de la circunferencia: ");

		//comando para intriducir el numero que quiees crear la altura
		radio = sc.nextInt();
		
		longitud=2*pi*radio;
		area=pi*(radio)^2;
		
		// mensaje que dice que va a mostrar el area de la circunferencia
		System.out.println("El area de la circunferencia es: "+longitud);
		

		// mensaje que muestra la longitud de la circunferencia
		System.out.println("El area de la circunferencia es: "+area);
		
		
		sc.close();
	}

}
