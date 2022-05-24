
public class PruebaConstructor {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(5);
		cuenta.setAgencia(-4);
		
		System.out.println(cuenta.getAgencia());
		
	}
	
}
