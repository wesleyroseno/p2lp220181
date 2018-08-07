package classes.DiarioDeBordoOO;

import java.util.Scanner;

public class MainAnotacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Anotacao a1 = new Anotacao("criacao de classes", "20/04/2018");
		String texto = sc.nextLine();
		String data = sc.nextLine();
		sc.close();
		Anotacao a2 = new Anotacao(texto, data);
		a2.setDesempenho(500);
		System.out.println(a2.getDesempenho());
		System.out.println(a1);
		System.out.println(a2);
	
	}

}
