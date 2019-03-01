package Capitulo4_Programming;

public class Billing {
	
	public Double computeBill(Double i){
		return ((i*0.08)+i);
	}
	
	public Double computeBill(Double precio, Integer cantidad) {
		return ((cantidad*precio)+(precio*0.08));
	}
	
	public Double computeBill(Double precio, Integer cantidad, Integer cupon) {
		return (((cantidad*precio)-cupon)+(precio*0.08));
	}

}
