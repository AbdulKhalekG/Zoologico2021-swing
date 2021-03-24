package ZOO;

import javax.swing.JLabel;

public class Omnivoro extends Animal implements Comodetodo{

	
	
	public Omnivoro(String name, int age, String color) {
		super(name, age, color);
	
	}
	public void Comendetodo() {
		System.out.print("Como planta y carne");
	}
	void Mono() {
		System.out.println("Mono");
		
	}
	void Tortuga() {
		System.out.println("Tortuga");
	}

	void Oso() {
		System.out.println("Oso");

	}
	void Avestruz() {
		System.out.println("Avestruz");
	
	}
	void Puercoespin() {
		System.out.println("Puercoespin");
	}
}