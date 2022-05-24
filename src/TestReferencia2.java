
public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente rogelio = new Cliente();
		rogelio.setNombre("Rogelio Bonaparte");
		rogelio.setDocumento("12344833");
		rogelio.setTelefono("3515232312");
		
		Cuenta cuentaRogelio = new Cuenta();
		cuentaRogelio.agencia = 1;
		cuentaRogelio.setTitular(rogelio);
		
		System.out.println(cuentaRogelio.getTitular().getDocumento());
	}
	
}
