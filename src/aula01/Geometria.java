package aula01;

import java.util.ArrayList;

public class Geometria {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Triangulo(10,5));
		figuras.add(new Retangulo(10, 15));
		figuras.add(new Quadrado(4));
		figuras.add(new Losango(10, 3));
		
		for (Figura f : figuras) {
			System.out.println(f.getClass().getName());
			System.out.println("Área: " + f.area());
			System.out.println("Perimetro: " + f.perimetro());
			if (f instanceof Diagonal) {
				System.out.println("Diagonal: " +((Diagonal)f).calculaDiagonal());
				System.out.println();
			}
		}
	}
	
}
