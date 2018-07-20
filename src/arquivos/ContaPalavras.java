package arquivos;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import utils.LeituraDeDados;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Arquivos.
 * 13/07/2018
 * @author Lívia
 *
 */
public class ContaPalavras {
	public static void main(String[] args) {
		String texto="";
		try {
			texto = LeituraDeDados.leArquivoTexto("nomes.txt");
		}catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		HashMap<String, Integer> palavras = new HashMap<>();
		Scanner sc = new Scanner(texto);
		while(sc.hasNextLine()) {
			String[] linha = sc.nextLine().split(" ");
			atualizaMapa(linha, palavras);
		}
		imprimeMapa(palavras);
		sc.close();
	}

	private static void atualizaMapa(String[] linha, HashMap<String, Integer> palavras) {
		for(String s: linha) {
			Integer qtd = 0;
			if(palavras.containsKey(s)) {
				qtd = palavras.get(s);
			}
			palavras.put(s, qtd+1);
		}
	}
	
	private static void imprimeMapa(HashMap<String, Integer> palavras) {
		Set<String> lista = palavras.keySet();
		for(String s: lista) {
			System.out.println(s + " - " + palavras.get(s));
		}
	}

}
