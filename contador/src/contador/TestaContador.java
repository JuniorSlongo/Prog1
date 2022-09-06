package contador;

public class TestaContador {

	public static void main(String[] args) {
		Contador c = new Contador();
		
		c.atribuirValor(0);
		System.out.println(c.obterValorAtual());
		c.incrementarValor();
		System.out.println(c.obterValorAtual());
		c.incrementarValor();
		System.out.println(c.obterValorAtual());


	}

}
