package Capitulo4_Programming;

public class State {
	private String nombrEsta;
	private Integer poblacion;
	private City ciudad1;
	private City ciudad2;
	
	
	public State(String nombrEsta, 
			Integer poblacion,  
			String ciudad, 
			Integer poblacionc, 
			String ciudad2, 
			Integer poblacionc2) {
		this.nombrEsta = nombrEsta;
		this.poblacion = poblacion;
		this.ciudad1 = new City(ciudad,poblacionc);
		this.ciudad2 = new City(ciudad2,poblacionc2);
	}


	public String getNombrEsta() {
		return nombrEsta;
	}


	public void setNombrEsta(String nombrEsta) {
		this.nombrEsta = nombrEsta;
	}


	public Integer getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(Integer poblacion) {
		this.poblacion = poblacion;
	}


	public City getCiudad1() {
		return ciudad1;
	}


	public void setCiudad1(City ciudad1) {
		this.ciudad1 = ciudad1;
	}


	public City getCiudad2() {
		return ciudad2;
	}


	public void setCiudad2(City ciudad2) {
		this.ciudad2 = ciudad2;
	}
	
	
	
	
	
}
