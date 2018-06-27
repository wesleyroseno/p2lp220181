package heranca;

import java.util.HashSet;

public class GeradorDeFolhaDePagamento {

	private HashSet<Funcionario> funcionarios;
	
	public GeradorDeFolhaDePagamento() {
		funcionarios =  new HashSet<>();
	}
	
	public boolean addFuncionario(Funcionario f){
		return funcionarios.add(f);
	}
	
	public void addAllFuncionario(HashSet<Funcionario> funcionarios){
		this.funcionarios.addAll(funcionarios);
	}
	
	public String gerarFolhaPagamento(){
		String resultado = "";
		for(Funcionario f: funcionarios){
			resultado += f.getNome() + " - " + f.calculaPagamento() + "\n";
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		GeradorDeFolhaDePagamento gerador = new GeradorDeFolhaDePagamento();
		Assalariado a1 = new Assalariado("livia", "12", 12, 2000);
		a1.setQtdDependentes(2);
		gerador.addFuncionario(a1);
		Horista h1 = new Horista("thiago", "123", 13);
		h1.setHorasTrabalhadas(20);
		h1.setPrecoPorHora(2);
		gerador.addFuncionario(h1);
		System.out.println(gerador.gerarFolhaPagamento());
	}

}
