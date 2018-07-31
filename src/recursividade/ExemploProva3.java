package recursividade;

public class ExemploProva3 {
	public static void main(String[] args) {
		System.out.println(recursao("EXEMPLO", 3));
	}

	private static String recursao(String palavra, int a) {
		if(a == 0) {
			return palavra;
		}
		return palavra.substring(0,  a) + recursao(palavra, a-1);
		
	}
}
