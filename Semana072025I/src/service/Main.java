package service;

import java.util.Scanner;

import model.Estudiante;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("este es cualquier mensaje");
		System.out.println("Este es otro mensaje");
		int numero = 10;
		System.out.println(numero);
		String nombre = "Sergio C";
		System.out.println(nombre);
		System.out.println("Digite el nombre del usuario");
		nombre = scanner.next();
		System.out.println("Su nuevo nombre es:  " + nombre);
		System.out.println("Digite un numero para mostrarselo de nuevo");
		numero = scanner.nextInt();
		System.out.println("Su numero es: " + numero);
		int edad;
		String nombreEstudiante;
        
		// Esta es la instancia de mi clase Estudiante
		Estudiante estudiante = new Estudiante();
		System.out.println("Digite la edad del estudiante: ");
		edad = scanner.nextInt();
		estudiante.setEdad(edad);
		System.out.println("Digite el nombre del estudiante: ");
		nombreEstudiante = scanner.next();
		estudiante.setNombre(nombreEstudiante);

		System.out.println("El nombre del estudiante es: " + estudiante.getNombre() +
				" , La edad del estudiante es: "+ estudiante.getEdad());

		scanner.close();
	}
}
