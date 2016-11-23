package br.aeso.classesauxiliares;

import br.aeso.classesbasicas.Circunferencia;
import br.aeso.classesbasicas.IFormaGeometrica;
import br.aeso.classesbasicas.Retangulo;

public class VisualizadorArea {

	public void imprimirArea(IFormaGeometrica forma){
		String nomeForma = null;
		if(forma instanceof Retangulo){
			nomeForma = "Retangulo";
		}
		if(forma instanceof Circunferencia){
			nomeForma = "Circunferencia";
		}
		System.out.println("Área da forma " + nomeForma + ": " + forma.area());
	}
}
