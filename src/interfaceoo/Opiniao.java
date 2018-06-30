package interfaceoo;

public class Opiniao {

	private String comentario;
	private double nota;
	
	public Opiniao(double nota, String comentario) {
		this.nota = nota;
		this.comentario = comentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Nota: " + getNota() + " comentario: " + getComentario();
	}

}
