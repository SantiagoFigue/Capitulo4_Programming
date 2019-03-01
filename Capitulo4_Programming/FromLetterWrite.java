package Capitulo4_Programming;

public class FromLetterWrite {

	private String nombre;
	private String apellido;
	
	public FromLetterWrite() {
	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String businessLetter() {
		return "Gracias por su pedido reciente";
	}
	
	public String displaySalutation(String apellido) {
		return String.format("Estimado Sr. o Sra. %s	%s", apellido,this.businessLetter());
	}
	
	public String displaySalutation(String nombre, String apellido) {
		return String.format("Estimado %s %s 	%s", nombre, apellido, this.businessLetter());
	}
	
	
	
	
	
}
