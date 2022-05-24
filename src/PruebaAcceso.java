
public class PruebaAcceso {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.setAgencia(-22);
		cuenta.depositar(300);
		cuenta.retirar(200);
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
		
	}
	
}
