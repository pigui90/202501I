package model;

public class TipoCuenta {

	private String nombre;
	private boolean activo;
	private String descripcion;

	public TipoCuenta() {

	}

	public TipoCuenta(String nombre, boolean activo, String descripcion) {
		this.nombre = nombre;
		this.activo = activo;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public boolean getActivo() {
		return activo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	// Metodo para mostrar la informacion de tipo cuenta al usuario
	public String mostrarInformacion() {
		String activoStr = "";
		if (getActivo()) {
			activoStr = "Si";
		} else {
			activoStr = "No";
		}
		return "**********\nNombre: " + getNombre() + "\nDescripcion: " + getDescripcion() + "\nActivo: " + activoStr
				+ "\n**********";

	}

}
