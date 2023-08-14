package mercado;

public class Produto {
	
	public int id;
	public String nome;
	public double valorUnitario;
	
	public double calcularTotal(int qtd) {
		return (qtd * this.valorUnitario);
		
		
	}

}
