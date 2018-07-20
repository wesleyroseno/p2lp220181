package arquivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;

import heranca.EstoquePratos;
import heranca.Personalizacao;
import heranca.PratoPersonalizado;
import interfaceoo.ComparaNomeArtista;
import interfaceoo.ComparaPrecoBase;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Arquivos.
 * 18/07/2018
 * @author Lívia
 *
 */
public class SistemaPratosPersonalizados {
	EstoquePratos estoque;
	
	public void fechar() {
		try{
			GerenteArquivo.salvarObjeto(estoque, "estoquePratos.bin");
		}catch(IOException e){
			System.out.println("excecao de fechamento ");
			e.printStackTrace();
			
		}
	}
	
	public void iniciar() {
		try{
			estoque = (EstoquePratos) GerenteArquivo.lerObjetos("estoquePratos.bin");
		}catch(FileNotFoundException e){
			estoque = new EstoquePratos();
		}catch(ClassNotFoundException | IOException e){
			System.out.println(e.getMessage());
			
		}
	}
	
	public void adicionaPratoTriangular(double precoBase, Personalizacao personalizacao, double base, double altura) {
		PratoPersonalizado p = estoque.criaPratoTriangular(precoBase, personalizacao, base, altura);
		estoque.adicionaPrato(p);
	}
	
	public void adicionaPratoRetangular(double precoBase, Personalizacao personalizacao, double base, double altura) {
		PratoPersonalizado p = estoque.criaPratoRetangular(precoBase, personalizacao, base, altura);
		estoque.adicionaPrato(p);
	}
	
	public void adicionaPratoCircular(double precoBase, Personalizacao personalizacao, double raio) {
		PratoPersonalizado p = estoque.criaPratoCircular(precoBase, personalizacao, raio);
		estoque.adicionaPrato(p);
	}
	
	public void adicionaPratoCircular(double precoBase, Personalizacao personalizacao, String artista, double raio) {
		PratoPersonalizado p = estoque.criaPratoCircular(precoBase, personalizacao, raio);
		p.setAutor(artista);
		estoque.adicionaPrato(p);
	}
	
	public PratoPersonalizado pegaPratoComPersonalizacao(Personalizacao personalizacao) {
		return estoque.pegaPratoComPersonalizacao(personalizacao);
	}
	
	public boolean temPratoComPersonalizacao(Personalizacao personalizacao) {
		return estoque.temPratoComPersonalizacao(personalizacao);
	}
	
	public boolean removePrato(PratoPersonalizado prato) {
		return estoque.removePrato(prato);
	}
	
	public double calculaLucroTotal() {
		return estoque.calculaLucroTotal();
	}
	
	public int getQtdPratos() {
		return estoque.getQtdPratos();
	}
	
	public String listar(){
		return estoque.listar();
	}
	
	public String ordenar(){
		return estoque.ordenar();
	}
	
	public void setEstrategiaDeComparacao(Comparator<PratoPersonalizado> novo){
		estoque.setEstrategiaDeComparacao(novo);
	}
	
	public String ordenarEspecial(){
		return estoque.ordenarEspecial();
	}
	
	public static void main(String[] args) {
		SistemaPratosPersonalizados sistema = new SistemaPratosPersonalizados();
		sistema.iniciar();

		sistema.adicionaPratoCircular(5, Personalizacao.ESTAMPA, 3);
		sistema.adicionaPratoRetangular(2, Personalizacao.PINTURA, 6, 3);
		sistema.adicionaPratoCircular(5, Personalizacao.ESTAMPA, 2);
		System.out.println("Listagem: \n" + sistema.listar());
		
		double lucro = sistema.calculaLucroTotal();
		System.out.println("Lucro total: " + lucro);
		
		System.out.println("Listagem em ordem: \n" + sistema.ordenar());
		
		System.out.println("Listagem pos ordenacao: \n" + sistema.listar());
		
		sistema.adicionaPratoCircular(3, Personalizacao.FOTO, "Aurora", 1);
		System.out.println("Listagem: \n" + sistema.listar());
		
		ComparaPrecoBase c = new ComparaPrecoBase();
		ComparaNomeArtista c2 = new ComparaNomeArtista();
		
		sistema.setEstrategiaDeComparacao(c2);
		System.out.println("Listagem em ordem: \n" + sistema.ordenarEspecial());
		sistema.setEstrategiaDeComparacao(c);
		System.out.println("Listagem em ordem: \n" + sistema.ordenarEspecial());

		sistema.fechar();
	}

}
