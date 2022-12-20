package training360.oop;

public class StandingTicket implements Ticket {

    private BasicTicket basicTicket;
    private StandingTicketType ticketType;

    public StandingTicket(BasicTicket basicTicket, StandingTicketType ticketType) {
        this.basicTicket = basicTicket;
        this.ticketType = ticketType;
    }

    @Override
    public double getPrice() {
        return Math.round(basicTicket.getPrice() * (100 + ticketType.getPricePercent())) / 100.0;
    }

    @Override
    public BasicTicket getBasicTicket() {
        return basicTicket;
    }

    public StandingTicketType getTicketType() {
        return ticketType;
    }
}
