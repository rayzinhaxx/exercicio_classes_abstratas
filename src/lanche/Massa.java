package lanche;

public class Massa extends Lanche{
	private String molho;
	private final String tiposDeMassa[] = {"macarrão", "pizza", "lasanha"};
	private String tipoDeMassa;
	private final int tempoDePreparo = 30;

	@Override
	public int tempoDeEntrega(int distancia) {
		return (super.tempoDeEntrega(distancia) + tempoDePreparo);
	}
	
	public double valorPedido(int distancia, String tipoDeMassa) {
		double valor = distancia * 0.75;
		
		if(tipoDeMassa.equals("macarrão")) {
			valor += 10;
		} else if (tipoDeMassa.equals("pizza")) {
			valor += 15;
		} else if (tipoDeMassa.equals("lasanha")){
			valor += 20;
		}
		
		super.setPreco(valor);
		return super.getPreco();
	}
	
	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String[] getTiposDeMassa() {
		return tiposDeMassa;
	}

	public String getTipoDeMassa() {
		return tipoDeMassa;
	}

	public void setTipoDeMassa(String tipoDeMassa) {
		this.tipoDeMassa = tipoDeMassa;
	}
}
