package encapsulamento;

public class Produto {
	private String nomeProduto;
	private int quantidade;
	private double valorUnitario;
	public String atributo = "Atributo público";
	
	public Produto(String n, int qtd, double valor) {
		this.nomeProduto = n;
		this.quantidade = qtd;
		this.valorUnitario = valor;
	}
	
	public String getNomeProduto() {
		return this.nomeProduto;
	}
	
	public void atualizaEstoque(int qtd) {
		this.quantidade += qtd;
	}
	
	@Override
	public String toString() {
		return ("Nome: " + this.nomeProduto + " | Quantidade: " + this.quantidade + " | Valor Unitário: " + this.valorUnitario + "\n");
	}
}

