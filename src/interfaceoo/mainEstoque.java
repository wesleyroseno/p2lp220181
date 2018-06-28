package interfaceoo;

import heranca.EstoquePratos;
import heranca.Personalizacao;
import heranca.PratoPersonalizado;

public class mainEstoque {
	public static void main(String[] args) {
		EstoquePratos estoque = new EstoquePratos();
		PratoPersonalizado p1 = estoque.criaPratoCircular(5, Personalizacao.ESTAMPA, 3);
		PratoPersonalizado p2 = estoque.criaPratoRetangular(10, Personalizacao.PINTURA, 6, 3);
		PratoPersonalizado p3 = estoque.criaPratoCircular(5, Personalizacao.ESTAMPA, 2);
		estoque.adicionaPrato(p1);
		estoque.adicionaPrato(p2);
		estoque.adicionaPrato(p3);
		System.out.println(estoque.listar());
		
		double lucro = estoque.calculaLucroTotal();
		System.out.println("Lucro total: " + lucro);
		
		System.out.println(estoque.ordenar());
		System.out.println(estoque.listar());
		
	}
}
