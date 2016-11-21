package br.aeso.aula22.pacoteA;

import br.aeso.aula22.pacoteB.ClasseB;
import br.aeso.aula22.pacoteC.ClasseC;

public class ClasseA extends ClasseB {
	
	private ClasseC c;
	
	public void imprimir(){
		super.imprimir();
		c.imprimir();
		System.out.println("Eu sou a classe A");
	}

}
