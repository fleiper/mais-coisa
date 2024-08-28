package antigripe_interface;

public class Tigre extends Animal{
	@Override
	public void dorme() {
		System.out.println("dormindo");
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
		System.out.println("rogindo");		
	}
}
