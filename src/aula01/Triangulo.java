package aula01;

public class Triangulo extends Poligono {

	public Triangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		
		return super.area()/2;
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
