package modelo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class RedeDePesca {

	private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisivel;
	
	// numero ideal para sumir a rede da tela
	private static final int LARGURA = 938; 
	private static int VELOCIDADE = 5; //velocidade da rede

	public RedeDePesca(int x, int y) {
		this.x = x;
		this.y = y;
		isVisivel = true;
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\rede.png");
		imagem = referencia.getImage();
		
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
	}
	
	//quando passar o valor da largura,  o tiro some
	public void update() {
		this.x += VELOCIDADE;
			if(this.x > LARGURA) {
				isVisivel = false;
			}
	}
	
	//implementar o retangulo nos player, inimigos pras colisoes
	public Rectangle getBounds() {
		return new Rectangle (x,y,largura, altura);
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public static int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public static void setVELOCIDADE(int VELOCIDADE) {
		VELOCIDADE = VELOCIDADE;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
	
	
}
