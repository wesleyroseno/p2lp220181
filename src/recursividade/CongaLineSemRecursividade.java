package recursividade;

import java.util.LinkedList;
import java.util.List;

public class CongaLineSemRecursividade {
	List<DancarinoSemRecursao> dancarinos;
	
	public CongaLineSemRecursividade() {
		dancarinos = new LinkedList<>();
	}
	
	public void adicionaDancarino(String nome){
		dancarinos.add(new DancarinoSemRecursao(nome));
	}
	
	public int contar(){
		return dancarinos.size();
	}
	
	@Override
	public String toString() {
		return dancarinos.toString();
	}
	
	public static void main(String[] args) {
		CongaLine danca = new CongaLine();
		danca.adicionaDancarino("Huguinho");
		danca.adicionaDancarino("Zezinho");
		danca.adicionaDancarino("Luizinho");
		danca.adicionaDancarino("Margarida");
		danca.adicionaDancarino("Minnie");
		System.out.println(danca);
		System.out.println(danca.contar());
	}

}

