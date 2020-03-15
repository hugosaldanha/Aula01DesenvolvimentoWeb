package aula01;

public class Cilindro extends TresDimensoes {

	public Cilindro(int altura, int base) {
		setAltura(altura);
		setBase(base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double volume() {
		return getAltura() * getBase()/2;
	}
}
