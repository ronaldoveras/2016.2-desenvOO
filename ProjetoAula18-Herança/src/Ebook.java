public class Ebook extends Livro {

	private String waterMark;

	public Ebook(String autor) {
		super(autor);
	}
	

	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}

		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	public String getWaterMark() {
		return waterMark;
	}

	public String toString(){
		return "Eu sou um Ebook e meu nome � " + getNome();
	}

}
