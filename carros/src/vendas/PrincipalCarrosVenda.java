package vendas;

public class PrincipalCarrosVenda {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.definirModelo("Fusca XL");
		c1.definirMarca("Volkswagen");
		c1.definirPreco(2000);
		
		c1.escreverDados();
	}
}
