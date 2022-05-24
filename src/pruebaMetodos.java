
public class pruebaMetodos {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		
		miCuenta.depositar(300);
		System.out.println(miCuenta.saldo);
		
		
		Cuenta otraCuenta = new Cuenta();
		otraCuenta.depositar(1000);
		System.out.println(otraCuenta.saldo);
		otraCuenta.transferir(400, miCuenta);
		System.out.println(otraCuenta.saldo);
		System.out.println(miCuenta.saldo);
		
	}
	
}
