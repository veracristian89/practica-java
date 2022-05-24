//entidad cuenta:

class Cuenta {
	private double saldo;//al utilizar private ya no se puede acceder al parametro saldo desde una instancia para modificarlo.
	int agencia;
	int numero;
	Cliente titular = new Cliente();
	

	public void depositar(double monto) {
		this.saldo += monto;
	}

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
}
