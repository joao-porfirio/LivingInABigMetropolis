package jogo;
import javax.swing.JFrame;

import modelo.Fase;

public class Container extends JFrame {
	//tela que aparece no jogo
	public Container() {
		add(new Fase());
		setTitle("Vida na Metróple");
		
		//1024x728
		setSize(1024,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//aparecer no meio a tela
		setLocationRelativeTo(null);
		//controle pra por fullscreen ou nao, booleano
		this.setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Container();
	}
}
