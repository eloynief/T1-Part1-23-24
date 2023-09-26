package ejercicios;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		
		//scanner que sirve para poner los valores
		Scanner sc = new Scanner(System.in);
		
		final int PESETA_PASAR=166;
		
		//variable para las pesetas
		int peseta;
		
		//double para los euros ya que pueden contener decimales
		double euro;
		
		//te imprime en pantalla las pesetas que quieres introducir
		System.out.println("Introduce la cantidad de pesetas que quieres pasar a euros: ");
		
		//te permite introducir el valor de las pesetas que vayas a pasar a euros
		peseta=sc.nextInt();
		
		//el valor del euro es el valor de la peseta/166
		euro=peseta/PESETA_PASAR;
		
		//
		System.out.println("La cantidad de euros que tienes son: "+euro);
		
		//cierre de scanner
		sc.close();
		
	}

}
