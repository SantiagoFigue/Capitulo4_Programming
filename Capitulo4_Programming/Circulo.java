package Capitulo4_Programming;

public class Circulo {
	private Integer radio;

	public Circulo() {
		this.radio=1;
	}
	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}
	
	public Integer diametro() {
		return (2*this.getRadio());
	}
	
	public Double area() {
		return (Math.PI*this.getRadio()*this.getRadio());
	}
}
