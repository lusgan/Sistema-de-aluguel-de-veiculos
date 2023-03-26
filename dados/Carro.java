package dados;

public class Carro extends Veiculos {

	private boolean arCondicionado;
	private boolean automatico = false;
	private boolean manual = false;
	private double preco;
	private String classe;

	private Veiculos carro = new Veiculos();

	public void setPlaca(String placa) {
		carro.setPlaca(placa);
	}

	public void setMarca(String marca) {
		carro.setMarca(marca);
	}

	public void setModelo(String modelo) {
		carro.setModelo(modelo);
	}

	public String getPlaca() {
		return carro.getPlaca();
	}

	public String getMarca() {
		return carro.getMarca();
	}

	public String getModelo() {
		return carro.getModelo();
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isAutomático() {
		return automatico;
	}

	public void setAutomático(boolean automático) {
		this.automatico = automático;
		manual = false;

	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
		automatico = false;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String toString() {
		return ("marca:" + carro.getMarca() + " placa:" + carro.getPlaca() + " modelo:" + carro.getModelo()
				+ " Automatico:" + automatico + " Ar-condicionado:" + arCondicionado);
	}

}
