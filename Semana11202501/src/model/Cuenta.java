package model;

public class Cuenta {
	private int numeroCuenta;
	private boolean tieneTarjeta;
	private Cliente cliente;
	private TipoCuenta tipoCuenta;

	public Cuenta() {

	}

	public Cuenta(int numeroCuenta, boolean tieneTarjeta, Cliente cliente, TipoCuenta tipoCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.tieneTarjeta = tieneTarjeta;
		this.cliente = cliente;
		this.tipoCuenta = tipoCuenta;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoCuenta getTipoCuenta() {
		return this.tipoCuenta;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public boolean getTieneTarjeta() {
		return tieneTarjeta;
	}
	
	public void setTieneTarjeta(boolean tieneTarjeta) {
		this.tieneTarjeta = tieneTarjeta;
	}
	// Mostrar toda la informacion de Cuenta ademas de sus respectivos
	// atributos  Cliente y TipoCuenta 
	public String mostrarInformacion() {
		String tieneTarjetaStr = "";
		if(getTieneTarjeta()) {
			tieneTarjetaStr = "SI";
		}else {
			tieneTarjetaStr = "NO";
		}
		return "///////////////\nNumero Cuenta: " + getNumeroCuenta()
		+ "\nTiene tarjeta: " + tieneTarjetaStr
		+ "\n**Tipo Cuenta**\n " + getTipoCuenta().mostrarInformacion()
		+ "\n--Cliente--\n" + getCliente().mostrarInformacion()
		+ "\n///////////////";  
		
	}

}
