package Capitulo4_Programming;

public class Paciente {

	private Integer id;
	private Integer age;
	private BloodData blooddata;
	
	public Paciente() {
		this.id=0;
		this.age=0;
		this.blooddata=new BloodData();
	}
	
	public Paciente(Integer id, Integer age, BloodType bloodType,Factor factor) {
		this.id=id;
		this.age=age;
		this.blooddata=new BloodData(bloodType,factor);
	}
	
	//Metodo set y get.
	public void setId(Integer id) {
		this.id=id;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setAge(Integer age) {
		this.age=age;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public void setBloodData(BloodData blooddata) {
		this.blooddata=blooddata;
	}
	
	public BloodData getBloodData() {
		return this.blooddata;
	}
}
