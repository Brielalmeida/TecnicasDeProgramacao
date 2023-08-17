package conta;

 

import javax.swing.JOptionPane;

 

public class Principal {

	public static void main(String[] args) {
		Conta c = new Conta();
		int menu;

		c.titular = JOptionPane.showInputDialog("Digite o nome do titular");
		JOptionPane.showMessageDialog(null, "Olá! "+c.titular);
		c.saldo = 100;



		
		do {	
			menu = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:\n1 - Sacar\n2 - Depositar\n3 - Checar Saldo\n 0 - Encerrar programa"));
			switch (menu) {

				case 1 :
					double saque =  Double.parseDouble(JOptionPane.showInputDialog("O quanto você quer sacar:"));
					if (c.sacar(saque)) {
						c.sacar(saque);
						JOptionPane.showMessageDialog(null, "Seu saldo é: " + c.saldo);
					} else {
						JOptionPane.showMessageDialog(null, "Saldo insuficiente");
					}
					break;

				case 2:
					double depositar =  Double.parseDouble(JOptionPane.showInputDialog("O quanto você quer depositar:"));
					c.deposita(depositar);
					JOptionPane.showMessageDialog(null, "Seu saldo é: " + c.saldo);
					break;

				case 3:
					JOptionPane.showMessageDialog(null, "Seu saldo é: " + c.saldo);
					break;

				case 0:
					break;

				default:
					JOptionPane.showMessageDialog(null, "Insira um valor válido");	
			}
		} while (menu !=0);


 

 

		
	}

 

 

}