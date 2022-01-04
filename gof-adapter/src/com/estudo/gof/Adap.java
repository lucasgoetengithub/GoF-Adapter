package com.estudo.gof;

public class Adap {
	public static void main(String[] args) {
		usar();
	}

	public static void usar() {
		Vetor fig = new Figura();
		Vetor cxa = new CaixaArrasteAdapter();
	}
}
