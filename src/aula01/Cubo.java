package aula01;

public class Cubo extends TresDimensoes {

	public Cubo(int altura, int base, int profundidade) {
		setAltura(altura);
		setBase(base);
		setProfundidade(profundidade);
	}

	@Override
	public double volume() {
		return getAltura() * getBase() * getProfundidade();
	}
}
