package ZOO;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Veranimal extends JFrame {
	public JPanel panel;
	public JLabel Cocodrilo;
	public JLabel Tigre;
	public JLabel Leon;
	public JLabel Pinguino;
	public JLabel Tiburon;
	public JLabel Rinoceronte;
	public JLabel Hipopotamo;
	public JLabel Elefante;
	public JLabel Jirafa;
	public JLabel Canguro;
	public JLabel Mono;
	public JLabel Tortuga;
	public JLabel Oso;
	public JLabel Avestruz;
	public JLabel Puercoespin;
	public JTextField IngresarAnimal;
	public JLabel AnimalIntroducido;
	public JLabel AnimalesCarne;
	public JLabel AnimalesPlantas;
	public JLabel AnimalesCarnePlanta;
	public JLabel AnimalesCarneCarne;
	
	public Veranimal() {
		this.setTitle("Animales");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		IniciarAnimales();
		this.setLocationRelativeTo(null);

	}
	public void IniciarAnimales(){
		ColocarAnimales();
		ColocarCosas();
		TodosLosAnimales();
		AnimalNuevo();
		ColocarAnimal();
		Boton2();
		Boton3();
	}
	public void ColocarAnimales(){
	panel = new JPanel();
	panel.setLayout(null);
	this.getContentPane().add(panel);
	}
	public void ColocarCosas() {
	JLabel animales = new JLabel();
	animales.setText("ZOOLOGICO");
	animales.setBounds(270,60,1000,700);
	animales.setForeground(Color.BLUE);
	animales.setFont(new Font("arial",1,30));
	panel.add(animales);
	}
	public void TodosLosAnimales() {

		JButton boton1 = new JButton();
		boton1.setText("Lista de Animales");
		boton1.setBounds(50, 20, 200, 40);
		Cocodrilo = new JLabel(); 
		Cocodrilo.setBounds(50, 10, 100, 200);
		Leon = new JLabel(); 
		Leon.setBounds(50, 25, 100, 200);
		Tiburon = new JLabel(); 
		Tiburon.setBounds(50, 40, 100, 200);
		Pinguino = new JLabel();
		Pinguino.setBounds(50, 55, 100, 200);
		Rinoceronte = new JLabel();
		Rinoceronte.setBounds(50, 70, 100, 200);
		Tortuga = new JLabel();
		Tortuga.setBounds(50, 85, 100, 200);
		Mono = new JLabel();
		Mono.setBounds(50, 100, 100, 200);
		Oso = new JLabel();
		Oso.setBounds(140, 10, 100, 200);
		Tigre = new JLabel();
		Tigre.setBounds(140, 25, 100, 200);
		Avestruz = new JLabel();
		Avestruz.setBounds(140, 40, 100, 200);
		Jirafa = new JLabel();
		Jirafa.setBounds(140, 55, 100, 200);
		Puercoespin = new JLabel();
		Puercoespin.setBounds(140, 70, 100, 200);
		Elefante = new JLabel();
		Elefante.setBounds(140, 85, 100, 200);
		Hipopotamo = new JLabel();
		Hipopotamo.setBounds(140, 100, 100, 200);
		Canguro = new JLabel();
		Canguro.setBounds(140, 115, 100, 200);
		panel.add(Tortuga); //1 s
		panel.add(Canguro); //2  s
		panel.add(Tiburon); //3 s
		panel.add(Hipopotamo); //4 s
		panel.add(Cocodrilo); //5 s
		panel.add(Mono); //6 s
		panel.add(Jirafa); //7 s
		panel.add(Rinoceronte); //8
		panel.add(Oso); //9 s
		panel.add(Avestruz); //10 s
		panel.add(Leon); //11s
		panel.add(Elefante); //12 s
		panel.add(Puercoespin); //13 s
		panel.add(Tigre); //14 s
		panel.add(Pinguino); //15 s
		panel.add(boton1);
		JLabel AnimalNuevoRepetido = new JLabel();
		AnimalNuevoRepetido.setBounds(100, 215, 100, 200);
		panel.add(AnimalNuevoRepetido);
		
		ActionListener Boton01 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Tiburon.setText("Tiburon"); //1
				Cocodrilo.setText("Cocodrilo"); //2
				Rinoceronte.setText("Rinoceronte"); //3
				Avestruz.setText("Avestruz"); //4
				Pinguino.setText("Pinguino"); //5
				Hipopotamo.setText("Hipopotamo"); //6
				Tortuga.setText("Tortuga"); //7
				Puercoespin.setText("Puercoespin"); //8
				Oso.setText("Oso"); //9
				Tigre.setText("Tigre"); //10
				Jirafa.setText("Jirafa"); //11
				Mono.setText("Mono"); //12
				Elefante.setText("Elefante"); //13
				Leon.setText("Leon"); //14
				Canguro.setText("Canguro"); //15
				AnimalNuevoRepetido.setText(""+IngresarAnimal.getText());
				
				
				
			}
			
		};	
		boton1.addActionListener(Boton01);
	}
	public void AnimalNuevo() {
		JLabel	AnimalN = new JLabel();
		AnimalN.setBounds(100, 250, 100, 30);
		AnimalN.setText("Ingrese el Animal");
		panel.add(AnimalN);
	}		
	public void Boton2() {
		JButton Boton02 = new JButton();
		Boton02.setBounds(50, 400, 200, 40);
		Boton02.setText("Mostrar Animal");
		AnimalIntroducido = new JLabel();
		AnimalIntroducido.setBounds(50, 200, 250, 30);
		panel.add(AnimalIntroducido);
		panel.add(Boton02);
		JLabel AnimalRepetido2 = new JLabel();
		AnimalRepetido2.setBounds(100, 215, 100, 200);
		panel.add(AnimalRepetido2);
		
		
		
		ActionListener AgregarAnimal = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AnimalIntroducido.setText(""+IngresarAnimal.getText());
				AnimalRepetido2.setText(""+IngresarAnimal.getText());
				
			}
			
		};
		Boton02.addActionListener(AgregarAnimal);
	}
	public void ColocarAnimal() {
		IngresarAnimal = new JTextField();
		IngresarAnimal.setBounds(50, 350, 200, 40);
		panel.add(IngresarAnimal);
		
	}
	public void Boton3() {
		JButton Boton03 = new JButton();
		Boton03.setBounds(250, 20, 200, 40);
		Boton03.setText("Caracteristicas");
		panel.add(Boton03);
		AnimalesCarne= new JLabel();
		AnimalesCarne.setBounds(250, 95, 100, 40);
		panel.add(AnimalesCarne);
		AnimalesPlantas = new JLabel();
		AnimalesPlantas.setBounds(250,110, 100, 40);
		panel.add(AnimalesPlantas);
		AnimalesCarnePlanta = new JLabel();
		AnimalesCarnePlanta.setBounds(250,125, 100, 40);
		AnimalesCarneCarne = new JLabel();
		AnimalesCarneCarne.setBounds(250,140,100,40);
		panel.add(AnimalesCarneCarne);
		panel.add(AnimalesCarnePlanta);
		JLabel Caracteristicas = new JLabel();
		Caracteristicas.setBounds(250,80, 100, 40);
		panel.add(Caracteristicas);
		
		ActionListener CompAnimales = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnimalesCarne.setText("Saltan y comen");
				AnimalesCarnePlanta.setText("Corren y cazan");
				AnimalesCarneCarne.setText("y mueren");
				Caracteristicas.setText("Caracteristicas:");
				
				
			}
			
		};
		Boton03.addActionListener(CompAnimales);
	}
	 }