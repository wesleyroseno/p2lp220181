package heranca;

public class MainPessoa {

	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica("livia", "123");
		System.out.println(p1.getNome());
		System.out.println(p1);
		System.out.println(p1.getClass().toString());
		
		Pessoa p = new Pessoa("maria");
		System.out.println(p);
	}

}
