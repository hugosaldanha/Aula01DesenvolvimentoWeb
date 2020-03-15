package aula01;

public class Esfera extends TresDimensoes {
	
	public Esfera(int altura) {
		setAltura(altura);
	}
	
	@Override
	public double volume() {
		
		return (4/3) * Math.PI * Math.pow(getAltura(), 3);
	}

}
