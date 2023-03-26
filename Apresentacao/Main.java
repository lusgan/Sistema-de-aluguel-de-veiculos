package Apresentacao;
import dados.*;
import java.util.Scanner;

public class Main {
	
	public static Scanner s = new Scanner(System.in);
	public static Aluguel aluguel = new Aluguel();
	
	//fazer 2 funcoes, uma pra cadastrar moto, e outra pra cadastrar carro
	//fazer 2 funcoes para aluguel, dentro da opcao 5 do menu, vao aparecer 2 opcoes, 1- carro 2- moto, ai dependendo
	//da que o cliente escolher eu chamo a funcao pra alugar carro ou a pra alugar moto
	
	public static void apresentarMenu() {
		System.out.println("1- Cadastrar Veiculo");
		System.out.println("2- cadastrar cliente");
		System.out.println("3- lista de motos");
		System.out.println("4- lista de carros");
		System.out.println("5- Alugar Veiculo");
		System.out.println("6- Mostrar veiculo alugado pelo cliente");
		System.out.println("7- sair");
	}
	
	public static void cadastrarCliente() {
		Cliente c = new Cliente();
		System.out.println("Cpf:");
		c.setCpf(s.nextLine());
		
		System.out.println("Nome:");
		c.setNome(s.nextLine());
		
		System.out.println("Telefone:");
		c.setTelefone(s.nextLine());
		
		aluguel.cadastrarCliente(c);
		System.out.println("Cliente cadastardo!");
		
		
	}
	
	public static void cadastrarVeiculo() {
		System.out.println("1- carro");
		System.out.println("2- moto");
		int opcao = Integer.parseInt(s.nextLine());
		
		if(opcao==1) {
			Carro carro = new Carro();
			System.out.println("Placa:");
			carro.setPlaca(s.nextLine());
			
			System.out.println("Marca:");
			carro.setMarca(s.nextLine());
			
			System.out.println("Modelo:");
			carro.setModelo(s.nextLine());
			
			System.out.println("Classe:");
			carro.setClasse(s.nextLine());
			
			System.out.println("Preco:");
			carro.setPreco(Double.parseDouble(s.nextLine()));
			
			System.out.println("Digite:\n1- possui ar-condicionado\n2- nao possui ar-condicionado");
			int arCondicionado = Integer.parseInt(s.nextLine());
			if(arCondicionado==1) {
				carro.setArCondicionado(true);
			}
			else if(arCondicionado==2) {
				carro.setArCondicionado(false);
			}
			
			System.out.println("Digite:\n1- Automatico\n2- Manual");
			int automatico = Integer.parseInt(s.nextLine());
			if(automatico==1) {
				carro.setAutomático(true);
			}
			else if(automatico==2) {
				carro.setManual(true);
			}
			
			aluguel.cadastrarCarro(carro);
			System.out.println("Carro cadastrado!");
			
			
		}
		
		else if(opcao==2) {
			Moto moto = new Moto();
			System.out.println("Placa:");
			moto.setPlaca(s.nextLine());
			
			System.out.println("Marca:");
			moto.setMarca(s.nextLine());
			
			System.out.println("Modelo:");
			moto.setModelo(s.nextLine());
			
			
			System.out.println("Digite:\n1- Automatica\n2- Manual");
			int automatico = Integer.parseInt(s.nextLine());
			if(automatico==1) {
				moto.setAutomatica(true);
				moto.setManual(false);
			}
			else if(automatico==2) {
				moto.setManual(true);
				moto.setAutomatica(false);
			}
			
			System.out.println("Tem ignicao eletrica?\n1- Sim\n2- Nao");
			int ignicao = Integer.parseInt(s.nextLine());
			if(ignicao==1) {
				moto.setIgnicaoEletrica(true);
			}
			else if(ignicao==2) {
				moto.setIgnicaoEletrica(false);
			}
			
			aluguel.cadastrarMoto(moto);
			System.out.println("Moto cadastrada!");
		}
		
	}
	
	public static void mostrarListaCarros() {
		for(int i = 0; i<aluguel.getQtdCarros();i++) {
			System.out.println("opcao "+i+": "+aluguel.getListadeCarros()[i].toString());
		}
	}
	
	public static void mostrarListaMotos() {
		for(int i = 0; i<aluguel.getQtdMotos();i++) {
			System.out.println("opcao "+i+": "+aluguel.getListadeMotos()[i].toString());
		}
	}
	
	public static void alugarVeiculo() {
		
		if(aluguel.getQtdCarros()==0 && aluguel.getQtdMotos()==0) {
			System.out.println("nao ha veiculos registrado!");
			return;
		}
		
		System.out.println("Insira seu cpf:");
		String cpf = s.nextLine();
	
		if(aluguel.getQtdClientes()==0) {
			System.out.println("Nenhum cliente cadastrado!");
			return;
		}
		
		boolean clienteCadastrado = false;
		
		//substituir por funcao equal dps
		for(int i = 0; i<aluguel.getQtdClientes();i++) {
			if(cpf.intern()==aluguel.getListaDeCliente()[i].getCpf().intern()) {
				clienteCadastrado = true;
			
				
				System.out.println("escolha o veiculo:\n1- Carro\n2- Moto");
				int opcao = Integer.parseInt(s.nextLine());
				
				if(opcao==1) {
					
					if(aluguel.getQtdCarros()==0) {
						System.out.println("Sinto muito, nao temos carros disponiveis no momento!");
						return;
					}
					
					System.out.println("Insira a opcao do carro que deseja:\n");
					mostrarListaCarros();
					int indice = Integer.parseInt(s.nextLine());
					aluguel.getListaDeCliente()[i].setCarro(aluguel.getListadeCarros()[indice]);
					aluguel.getListaDeCliente()[i].setTemCarro(true);
					System.out.println("Veiculo alugado!");
					
				}
				
				else if(opcao==2) {
					
					if(aluguel.getQtdMotos()==0) {
						System.out.println("Sinto muito, nao temos motos disponiveis no momento!");
						return;
					}
					
					System.out.println("Insira a opcao da moto que deseja:\n");
					mostrarListaMotos();
					int indice = Integer.parseInt(s.nextLine());
					aluguel.getListaDeCliente()[i].setMoto(aluguel.getListadeMotos()[indice]);
					aluguel.getListaDeCliente()[i].setTemMoto(true);
					System.out.println("Veiculo alugado!");
				}
				
				return;
			}
		}
		
		if(clienteCadastrado==false) {
			System.out.println("Cliente ainda nao foi cadastrado!");
			return;
		}
		
		
		
	}
	
	public static void mostrarVeiculoPorCpf() {
		
		if(aluguel.getQtdClientes()==0) {
			System.out.println("Nenhum cliente cadastrado ainda!");
			return;
		}
		
		System.out.println("Cpf:");
		String cpf = s.nextLine();
		
		boolean clienteExiste = false;
		for(int i = 0; i<aluguel.getQtdClientes();i++) {
			if(cpf.intern()==aluguel.getListaDeCliente()[i].getCpf().intern()) {
				clienteExiste = true;
				
				if(aluguel.getListaDeCliente()[i].getTemCarro()==true) {
				System.out.println(aluguel.getListaDeCliente()[i].getCarro().toString());
				}
				
				if(aluguel.getListaDeCliente()[i].getTemMoto()==true) {
					System.out.println(aluguel.getListaDeCliente()[i].getMoto().toString());
				}
				
				else if(aluguel.getListaDeCliente()[i].getTemCarro()==false && aluguel.getListaDeCliente()[i].getTemMoto()==false){
					System.out.println("Cliente nao possui veiculo alugado!");
				}
				
				return;
			}
		}
		
		if(clienteExiste==false) {
			System.out.println("Cliente nao registrado!");
			return;
		}
		
	}
	
	public static void main(String[] args) {
		
		int menu = -1;
		
		do {
			apresentarMenu();
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu) {
			
			case 1:
				cadastrarVeiculo();
				break;
			
			case 2:
				cadastrarCliente();
				break;
				
			case 3:
				mostrarListaMotos();
				break;
			
			case 4:
				mostrarListaCarros();
				break;
				
			case 5:
				alugarVeiculo();
				break;
			
			case 6:
				mostrarVeiculoPorCpf();
				break;
				
			case 7:
				return;
				
			default:
				System.out.println("Opcao invalida");
			
			}
			
			
		}while(menu!=7);
		
		
	}
	
}
