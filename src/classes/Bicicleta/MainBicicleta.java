package classes.Bicicleta;

public class MainBicicleta {

	public static void main(String[] args) {
		Assento a = new Assento(125, "gel");
		Bicicleta b = new Bicicleta (80, "specialized", a);
		//Bicicleta b2 = new Bicicleta (80, "", a);
		System.out.println("Modelo: " + b.getModelo()); //b2 troquei por b
	}

}
