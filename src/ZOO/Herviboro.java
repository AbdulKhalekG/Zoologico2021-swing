package ZOO;

import javax.swing.JLabel;

public class Herviboro extends Animal implements Planta{

	
	
	public Herviboro(String name, int age, String color) {
		super(name, age, color);
	
	}
	public void ComenPlanta() {
		System.out.print("Como planta");
	}
	void Rinoceronte() {
		System.out.println("Rinoceronte");
		
	}
	void Hipopotamo() {
		System.out.println("Hipopotamo");
	}

	void Elefante() {
		System.out.println("Elefante");

	}
	void Jirafa() {
		System.out.println("Jirafa");
	
	}
	void Canguro() {
		System.out.println("Canguro");
	}
}