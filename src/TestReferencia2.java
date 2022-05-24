
public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente rogelio = new Cliente();
		rogelio.nombre = "Rogelio Bonaparte";
		rogelio.documento = "12344833";
		rogelio.telefono = "3515232312";
		
		Cuenta cuentaRogelio = new Cuenta();
		cuentaRogelio.agencia = 1;
		cuentaRogelio.titular = rogelio;
		
		System.out.println(cuentaRogelio.titular.documento);
	}
	
}
