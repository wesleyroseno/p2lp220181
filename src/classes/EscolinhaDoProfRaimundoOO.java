package classes;

import java.util.Scanner;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg 2018.1
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: uso de objetos; arrays de objetos
 * @author Lívia
 *
 */
public class EscolinhaDoProfRaimundoOO {
//Muito convidativo para usar modularizacao
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a qtd de alunos: ");
		int numAlunos = input.nextInt();
		input.nextLine(); //limpa o buffer!
		
		Aluno[] alunos = new Aluno[numAlunos];
		
		int numAlunosEspecifico = 0;
		
		//le dados dos alunos
		for (int i = 0; i < numAlunos; i++) {
			System.out.print("Aluno: ");
			String nome = input.nextLine();
			System.out.print("Ano de nascimento: ");
			int ano = input.nextInt();
			input.nextLine(); //limpa o buffer!
			System.out.println("CRA: ");
			double cra = input.nextDouble();
			input.nextLine(); //limpa o buffer!
			Aluno a = new Aluno(nome, ano, cra);
			alunos[i] = a;
		}
		
		//processa dados dos alunos
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i].calculaIdade() > 20 && alunos[i].getCra() >= 7.0){
				numAlunosEspecifico++;
			}
		}
		
		System.out.println("Alunos acima de 20 anos, cras >= 7.0: " + numAlunosEspecifico);
		
		//mostra dados de alunos
		System.out.println("\nTodos os alunos...\n");
		for (int i = 0; i < numAlunos; i++) {
			System.out.println(alunos[i]);
		}
		
		//mostra o desempenho especifico de um aluno
		System.out.println("\nQual a ordem do aluno:");
		int indice = input.nextInt();
		input.nextLine();
		System.out.println(alunos[indice].getNome() + " " + alunos[indice].desempenho());
		input.close();
		
	}
}
