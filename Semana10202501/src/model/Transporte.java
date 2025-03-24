package model;

public class Transporte {
	
	private String placa;
	private int capacidad;
	private int tarifa;
	private TipoTarifa tipoTarifa;
	private TipoTransporte tipoTransporte;
	
	public Transporte() {
		
	}
	
	public Transporte(String placa, int capacidad, int tarifa, TipoTransporte tipoTransporte, TipoTarifa tipoTarifa) {
		this.placa = placa;
		this.capacidad = capacidad;
		this.tarifa = tarifa;
		this.tipoTarifa = tipoTarifa;
		this.tipoTransporte = tipoTransporte;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public TipoTarifa getTipoTarifa() {
		return this.tipoTarifa;
	}
	
	public void setTipoTarifa(TipoTarifa tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	
	// Calcular la ganancia total del transporte
	public int gananciaTotal() {
		return (this.capacidad * this.tarifa);
	}
	
	// Metodo para calcular la ganancia total segun una cantidad X de viajes
	public int gananciaTotalSegunViajes(int cantidadViajes) {
		return (this.capacidad * this.tarifa * cantidadViajes);
	}
	
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
}
