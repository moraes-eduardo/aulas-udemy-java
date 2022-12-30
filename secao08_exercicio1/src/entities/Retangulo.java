package entities;

public class Retangulo {

	public double largura;
	public double altura;
	
	public double areaRetangulo() {
		return largura * altura;
	}
	
	public double perimetroRetangulo() {
		return (largura * 2 ) + (altura * 2);
	}
	
	public double diagonalRetangulo() {
		return Math.sqrt((largura * largura ) + (altura * altura));
	}

}
