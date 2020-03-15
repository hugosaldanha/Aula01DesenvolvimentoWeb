package aula01;

public class Losango extends Poligono {

	public Losango(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return getBase() * 2 + getAltura() * 2;
	}
}
