package ZOO;

import javax.swing.JLabel;

public class Carnivoro extends Animal implements Carne{

	
	
	public Carnivoro(String name, int age, String color) {
		super(name, age, color);
	
	}
	public void ComenCarne() {
		System.out.print("Como carne");
	}
	void Tigre() {
		System.out.println("Tigre");
		
	}
	void Leon() {
		System.out.println("Leon");
	}

	void Pinguino() {
		System.out.println("Pinguino");

	}
	void Tiburon() {
		System.out.println("Tiburon");
	
	}
	void Cocodrilo() {
		System.out.println("Cocodrilo");
	}
}