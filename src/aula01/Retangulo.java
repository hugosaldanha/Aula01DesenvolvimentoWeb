package aula01;

public class Retangulo extends Poligono {

	public Retangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaDiagonal() {
		return getAltura() * Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}

	@Override
	public double perimetro() {
		return getAltura() * 2 + getBase() * 2;
	}
}
