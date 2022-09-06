package f1;

public class TesteCarroCorrida {

	public static void main(String[] args) {
		Carro carroF1 = new Carro();
		System.out.println(carroF1.obterVelocidadeAtual());
		
		carroF1.acelerar(30, 10, carroF1.obterVelocidadeAtual());
		
		System.out.println(carroF1.obterVelocidadeAtual());
	}

}
