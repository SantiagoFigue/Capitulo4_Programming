package Capitulo4_Programming;

public class Test {

	public static void main(String [] args) {
		
		FromLetterWrite persona= new FromLetterWrite();
		System.out.println(persona.displaySalutation("Santiago"));
		System.out.println(persona.displaySalutation("Santiago", "Figueroa"));
		
		Billing b=new Billing();

		System.out.println(b.computeBill(10.00));

		System.out.println(b.computeBill(10.0,2));

		System.out.println(b.computeBill(10.0,2,3));
		
		BirdSighting bs=new BirdSighting();

		System.out.println(bs.ave());
		System.out.println(bs.dia());

		Paciente p=new Paciente(333,19, BloodType.A, Factor.POSITIVO);
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getBloodData());
		System.out.println(Factor.POSITIVO);

		Bread br=new Bread("Trigo",7);
		System.out.println(br.getPan());
		System.out.println(br.getCalorias());
		System.out.println(Bread.MOTTO());

		SandwichFilling sa=new SandwichFilling("Huevo",200);
		System.out.println(sa.getTipo());
		System.out.println(sa.getCalorias());
		
		
		Circulo c= new Circulo();
		System.out.println(c.area());
		System.out.println(c.diametro());
		
		
		MathTest nuevo = new MathTest();
		System.out.println(nuevo.a());
		System.out.println(nuevo.b());
		System.out.println(nuevo.c());
		System.out.println(nuevo.d());
		System.out.println(nuevo.e());
		
		
		
		
		State estado= new State("Sinalo",15,"Culiacan",258,"Sonora",251);
		System.out.println(estado.getNombrEsta());
		System.out.println(estado.getPoblacion());
		System.out.println(estado.getCiudad1().getCiudad());
		System.out.println(estado.getCiudad1().getPoblacion());
		System.out.println(estado.getCiudad2().getCiudad());
		System.out.println(estado.getCiudad2().getPoblacion());
	}
	
}
