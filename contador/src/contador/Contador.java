package contador;

public class Contador {
	private int valorAtual;
	
	public void atribuirValor(int valor) {
		valorAtual = valor;
	}
	
	public int obterValorAtual() {
		return valorAtual;
	}
	public void incrementarValor() {
		valorAtual++;
	}
	
	
}
