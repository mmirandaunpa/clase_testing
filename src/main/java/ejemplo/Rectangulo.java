package ejemplo;

public class Rectangulo {
	private int ancho;
	private int alto;
	public Rectangulo(int ancho, int alto){
		this.ancho = ancho;
		this.alto = alto;
	}
	public int area(){			
		return ancho * alto;
	}
	public int perimetro(){
		int calculoAlto = 2 * alto;
		int calculoAncho = 2 * ancho;
		return calculoAlto+calculoAncho;
	}
}

