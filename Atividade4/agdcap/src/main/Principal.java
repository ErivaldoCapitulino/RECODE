package main;

import java.util.List;
import java.util.Scanner;
import controller.ClienteDAO;
import controller.DestinoDAO;
import controller.EnderecoDAO;
import controller.PacoteDAO;
import controller.ReservaDAO;
import controller.TelefoneDAO;
import model.Cliente;
import model.Destino;
import model.Endereco;
import model.Pacote;
import model.Reserva;
import model.Telefone;

public class Principal {

	public static void main(String[] args) {
		
		int opcao = 0;
		
		PacoteDAO pacotedao = new PacoteDAO();
		EnderecoDAO enderecodao = new EnderecoDAO();
		ClienteDAO clientedao = new ClienteDAO();
		TelefoneDAO telefonedao = new TelefoneDAO();
		DestinoDAO destinodao = new DestinoDAO();
		ReservaDAO reservadao = new ReservaDAO();
		
		Cliente cliente = new Cliente();
		Telefone telefone = new Telefone();
		Pacote pacote = new Pacote();
		Destino destino = new Destino();
		Endereco endereco = new Endereco();
		Reserva reserva = new Reserva();
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);

		System.out.println("=========================================================");
		System.out.println("             AGÊNCIA DE VIAGEM AGCAP                     ");
		System.out.println("=========================================================");

		do {
			System.out.println("=== Menu Cliente ===");
			//O cadastro de cliente abrange as informções da tabela telefone e endereco
			System.out.println("1 - Cadastro do cliente");
			System.out.println("2 - Excluir cliente");
			System.out.println("3 - Atualizar cliente");
			System.out.println("4 - Mostrar cliente cadastrados");
			System.out.println("5 - Buscar por cliente por ID");
			
			System.out.println("=== Menu Pacote ===");
			System.out.println("6 - Cadastro de Pacote");
			System.out.println("7 - Excluir Pacote");
			System.out.println("8 - Fazendo");
			System.out.println("9 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("===== INFORMAÇÕES PESSOAIS =====");
				System.out.println("Digite o nome do cliente");
				cliente.setNome(entrada1.nextLine());

				System.out.println("Informe o e-mail do cliente");
				cliente.setEmail(entrada1.nextLine());
				clientedao.save(cliente);
		
				System.out.println("Informe o telefone");
				telefone.setNumero(entrada.next());
				telefone.setId_cliente(6);
				telefonedao.save(telefone);
				
				System.out.println("Informe o seu endereço");
				endereco.setRua(entrada1.nextLine());
				System.out.println("Informe o número");
				endereco.setNumero(entrada1.nextInt());
				System.out.println("Informe o seu bairro");
				endereco.setBairro(entrada.next());
				System.out.println("Informe a cidade");
				endereco.setCidade(entrada1.next());
				System.out.println("Informe o estado");
				endereco.setEstado(entrada.next());
				System.out.println("Informe o cep");
				endereco.setCep(entrada.next());
				endereco.setId_cliente(2);
				enderecodao.save(endereco);
				break;
			}

			case 2: {
				System.out.println("Digite o código do cliente para exclusão: ");
				try {
					cliente.setId(entrada.nextInt());
					clientedao.removeById(cliente.getId());
				} catch (Exception e) {
					System.out.println("Nenhum dado para exclusão");
				}

				break;
			}

			case 3: {
				System.out.println("Digite o código do cliente para atualizar");
				cliente.setId(entrada.nextInt());

				System.out.println("Digite o novo nome do cliente: ");
				cliente.setNome(entrada1.nextLine());

				System.out.println("Digite o novo e-mail do cliente");
				cliente.setEmail(entrada1.nextLine());

				clientedao.update(cliente);

				break;
			}

			case 4: {
//				for (Cliente c : cc.getAll()) {
//					System.out.println("ID: " + c.getId());
//					System.out.println("NOME: " + c.getNome());
//					System.out.println("EMAIL: " + c.getEmail());
//					System.out.println("-----------------------------------------------------");
//				}
				
				List<Cliente> clientes = clientedao.getAll();
				System.out.println(clientes);
				
				break;
			}

			case 5: {
				System.out.println("Digite o ID para buscar: ");
				int id = entrada.nextInt();
				//cliente = cc.getClienteId(id);

				System.out.println("NOME: " + cliente.getNome());
				System.out.println("EMAIL: " + cliente.getEmail());
				System.out.println("----------------------------------------------------------");
				break;
			}

			case 6: {
				System.out.println("Quantos dias");
				pacote.setQuantidadeDeDias(entrada.nextInt());
				System.out.println("Informe o itinerario");
				pacote.setItinerario(entrada1.nextLine());
				System.out.println("Informe o custo do pacote");
				pacote.setCusto(entrada1.nextDouble());
				System.out.println("Informe o desconto do pacote");
				pacote.setDesconto(entrada1.nextDouble());
				pacotedao.save(pacote);

				System.out.println("Qual lugar");
				destino.setLugar(entrada.next());
				System.out.println("o lugar está associado ao qual pacote");
				destino.setId_pacote(entrada.nextInt());
				destinodao.save(destino);
				
				break;
			}
			case 7:{
				System.out.println("Digite o código do pacote para exclusão: ");
				try {
					pacote.setId(entrada.nextInt());
					pacotedao.removeById(pacote.getId());
				} catch (Exception e) {
					System.out.println("Nenhum dado para exclusão");
				}

				break;
			}
			case 8:{

				
				break;
			}
			default:
				System.out.println("Opção Inválida:");
			}

		} while (opcao != 9);

		entrada.close();
	}
}
