package classes;

import java.time.LocalDate;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg 2018.1
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: criação de classes
 * @author Lívia
 *
 */
public class Aluno {

	private int anoNascimento;
	private String nome;
	private double cra;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCra() {
		return cra;
	}

	public void setCra(double cra) {
		this.cra = cra;
	}

	public Aluno(String nome, int anoNascimento2, double cra2){
		this.nome = nome;
		anoNascimento = anoNascimento2;
		cra = cra2;
	}
	
	public Aluno(String nome2, double cra2){
		nome = nome2;
		cra = cra2;
	}
	public int getAnoNascimento(){
		return anoNascimento;
	}
	
	public void setAnoNascimento(int novo){
		anoNascimento = novo;
	}
	
	public int calculaIdade(){
		LocalDate hoje = LocalDate.now(); 
		int anoAtual = hoje.getYear();
		int idade = anoAtual - getAnoNascimento();
		return idade;
	}
	public String desempenho(){
		if(cra < 7){
			return "Abaixo da Media";
		}else if(cra >=7 && cra < 9){
			return "Acima da Media";
		}else{
			return "Top de linha";
		}
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " Idade: " + calculaIdade() + " CRA: " + getCra();
	}
}
