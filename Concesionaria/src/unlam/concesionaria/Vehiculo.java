package unlam.concesionaria;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private int año;
	private float precio;
	private int cantidadDeCoches;

	/*
	 * Siendo tipo de vehiculo
	 * 
	 * 1- Coche 2- Camioneta 3- Moto
	 */
	private int tipoVehiculo;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String marca, String modelo, String color, int año, int precio, int cantidadDeCoches) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
		this.precio = precio;
		this.cantidadDeCoches = cantidadDeCoches;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidadDeCoches() {
		return cantidadDeCoches;
	}

	public void setCantidadDeCoches(int cantidadDeCoches) {
		this.cantidadDeCoches = cantidadDeCoches;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", precio=" + precio
				+ ", cantidadDeCoches=" + cantidadDeCoches + "]";
	}

}
