package aula01;

public class Quadrado extends Poligono {

	public Quadrado(int lado) {
		super(lado, lado);
	}

	@Override
	public double calculaDiagonal() {
		
		return getAltura() * Math.sqrt(2);
	}
	
	public double perimetro() {
		return getAltura() * 4;
	}

}
