package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Hola, este es mi primer proyecto");
		int numero = 2;
		if (numero >= 70) {
			System.out.println("El numero es mayor o igual a 70");
		} else {
			System.out.println("El numero no es mayor a 70");
		}

		String respuesta = "";
		do {
			System.out.println("Quiere continuar?");
			respuesta = scan.next();
		} while (!respuesta.equals("no"));

		for (int i = 1; i < 10; i++) {
			System.out.println("El numero " + i + " multiplicado por 2 es:" + (i * 2));
		}
		int contador = 1;
		while (contador <= 3) {
			System.out.println("Este es el mensaje " + contador);
			contador = contador + 1;
			// contador++;
		}
		
		int opcion;
		System.out.println("Digite una opcion");
		opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Escogio la opcion 1");
			break;
		case 2:
			System.out.println("Escogio la opcion 2");
			break;
		default:
			System.out.println("La opcion no existe");
			break;
		}
		System.out.println("Llego hasta el final");
		scan.close();
	}

}
