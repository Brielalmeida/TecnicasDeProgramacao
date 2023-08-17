package conta;
 

public class Conta {
	//Atributos
	public String titular;
	public double saldo;

 

	//Métodos
	public void deposita(double v) {
		this.saldo += v;
	}

 

	public boolean sacar(double v) {
		if (this.saldo >= v) {
			this.saldo -= v;
			return true;
		} else {
			return false;
		}
	}
	
		
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//Sobrecarga
	public Conta() {}
	
	//Sobrecarga
	public Conta(String titular) {
		this.titular = titular;
	}
	
	
	@Override
	public String toString() {
		return "Titular: " + this.titular + "\nSaldo: " + this.saldo;
	}

 

 

 

}