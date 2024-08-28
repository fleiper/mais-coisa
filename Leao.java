package antigripe_interface;

public class Leao extends Animal{
	@Override
	public void dorme() {
		System.out.println("acordado");
	}

	@Override
	public void caminha() {
		System.out.println("Caminhando");
		
	}

	@Override
	public void corre() {
		System.out.println("correndo");
		
	}

	@Override
	public void som() {
		System.out.println("rosna");		
	}

}
