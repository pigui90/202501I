package model;

public class TipoTarifa {
	private String descripcion;
	private boolean activo;
	
	public TipoTarifa() {
		
	}
	
	public TipoTarifa(String descripcion, boolean activo) {
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	public boolean getActivo() {
		return activo;
	}
	
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
