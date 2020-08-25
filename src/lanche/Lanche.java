package lanche;

public abstract class Lanche {
	private double preco;

	public int tempoDeEntrega(int distancia) {
		return 10 * distancia;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
