package aula01;

public abstract class Poligono extends DuasDimensoes implements Diagonal{

	private int base;
	private int altura;
	
	public Poligono(int base, int altura) {
		setAltura(altura);
		setBase(base);
	}
	
	public double area() {
		return getBase() * getAltura();
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

}
