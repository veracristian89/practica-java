//entidad cuenta:

class Cuenta {
	private double saldo;//al utilizar private ya no se puede acceder al parametro saldo desde una instancia para modificarlo.
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total = 0; // variable estatica, es pasa a ser un atributo de la clase y no de sus posibles instancias.
	
	//constructor
	public Cuenta(int agencia) { // cual es la ventaja? con el constructor obliga a colocar un valor a agencia.
		
		if (agencia <= 0) {
			System.out.println("no se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("se van creando "+ total + " cuentas");
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
