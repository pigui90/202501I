package service;

import java.util.Scanner;

import model.TipoTarifa;
import model.Transporte;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Transporte transporte = new Transporte();
		TipoTarifa tipoTarifa = new TipoTarifa();
		// Definir un valor a Transporte, la placa en este caso
		System.out.println("Digite una placa");
		String placa = scan.next();
		transporte.setPlaca(placa);
		transporte.setCapacidad(50);
		transporte.setTarifa(10);
		
		// Para definir un dato a tipoTarifa
		System.out.println("Digite la descripcion del tipo de tarifa");
		String descripcion = scan.next();
		tipoTarifa.setDescripcion(descripcion);
		System.out.println("Indique si esta activo o no (true -> si) (false -> no)");
		boolean activo = scan.nextBoolean();
		tipoTarifa.setActivo(activo);
		
		// Colocar el valor de tipoTarifa en mi instancia de transporte
		transporte.setTipoTarifa(tipoTarifa);
		
		System.out.println("Indique la cantidad de viajes");
		int cantidadViajes = scan.nextInt();
		int total = transporte.gananciaTotalSegunViajes(cantidadViajes);
		System.out.println("la ganancia total por los viajes es " + total);

		
		scan.close();
	}

}
