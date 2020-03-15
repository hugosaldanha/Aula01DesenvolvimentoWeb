package aula01;

public class Piramide extends TresDimensoes {
	
	public Piramide(int altura, int base, int profundidade) {
		setAltura(altura);
		setBase(base);
		setProfundidade(profundidade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (1/3) * getBase() * getAltura() * getProfundidade();
	}

}
