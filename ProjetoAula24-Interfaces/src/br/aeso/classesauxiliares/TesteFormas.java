package br.aeso.classesauxiliares;

import br.aeso.classesbasicas.Circunferencia;
import br.aeso.classesbasicas.Retangulo;

public class TesteFormas {

	public static void main(String[] args) {
		Retangulo ret = new Retangulo(3, 2);
		VisualizadorArea visualizador = new VisualizadorArea();
		visualizador.imprimirArea(ret);
		Circunferencia circ = new Circunferencia(2);
		visualizador.imprimirArea(circ);

	}

}
