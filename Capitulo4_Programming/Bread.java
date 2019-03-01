package Capitulo4_Programming;

public class Bread {
	private String pan;
	private Integer calorias;

	public Bread() {
		
	}
	
	public Bread(String pan, Integer calorias) {
		this.pan=pan;
		this.calorias=calorias;
	}
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Integer getCalorias() {
		return calorias;
	}
	public void setCalorias(Integer calorias) {
		this.calorias = calorias;
	}
	
	public final static String MOTTO() {
		return "Ths staff of life";
	}
	

}
