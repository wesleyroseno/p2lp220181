package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class AgendaSimples {
	private ArrayList<Contato> lista;
	private HashMap<String, LinkedList<Contato>> mapa;
	
	public AgendaSimples(){
		lista = new ArrayList<>();
		mapa = new HashMap<>();
	}
	
	public void adicionaContato(Contato c){
		lista.add(c);
		adicionaContatoMapa(c);
	}
	
	private void adicionaContatoMapa(Contato c){
		String chave = primeiraLetra(c.getNome());
		if(mapa.containsKey(chave)){
			mapa.get(chave).add(c);
		}else{
			LinkedList<Contato> l = new LinkedList<Contato>();
			l.add(c);
			mapa.put(chave, l);
		}
	}
	
	private String primeiraLetra(String s){
		return String.valueOf(s.charAt(0));
	}
	
	//lembrar que aqui o melhor seria retornar uma String e nao o objeto da colecao
	public LinkedList<Contato> filtro(String letra){
		return mapa.get(letra);
	}
	
	public void removeContato(int codigo){
		for(Contato c: lista){
			if(c.getCodigo() == codigo){
				lista.remove(c);
				String chave = primeiraLetra(c.getNome());
				mapa.get(chave).remove(c);
				break;
			}
		}
	}
	
	public Contato pesquisaContato(int codigo){
		for(Contato c: lista)
			if(c.getCodigo() == codigo)
				return c;
		return null;
	}
	
	public int tamanho(){
		return lista.size();
	}
	@Override
	public String toString() {
		return lista.toString();
	}
}