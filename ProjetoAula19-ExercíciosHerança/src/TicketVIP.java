
public class TicketVIP extends Ticket {
	
	private Double valorAdicional;
	
	public void setValorAdicional(Double valor){
		this.valorAdicional = valor;
	}
	
	public Double getValorAdicional(){
		return this.valorAdicional;
	}
	
	public void imprimeValor(){
		System.out.println(this.valorAdicional + getValor());
	}
}
