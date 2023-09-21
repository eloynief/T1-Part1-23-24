package ejercicios;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		//scanner para introducir los valores
		Scanner sc = new Scanner(System.in);
		
		//string para nombre ya que son caracteres
		String nombre;
		
		int edad;
		
		//mensaje en pantalla que pide que pongas tu nombre
		System.out.println("Introduzca tu nombre: ");
		
		//podemos introducir el nombre a partir del comando
		nombre=sc.nextLine();
		
		//mensaje que dice que pongas la edad
		System.out.println("Introduce la edad que tienes");
		
		edad=sc.nextInt();
		
		sc.close();
		
	}

}
