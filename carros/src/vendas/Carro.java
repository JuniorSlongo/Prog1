package vendas;

public class Carro {
	
	private int codigo;
	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	private float kmAtual;
	
	
	public void definirCodigo(int cod) {
		codigo = cod;
		
	}
	
	
	public int obterCodigo() {
		return codigo;
	}
	
	
	public double obterPreco() {
		return preco;
	}
	
	
	public void definirPreco(double novoPreco) {
		preco = novoPreco;
	}
	
	public void definirMarca(String novaMarca) {
		marca = novaMarca;
	}
	
	public String obterMarca() {
		return marca;
	}
	public void definirModelo(String novoModelo) {
		modelo=novoModelo;
	}
	public String obterModelo() {
		return modelo;
	}
	public void escreverDados() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Preço: " + preco);
		System.out.println("KM: " + kmAtual);
		System.out.println("Código: " + codigo);
		
	}
}
