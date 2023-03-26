package dados;

public class Moto {

	private double preco;
	private boolean automatica;
	private boolean manual;
	private boolean ignicaoEletrica;

	private Veiculos moto;

	public void setPlaca(String placa) {
		moto.setPlaca(placa);
	}

	public void setMarca(String marca) {
		moto.setMarca(marca);
	}

	public void setModelo(String modelo) {
		moto.setModelo(modelo);
	}

	public String getPlaca() {
		return moto.getPlaca();
	}

	public String getMarca() {
		return moto.getMarca();
	}

	public String getModelo() {
		return moto.getModelo();
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isAutomatica() {
		return automatica;
	}

	public void setAutomatica(boolean automatica) {
		this.automatica = automatica;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public boolean isIgnicaoEletrica() {
		return ignicaoEletrica;
	}

	public void setIgnicaoEletrica(boolean ignicaoEletrica) {
		this.ignicaoEletrica = ignicaoEletrica;
	}

	public String toString() {
		return ("marca:" + moto.getMarca() + " placa:" + moto.getPlaca() + " modelo:" + moto.getModelo()
				+ " Automatica:" + automatica);
	}

}
