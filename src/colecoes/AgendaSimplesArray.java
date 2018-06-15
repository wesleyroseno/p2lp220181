package colecoes;

import java.util.Arrays;

public class AgendaSimplesArray {

	private Contato[] lista;
	private int indice;
	
	public AgendaSimplesArray(){
		lista = new Contato[10];
	}
	
	public void adicionaContato(Contato c){
		lista[indice++] = c;
	}
	
	public void removeContato(int codigo){
		for (int i = 0; i < indice; i++) {
			if(lista[i].getCodigo() == codigo){
				for(int j = i; j < indice; j++){
					if(j == indice-1){
						lista[j] = null;
					}else{
						lista[j] = lista[j+1];
					}
				}
				indice--;
			}
		}
	}
	
	public Contato pesquisaContato(int codigo){
		for (int i = 0; i < indice; i++) {
			if(lista[i].getCodigo() == codigo){
				return lista[i]; //atencao, retornando objeto!
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(lista);
	}
	
	public static void main(String[] args) {
		AgendaSimplesArray agenda = new AgendaSimplesArray();
		agenda.adicionaContato(new Contato("livia", "123", 1));
		agenda.adicionaContato(new Contato("livia maria", "1234", 2));
		System.out.println(agenda.pesquisaContato(1));
		System.out.println(agenda);
		agenda.removeContato(2);
		System.out.println(agenda);
		agenda.removeContato(1);
		System.out.println(agenda);
		agenda.adicionaContato(new Contato("lorem", "123", 1));
		System.out.println(agenda);
		
	}
}
