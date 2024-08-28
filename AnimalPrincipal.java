package antigripe_interface;
public class AnimalPrincipal {

	public static void main(String[] args) {
		Gato garfield =new Gato ();
		Lobo guará = new Lobo();
		Tigre tigrinho = new Tigre();
		Leao PROERD = new Leao();
		Cao dog = new Cao();
		
		//gato
		garfield.setnome("GARFIELD");
		garfield.setraça("LARANJA");
		garfield.setsexo("MACHO");
		//cachorro 
		guará.setnome("JOÃO PEDRO");
		guará.setraça("CINZA");
		guará.setsexo("FÊMEA");
		//tigre 
		tigrinho.setnome("APOSTADOR");
		tigrinho.setraça("LARANJA");
		tigrinho.setsexo("MACHO");
		//leão
		PROERD.setnome("REI DA FLORESTA");
		PROERD.setraça("LARANJA");
		PROERD.setsexo("MACHO");
		//lobo
		dog.setnome("FREDDY");
		dog.setraça("POODLE");
		dog.setsexo("MACHO");
		
		
		
		System.out.println("===============================");
		System.out.println("GATO");
		System.out.println(garfield.getnome());
		System.out.println(garfield.getraça());
		System.out.println(garfield.getsexo());
		garfield.caminha();
		garfield.corre();
		garfield.dorme();
		garfield.som();
		System.out.println("===============================");
		
		System.out.println("LOBO");
		System.out.println(guará.getnome());
		System.out.println(guará.getraça());
		System.out.println(guará.getsexo());
		guará.caminha();
		guará.corre();
		guará.dorme();
		guará.som();
		System.out.println("===============================");
		
		System.out.println("TIGRE");
		System.out.println(tigrinho.getnome());
		System.out.println(tigrinho.getraça());
		System.out.println(tigrinho.getsexo());
		tigrinho.caminha();
		tigrinho.corre();
		tigrinho.dorme();
		tigrinho.som();
		System.out.println("===============================");
		
		System.out.println("===============================");
		System.out.println("GATO");
		System.out.println(PROERD.getnome());
		System.out.println(PROERD.getraça());
		System.out.println(PROERD.getsexo());
		PROERD.caminha();
		PROERD.corre();
		PROERD.dorme();
		PROERD.som();
		System.out.println("===============================");
		
		System.out.println("===============================");
		System.out.println("CÃO");
		System.out.println(dog.getnome());
		System.out.println(dog.getraça());
		System.out.println(dog.getsexo());
		dog.caminha();
		dog.corre();
		dog.som();
		System.out.println("===============================");
	}

}
