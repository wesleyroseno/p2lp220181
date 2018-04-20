package javabasico;

import java.util.*;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg 2018.1
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: estruturas básicas de java
 * @author Lívia
 *
 */
public class MaloteBanco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int op = 0;
		int numOp = 0;
		double soma = 0;
		int maior = 0;//poderia usar Integer.MIN_VALUE
		final int MAX_OPERACOES = 100;
		int[] operacoes = new int[MAX_OPERACOES];
		while(numOp < MAX_OPERACOES){
			System.out.print("Informe a proxima operacao do malote: ");
			op = input.nextInt();
			if(op == 0){
				break;
			}
			soma += op;
			if(op > maior){
				maior = op;
			}
			operacoes[numOp] = op;
			numOp++;
		}
		double media = numOp == 0? 0: soma / numOp;
		int numOpMaiorMedia = 0;
		for(int i = 0; i < numOp; i++){
			if(operacoes[i] > media){
				numOpMaiorMedia++;
			}
		}
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Media dos valores: " + media);
		System.out.printf("Media dos valores formatado: %.2f\n", media);
		System.out.println("Maior operacao do malote: " + maior);
		System.out.println("Numero de operacoes maiores que a media: " + numOpMaiorMedia);
		
		input.close();
	}

}
