package ar.edu.unahur.obj2.w2j;

public class Episodio {
	private int numero;
	private String titulo;
	private double costoBase;

	public Episodio(int numero, String titulo, double costoBase) {
		this.numero = numero;
		this.titulo = titulo;
		this.costoBase = costoBase;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getCostoBase() {
		return costoBase;
	}

}
