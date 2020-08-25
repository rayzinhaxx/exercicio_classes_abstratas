package lanche;

public class Bolo extends Lanche{
	private String massa;
	private String recheio;
	private String cobertura;
	private final int tempoDePreparo = 10;
	
	@Override
	public int tempoDeEntrega(int distancia) {
		return (super.tempoDeEntrega(distancia) + tempoDePreparo);
	}
	
	public double valorPedido(int distancia) {
		super.setPreco((distancia * 0.75) + 35);
		return super.getPreco();
	}
	
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	
}
