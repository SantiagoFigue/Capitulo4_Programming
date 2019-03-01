package Capitulo4_Programming;

public class BloodData {

	private BloodType bloodType;
	private Factor factor;
	
	
	public BloodData() {
		this.bloodType=BloodType.O;
		this.factor=Factor.POSITIVO;
	}
	
	public BloodData(BloodType bloodType, Factor factor) {
		this.bloodType=bloodType;
		this.factor=factor;
	}
	
	public BloodType getBloodType() {
		return this.bloodType;
	}
	
	public void setBloodType(BloodType bloodType) {
		this.bloodType=bloodType;
	}
	
	public Factor getFactor() {
		return this.factor;
	}
	
	public void setFactor(Factor factor) {
		this.factor=factor;
	}
	//Metodos set y get
}
