package Capitulo4_Programming;

public class MathTest {

	public Double a() {
		return Math.sqrt(37);
	}
	
	public String b() {
		return String.format("El valor de seno es %.2f, el valor de cosceno es %.2f", Math.sin(300), Math.cos(300)); 
	}
	
	public String c() {
		return String.format("El valor de floor %.2f, el valor de cailing %.2f, el valor de round %d", Math.floor(22.8), Math.ceil(22.8), Math.round(22.8));
	}
	
	public String d() {
		int D=(int)('D');
		System.out.println(""+D);
		if( D>71) {
			return "D es mas grande";
		}else {
			return "71 es mas grande";
		}
	}
	
	public Integer e() {
		return (int) (Math.random()*20);
	}
	
}
