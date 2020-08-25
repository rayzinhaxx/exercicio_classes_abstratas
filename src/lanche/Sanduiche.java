package lanche;

public class Sanduiche extends Lanche{
	private String ingredientes[];
	private final int tempoDePreparo = 15;
	
	@Override
	public int tempoDeEntrega(int distancia) {
		return (super.tempoDeEntrega(distancia) + tempoDePreparo);
	}
	
	//2 reais por ingrediente + 0,75 por km de distância
	public double valorPedido(int distancia, int qtdIngredientes) {
		return (qtdIngredientes * 2) + (distancia * 0.75);
	}
	
	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
