package encapsulamento;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		Produto p = new Produto("Papel Sufite", 10, 20.00);
		System.out.println(p);
		ArrayList<Produto> lista = new ArrayList<>();
		int op, qtd, opVender;
		boolean encontrou = false;
		String nome;
		String menu = "1 - Cadastrar novo produto\n2 - Listar\n3 - Vender\n4 - Atualizar estoque\n0 - Encerrar programa";
		
		lista.add(new Produto("Caneta", 5, 2.89));
		lista.add(new Produto("Borracha", 6, 1.50));
		lista.add(new Produto("Caderno", 9, 22.50));
		
		for(Produto item:lista) {
			System.out.println(item);
		}
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
				case 1:
					nome =JOptionPane.showInputDialog("Digite o nome do produto:");
					qtd =  Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto no estoque:"));
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do produto:"));
					lista.add(new Produto(nome, qtd, valor));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, lista);
					break;
				case 3:
					do {
						opVender = Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer:\n1 - Inserir produto\n2 - Remover produto\n0 - Encerrar venda"));
					} while (opVender == 0)
					break;
				case 4:
					nome =JOptionPane.showInputDialog("Digite o nome do produto que deseja atualizar:");
					for(Produto item:lista){
						
						if(nome.equalsIgnoreCase(item.getNomeProduto())) {
							qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto no estoque:"));
							item.atualizaEstoque(qtd);
							JOptionPane.showMessageDialog(null, "Estoque atualizado");
							encontrou = true;
							break;
							
						}
					}

					if (!encontrou) {
						JOptionPane.showMessageDialog(null, "Produto não encontrado");
					}
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa encerrado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Insira uma opção válida");
					break;
			}
		} while(op!=0); 
	}

}
