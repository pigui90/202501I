package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] vectorActivos = new boolean[6];
		
		vectorActivos[0] = true;
		vectorActivos[1] = false;
		
		System.out.println("El valor de la posicion 0 es: " + vectorActivos[0]);
		System.out.println("El valor de la posicion 1 es: " + vectorActivos[1]);
		
		boolean activo;
		System.out.println("Indique true o false, para saber si esta activo o no");
		activo = scan.nextBoolean();
		
		vectorActivos[2] = activo;
		
		System.out.println("Indique true o false, para saber si esta activo o no");
		activo = scan.nextBoolean();

		vectorActivos[3] = activo;

		System.out.println("El valor de la posicion 2 es: " + vectorActivos[2]);
		System.out.println("El valor de la posicion 3 es: " + vectorActivos[3]);
		
		int[] edadEstudiantes = new int[19];
		
		
		for(int i = 0; i < edadEstudiantes.length; i++) {
			System.out.println("Digite la edad del estudiante de la posicion " + i + ": ");
			edadEstudiantes[i] = scan.nextInt();
		}
		
		for(int j = 0; j < edadEstudiantes.length; j++) {
			System.out.println("La edad del estudiante en la posicion " + j + ": " + edadEstudiantes[j]);
		}
		
				
				
		scan.close();
	}

}
