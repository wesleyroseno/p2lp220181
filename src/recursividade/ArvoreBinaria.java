package recursividade;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg 2016.2
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: recursividade OO com arvores
 * @author Lívia
 *
 */
public class ArvoreBinaria {
	private No raiz;
	
	public void inserir(int valor){
		if(raiz == null){
			raiz = new No(valor);
		}else{
			raiz.inserir(valor);
		}
	}
	
	public void imprimirEmOrdem(){
		if(raiz == null){
			return;
		}
		raiz.imprimirEmOrdem();
	}
	
	public int contar(){
		if(raiz == null){
			return 0;
		}
		return raiz.contar();
	}
	
	public boolean contemNo(int valor){
		if(raiz == null){
			return false;
		}
		return raiz.contemNo(valor);
	}
	
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.inserir(20);
		arvore.inserir(10);
		arvore.inserir(50);
		arvore.inserir(15);
		arvore.inserir(8);
		arvore.inserir(52);
		arvore.inserir(49);
		arvore.imprimirEmOrdem();
		System.out.println("Contando elementos: " + arvore.contar());
		System.out.println("Contem 20: " + arvore.contemNo(20));
		System.out.println("Contem 100: " + arvore.contemNo(100));
		System.out.println("Contem 52: " + arvore.contemNo(52));
		System.out.println("Contem 1: " + arvore.contemNo(1));
	}

}
