package f1;

public class Carro {
	private String cor;
	private String modelo;
	private float velocidadeAtual;
	private float velocidadeMaxima;
	
	public float obterVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void acelerar(float aceleracao, float t, float velInicial) {
		velocidadeAtual = velInicial + aceleracao*t;
	}
	
	public void definirCor(String c) {
		cor = c;
	}
	
	public String obterCor() {
		return cor;
	}
	
}
