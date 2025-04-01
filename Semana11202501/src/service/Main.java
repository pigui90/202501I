package service;

import java.util.Scanner;

import model.Cliente;
import model.Cuenta;
import model.TipoCuenta;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String menu = "Menu del Profesor\n1. Ingresar un tipo de Cuenta\n2. Ingresar un Cliente\n3. Ingresar una cuenta\n4. Mostrar informacion de Tipo Cuenta\n5. Mostrar la informacion de Cliente\n6. Mostrar la informacion de Cuenta\n7. Modificar Cliente\n8. Salir";
		TipoCuenta tipoCuenta = new TipoCuenta();
		Cliente cliente = new Cliente();
		Cuenta cuenta = new Cuenta();
		int opcion = 0;
		String descripcion = "";
		String nombre;
		boolean activo;
		do {
			System.out.println(menu);
			System.out.print("Escoja una opcion: ");
			opcion = scan.nextInt();
			scan.nextLine();// Linea para limpiar el buffer
			switch (opcion) {
			case 1:
				System.out.println("Ingrese una descripcion del tipo de cuenta");
				descripcion = scan.nextLine();
				tipoCuenta.setDescripcion(descripcion);
				System.out.println("Ingrese un nombre para el tipo de cuenta");
				nombre = scan.nextLine();
				System.out.println("Indique si esta activo o no\npara Si escriba true\npara no escriba false");
				activo = scan.nextBoolean();
				tipoCuenta.setNombre(nombre);
				tipoCuenta.setActivo(activo);
				break;
			case 2:
				System.out.println("Escriba el nombre del cliente");
				nombre = scan.nextLine();
				cliente.setNombre(nombre);
				System.out.println("Indique la direccion exacta del cliente");
				cliente.setDireccion(scan.nextLine());
				System.out.println("Coloque el estado civil del cliente");
				cliente.setEstadoCivil(scan.nextLine());
				System.out.println("Escriba la edad del cliente");
				cliente.setEdad(scan.nextInt());
				
				break;
			case 3:
				System.out.println("¿Cual es el numero de cuenta?");
				cuenta.setNumeroCuenta(scan.nextInt());
				System.out.println("¿Tiene tarjeta? Si (true) No (false)");
				cuenta.setTieneTarjeta(scan.nextBoolean());
				cuenta.setCliente(cliente);
				cuenta.setTipoCuenta(tipoCuenta);
				break;
			case 4:
				System.out.println(tipoCuenta.mostrarInformacion());
				break;
			case 5:
				System.out.println(cliente.mostrarInformacion());
				break;
			case 6:
				System.out.println(cuenta.mostrarInformacion());
				break;
			case 7:
				System.out.println("Digite el nombre correcto");
				nombre = scan.nextLine();
				cliente.setNombre(nombre);
				break;
			case 8:
				System.out.println("Se termino todo, nos fuimos para la casa");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 8);

		scan.close();

	}

}
