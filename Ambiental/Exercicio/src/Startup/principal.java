package Startup;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		int menu;
		String strMenu = "Digite a op��o desejada: \n1 - Cadastrar novo cliente\n2 - Listar clientes\n3 - Buscar cliente\n4 - Acresentar insumos e custos\n5 - Relat�rios\n0 - Encerrar programa";
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
			switch (menu) {
				case 1:
					String nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa");
					String cnpj = JOptionPane.showInputDialog("Digite o cnpj da empresa");
					String razaoSocial = JOptionPane.showInputDialog("Digite a raz�o social da empresa");
					String nomeFantasia = JOptionPane.showInputDialog("Digite o nome fantasia da empresa");
					String telefone = JOptionPane.showInputDialog("Digite o telefone da empresa");
					String email = JOptionPane.showInputDialog("Digite o email da empresa");
					String dataAbertura = JOptionPane.showInputDialog("Digite a data de abertura da empresa");
					String endereco = JOptionPane.showInputDialog("Digite o endere�o da empresa");
					clientes.add(new Cliente(nomeEmpresa,cnpj,razaoSocial,nomeFantasia,telefone,email,dataAbertura, endereco));
					break;
					
				case 2:
						JOptionPane.showMessageDialog(null, clientes);
					break;
					
				case 3:
					String busca = JOptionPane.showInputDialog("Digite o CNPJ da empresa");
					boolean identificador = false;
					for (int i = 0; i < clientes.size(); i++) {
						if (clientes.get(i).cnpj.equals(busca)) {
								JOptionPane.showMessageDialog(null, "\n" + clientes.get(i).toString());
							identificador = true;
						}
					}
					if (!identificador) {
						JOptionPane.showMessageDialog(null, "Cliente n�o cadastrado ou n�o encontrado");
					}
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "Sistema encerrado");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Por favor, insira uma op��o v�lida");
					break;
			}
		} while (menu != 0);
		
	}

}
