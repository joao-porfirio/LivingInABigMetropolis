package modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Player {

	private int x, y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	private List <Tiro> tiros; //armazenar a variavel numa lista pra aguentar quantidade de tiros
	private boolean isVisivel;
	
	
	//metodo para definir coordenada da tela que o player vai nascer
	public Player() {
		this.x = 100;
		this.y = 100;
		isVisivel = true;
		
		tiros = new ArrayList<Tiro>();
	}
	
	//metodo para definir imagem do player
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\pescadorP.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	//metodo para mover o player na tela no eixo x e y
	public void update() {
		x += dx;
		y += dy;
	}
	
	public void tiroSimples() {
		this.tiros.add(new Tiro(x+largura, y +( altura/2)));
	}
	
	public Rectangle getBounds() {
		return new Rectangle (x,y,largura, altura);
	}
	
	//metodo para usar teclas do teclado
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_A) {
			tiroSimples();
		}
		
		if(codigo == KeyEvent.VK_UP) {
			dy=-3;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy=3;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx=-3;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx=3;
		}
	}
	
	//meto para quando parar de pressionar a tecla, o dx e dy vire 0 parando a nave
	public void keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			dy=0;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy=-0;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx=-0;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx=0;
		}
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

	public List<Tiro> getTiros() {
		return tiros;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}
	
	
}



