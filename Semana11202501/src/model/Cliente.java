package model;

public class Cliente {

	private String nombre;
	private int edad;
	private String direccion;
	private String estadoCivil;

	public Cliente() {

	}

	public Cliente(String nombre, int edad, String direccion, String estadoCivil) {
		this.nombre = nombre;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public int getEdad() {
		return this.edad;
	}

	// Mostrar los datos del Cliente
	public String mostrarInformacion() {
		return "-------------\nNombre: " + getNombre() + "\nDireccion: " + getDireccion() + "\nEstado Civil: "
				+ getEstadoCivil() + "\nEdad: " + getEdad() + "\n-------------";
	}

}
