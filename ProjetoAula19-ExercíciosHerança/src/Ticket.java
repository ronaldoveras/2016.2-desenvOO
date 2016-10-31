
public class Ticket {
	private Double valor;
	private String nome;
	
	public void setValor(Double valor){
		this.valor = valor;
	}
	
	public Double getValor(){
		return this.valor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void imprimeValor(){
		System.out.println(this.valor);
	}
}
