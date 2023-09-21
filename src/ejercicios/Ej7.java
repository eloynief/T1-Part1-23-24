package ejercicios;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		//sirve para poner valores
		Scanner sc = new Scanner(System.in);
		
		//string para nombre y direccion ya que estos son palabras
		String nombre,direccion;
		
		
		
		//long para el telefono porque puede ser un numero muy largo
		long telefono;
		
		//pide que vayamos a introducir el nombre
		System.out.println("Introduce tu nombre: ");
		
		nombre=sc.nextLine();

		//pide que vayamos a introducir el nombre
		System.out.println("Ahora introduce tu direccion: ");
		
		direccion=sc.nextLine();
		
		
		//nos pide que introduzcamos un numero
		System.out.println("Introduzca un numero de telefono: ");
		
		//introducimos el numero
		telefono=sc.nextLong();
		
		
		System.out.println("Nombre: "+nombre);
		
		System.out.println("Direccion: "+direccion);
		
		System.out.println("Telefono: "+telefono);
		
		
		sc.close();
		
	}

}
