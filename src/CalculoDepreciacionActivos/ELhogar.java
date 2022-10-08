package CalculoDepreciacionActivos;

import java.util.Scanner;

public class ELhogar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Datos de Entrada
		int costodelactivo;
		int vidautil;
		int valorresidual;
		double depreciacionanual = 0;
		
		System.out.println("Ingrese el costo del activo: ");
		costodelactivo  = sc.nextInt();
		System.out.println("Ingrese la vida util: ");
		vidautil  = sc.nextInt();
		System.out.println("Ingrese el valor residual: ");
		valorresidual  = sc.nextInt();
		
		//Procesamiento
		depreciacionanual = (costodelactivo - valorresidual)/vidautil;
		
		//Datos de salida
		while(vidautil > 0) {
			System.out.println("Anios = " + vidautil);
			vidautil--;
		}
		System.out.println("La depreciacion anual es de: " + depreciacionanual);
		
		
		
		

	}
	public static void Metododeunidadesproducidas(String[]args) {
		Scanner sc = new Scanner(System.in);
		//Datos de entrada
		int costedelactivo;
		int valordesecho;
		int vidautil;
		double vidautilenunidades = 0;
		
		System.out.println("Ingrese el coste del activo: ");
		costedelactivo = sc.nextInt();
		System.out.println("Ingrese el valor de desecho: ");
		valordesecho = sc.nextInt();
		System.out.println("Ingrese la vida util: ");
		vidautil = sc.nextInt();
		
		for(vidautilenunidades = 0; vidautilenunidades == vidautil; vidautilenunidades++) {
			System.out.println("");
		}
		
		
		
		
	}

}
