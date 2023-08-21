package Startup;
public class Cliente {
	
	public int id;
	public String nomeEmpresa;
	public String cnpj;
	public String razaoSocial;
	public String nomeFantasia;
	public String telefone;
	public String email;
	public String dataAbertura;
	public String endereço;
	
	public Cliente(String nomeEmpresa, String cnpj, String razaoSocial, String nomeFantasia, String telefone, String email, String dataAbertura, String endereço) {
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.email = email;
		this.dataAbertura = dataAbertura;
		this.endereço = endereço;
	}
	
	@Override
	public String toString() {
		return "Nome da empresa: " + this.nomeEmpresa + "\nCNPJ: " + this.cnpj+ "\nTelefone: " + this.telefone + "\nEmail: "+ this.email +"\n\n";
	}
	

}
