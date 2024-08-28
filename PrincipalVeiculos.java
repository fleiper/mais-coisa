package antigripe_interface;

public class PrincipalVeiculos {

	public static void main(String[] args) {
		Carro car = new Carro();
		Onibus bus = new Onibus ();
		
		System.out.println("BUSÃOOOOOOOOOOO");
		bus.acelerar();
		bus.freiar();
		bus.ligar();
		bus.virar();
		System.out.println("================================");
		System.out.println("UBER");
		car.acelerar();
		car.freiar();
		car.ligar();
		car.virar();
	}
	

}