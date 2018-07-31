package recursividade;

public class Node {
	private Node prox;
	private int valor;

	public Node(int valor) {
		this.valor = valor;
	}
	public void add(Node novo) {
		if(prox == null) {
			setProx(novo);
			return;
		}
		prox.add(novo);
	}
	
	public void setProx(Node prox) {
		this.prox = prox;
	}
	public int contaPositivos() {
		int resultado = 0;
		if(valor > 0) {
			resultado = 1;
		}
		if(this.prox == null) {
			return resultado;
		}
		return resultado + prox.contaPositivos();
	}
	
	public static void main(String[] args) {
		Node primeiro = new Node(10);
		primeiro.add(new Node(25));
		primeiro.add(new Node(-2));
		primeiro.add(new Node(30));
		primeiro.add(new Node(-2));
		System.out.println(primeiro.contaPositivos());
		
	}
}