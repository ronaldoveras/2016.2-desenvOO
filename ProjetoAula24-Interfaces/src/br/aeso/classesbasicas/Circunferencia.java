package br.aeso.classesbasicas;

public class Circunferencia implements IFormaGeometrica {
	
	private double raio;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio,2);
	}
	
}
