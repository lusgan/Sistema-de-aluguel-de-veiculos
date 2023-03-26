package dados;

public class Cliente {
	private String cpf;
	private String nome;
	private String telefone;
	private Carro carro = new Carro();
	private boolean temCarro = false;
	private Moto moto = new Moto();
	private boolean temMoto = false;
	
	
	public void setTemCarro(boolean temCarro) {
		this.temCarro = temCarro;
	}
	
	public void setTemMoto(boolean temMoto) {
		this.temMoto = temMoto;
	}
	
	public boolean getTemCarro() {
		return temCarro;
	}
	
	public boolean getTemMoto() {
		return temMoto;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
		temCarro=true;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
		temMoto=true;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	public Moto getMoto() {
		return moto;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return "cpf:" + cpf + " nome:" + nome + " telefone:" + telefone;
	}
}
