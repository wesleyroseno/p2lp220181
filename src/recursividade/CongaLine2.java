package recursividade;

public class CongaLine2 {
	private DancarinoSemRecursao primeiro;
	
	public void adiciona(String nome) {
		DancarinoSemRecursao novo = new DancarinoSemRecursao(nome);
		if(primeiro == null) {
			primeiro = novo;
		}else {
			DancarinoSemRecursao aux = primeiro;
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			
			aux.setProximo(novo);
		}
		
	}
	
	public String listar() {
		String resultado = "";
		if(primeiro == null) {
			return resultado;
		}
		DancarinoSemRecursao aux = primeiro;
		while(aux.getProximo() != null) {
			resultado += aux.getNome() + "\n";
			aux = aux.getProximo();
		}
		resultado += aux.getNome() + "\n";
		return resultado;
	}
	
	public static void main(String[] args) {
		CongaLine2 danca = new CongaLine2();
		System.out.println("Listando a congaline\n" + danca.listar());
		
		danca.adiciona("livia");
		
		System.out.println("Listando a congaline\n" + danca.listar());
		
		danca.adiciona("tiago");
		danca.adiciona("yuri");
		danca.adiciona("mariana");
		
		System.out.println("Listando a congaline\n" + danca.listar());
		
	}

}
