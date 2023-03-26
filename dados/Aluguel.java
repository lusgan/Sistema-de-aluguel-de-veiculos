package dados;

public class Aluguel {

	private Carro listaDeCarros[] = new Carro[10];
	private Moto listaDeMotos[] = new Moto[10];
	private int qtdCarros = 0;
	private int qtdMotos = 0;
	private Cliente listaDeClientes[] = new Cliente[10];
	private int qtdClientes = 0;
	
	public void cadastrarCliente(Cliente cliente) {
		listaDeClientes[qtdClientes] = cliente;
		qtdClientes++;
	}

	public void cadastrarCarro(Carro carro) {
		listaDeCarros[qtdCarros] = carro;
		qtdCarros++;
	}

	public void cadastrarMoto(Moto moto) {
		listaDeMotos[qtdMotos] = moto;
		qtdMotos++;
	}

	public int getQtdMotos() {
		return qtdMotos;
	}

	public int getQtdCarros() {
		return qtdCarros;
	}
	
	public int getQtdClientes() {
		return qtdClientes;
	}

	public Carro[] getListadeCarros() {
		return listaDeCarros;
	}

	public Moto[] getListadeMotos() {
		return listaDeMotos;
	}
	
	public Cliente[] getListaDeCliente() {
		return listaDeClientes;
	}

}
