package Capitulo4_Programming;

public class City {
	private String ciudad;
	private Integer poblacionc;
	
	
	public City() {
		this.ciudad="";
		this.poblacionc=0;
	}


	public City(String ciudad, Integer poblacion) {
		this.ciudad = ciudad;
		this.poblacionc = poblacion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public Integer getPoblacion() {
		return poblacionc;
	}


	public void setPoblacion(Integer poblacion) {
		this.poblacionc = poblacion;
	}
	
	
	
	
}
