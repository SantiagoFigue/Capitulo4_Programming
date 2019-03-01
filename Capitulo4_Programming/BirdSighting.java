package Capitulo4_Programming;

public class BirdSighting {
	private String ave;
	private Integer dia;
	
	
	public BirdSighting() {
		this.ave="Robin";
		this.dia=91;
	}
	
	public BirdSighting(String ave, Integer dia) {
		this.ave=ave;
		this.dia=dia;
	}
	
	public String getAve() {
		return ave;
	}
	public void setAve(String ave) {
		this.ave = ave;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
	public String ave() {
		return String.format("El ave es %s", this.getAve());
	}
	
	public String dia() {
		return String.format("El dia que se vio fue %d de 360", this.getDia());
	}
	

}
