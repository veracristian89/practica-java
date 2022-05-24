//entidad cuenta:

class Cuenta {
	private double saldo;//al utilizar private ya no se puede acceder al parametro saldo desde una instancia para modificarlo.
	int agencia;
	int numero;
	private Cliente titular = new Cliente();
	
	//constructor
	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("no se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		System.out.println("aqui se crea una nueva cuenta");
	}
	
	// metodo sin retorno (void)
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	//metodo con retorno (boolean, aunque pueden ser distintos retornos como int o double)
	public boolean retirar(double monto) {
		if (this.saldo >= monto) {
			this.saldo -= monto;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double monto, Cuenta cuenta){
		if(this.saldo >= monto) {
			this.retirar(monto);
			cuenta.depositar(monto);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia>0) {
		this.agencia = agencia;
		} else {
			System.out.println("agencia invalida");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
