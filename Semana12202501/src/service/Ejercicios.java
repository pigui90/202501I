package service;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vector1 = new int[3];
		int[] vector2 = new int[3];
		int[] vectorSuma = new int[3];
		String diasSemana[] = new String[7];
		int[] mayores = new int[5];
		String menu = "1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3";
		int op = 0;

		System.out.println(menu);
		op = scan.nextInt();
		switch (op) {
		case 1:
			for (int i = 0; i < vector1.length; i++) {
				System.out.println("Digite un numero");
				vector1[i] = scan.nextInt();
				System.out.println("Digite otro numero para el vector 2");
				vector2[i] = scan.nextInt();
				vectorSuma[i] = vector1[i] + vector2[i];
			}
			
			for (int i = 0; i < vectorSuma.length; i++) {
				System.out.println("El valor es : " + vectorSuma[i]);
			}
			break;
		case 2:
			for (int i = 0; i < diasSemana.length; i++) {
				System.out.println("Digite el dia de la semana en orden");
				diasSemana[i] = scan.next();
			}
			
			for(int i = diasSemana.length - 1; i>=0; i--) {
				System.out.println("Dia de la semana : " + diasSemana[i]);
			}
			break;
		case 3:
			for (int i = 0; i < mayores.length; i++) {
				System.out.println("Digite un numero");
				mayores[i] = scan.nextInt();
			}
			
			int mayor = mayores[0];
			for (int i = 0; i < mayores.length; i++) {
				if(mayores[i]>mayor) {
					mayor = mayores[i];
				}
			}
			System.out.println("El numero mayor es: " + mayor);
			break;

		}
	}

}
