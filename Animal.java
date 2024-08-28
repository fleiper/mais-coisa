package antigripe_interface;

public abstract class Animal {
	String raça;
	String nome;
	String sexo;
	
	public String getnome() {
		return nome;
	}
	public void setnome (String nome) {
		this.nome = nome;
	}
	public String getraça() {
		return raça;
	}
	public void  setraça (String raça) {
		this.raça = raça;
	}
	public String getsexo () {
		return sexo;
	}
	public void setsexo (String sexo) {
		this.sexo = sexo;
	}


	public abstract void dorme();
	public abstract void caminha();
	public abstract void corre();
	public abstract void som ();

}
