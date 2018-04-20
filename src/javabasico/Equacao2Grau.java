package javabasico;
public class Equacao2Grau{
	public static void main(String[] args){
		int a = 4;
		int b = -4;
		int c = 1;
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("As raizes da equacao 4x_2 -4x +1");
		if(delta < 0 ){
			System.out.println("Nao tem raizes!");
		}else{
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("x1: " + x1);
			System.out.println("x2: " + x2);
		}
	}
}
