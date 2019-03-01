package Capitulo4_Programming;

public class Sandwich {
	private Bread pan;
	private SandwichFilling relleno;
	
	
	public Sandwich() {
		
	}
	
	public Sandwich(Bread pan, SandwichFilling relleno) {
		this.pan=pan;
		this.relleno=relleno;
	}
	
	public Bread getPan() {
		return pan;
	}
	public void setPan(Bread pan) {
		this.pan = pan;
	}
	public SandwichFilling getRelleno() {
		return relleno;
	}
	public void setRelleno(SandwichFilling relleno) {
		this.relleno = relleno;
	}
	
	

	
}
