package antigripe_interface;

public abstract class Veiculos {
	
	String placa;
	String modelo;
	String cor;
	int ano;
	
	public abstract void acelerar ();
	public abstract void freiar ();
	public abstract void virar();
	public abstract void ligar ();


}
