package antigripe_interface;

public class Carro extends Veiculos {

	@Override
	public void acelerar() {
		System.out.println("Acelerando");		
	}

	@Override
	public void freiar() {
		System.out.println("freiando");		
	}

	@Override
	public void virar() {
		System.out.println("virando");		
	}

	@Override
	public void ligar() {
		System.out.println("ligando");		
	}

}
