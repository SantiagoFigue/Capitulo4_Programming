package Capitulo4_Programming;

public class SandwichFilling {
	private String tipo;
	private Integer calorias;
	
	public SandwichFilling() {
		
	}
	
	public SandwichFilling(String tipo, Integer calorias) {
		this.tipo=tipo;
		this.calorias=calorias;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getCalorias() {
		return calorias;
	}
	public void setCalorias(Integer calorias) {
		this.calorias = calorias;
	}
	
	
	

}
