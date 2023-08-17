package conta;

public class Cliente {
	
	public int id;
	public String nome;
	public String cpf;
	public String email;
	public String celular;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Sobrecarga
	public Cliente() {}
	
	//Sobrecarga
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf;
	} 
}