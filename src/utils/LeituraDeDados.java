package utils;

import java.util.Scanner;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg 2016.2
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: entrada de dados com Scanner; uso de static
 * @author Lívia
 *
 */
public class LeituraDeDados {
	private static Scanner teclado = new Scanner(System.in);
	
	public static String leLinha(String msg){
		
		System.out.println(msg);
		String valor = teclado.nextLine();
		return valor;
	}
	
	public static double leDouble(String msg){
		System.out.println(msg);
		double valor = teclado.nextDouble();
		teclado.nextLine();
		return valor;
	}
	
	public static int leInt(String msg){
		System.out.println(msg);
		int valor = teclado.nextInt();
		teclado.nextLine();
		return valor;
	}
	
	public static int leIntPositivo(String msg){
		System.out.println(msg);
		int valor;
		do{
			valor = teclado.nextInt();
			teclado.nextLine();
		}while(valor < 0);
		return valor;
	}

}
