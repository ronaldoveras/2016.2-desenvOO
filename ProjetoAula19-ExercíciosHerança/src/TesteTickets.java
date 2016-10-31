
public class TesteTickets {

	public static void main(String[] args) {
		Ticket ticketNormal = new Ticket();
		ticketNormal.setNome("Show Safadão");
		ticketNormal.setValor(new Double(400));
		ticketNormal.imprimeValor();
		
		TicketVIP ticketVip = new TicketVIP();
		ticketVip.setNome("Show Safadão");
		ticketVip.setValor(new Double(400));
		ticketVip.setValorAdicional(new Double(250));
		ticketVip.imprimeValor();
		
	}

}
