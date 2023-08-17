package conta;

 

public class Funcionário {

	public int id;
	public String nome;
	public String cpf;
	public String email;
	public String celular;
	public String senha;
	public double salarioBruto;

	public String mostrarDados() {
		return ("\nNome: " + this.nome + "\nEmail: " + this.email + "\nCelular: " + this.celular);
	}

	public Double calcularSalario(double inss) {
		double desc = this.salarioBruto * inss/100;
		double sl = this.salarioBruto - desc;
		return sl;
	}
	
	public Funcionário(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString();
	}
 

}