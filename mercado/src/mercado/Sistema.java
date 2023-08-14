package mercado;

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {
		String menuText = "Bem vindo ao Sistema Mercad�o\nEscolha a op��o desejada:\n1 - Cadastrar produto\n2 - Remover produto\n3 - Listar produtos\n4 - Calcular total\n0 - Encerrar programa";
		int op;
		Produto	p = new Produto();
		int qtd;
		
		do {
		op= Integer.parseInt(JOptionPane.showInputDialog(null,menuText));
			switch (op) {
				case 1:
					p.nome = JOptionPane.showInputDialog(null, "Digite o nome do produto");
					p.valorUnitario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor unit�rio do produto"));
					break;
					
				case 2:
					break;
					
				case 3:
					JOptionPane.showMessageDialog(null, "Produto: " + p.nome + "\nPre�o unit�rio: R$" + p.valorUnitario);
					break;
						
				case 4:
					qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade do produto:"));
					JOptionPane.showMessageDialog(null, "Valor total: R$" + p.calcularTotal(qtd));
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "Sistema encerrado\nAt� logo!");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Op��o invalida\nInsira um n�mero v�lido");
					break;	
			}
		} while (op != 0);
			

	}

}
