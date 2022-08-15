package week03.day05;

public class Passenger {

    private String name;
    private String ticketId;
    private int numberOfLuggage;

    public Passenger(String name, String ticketId, int numberOfLuggage) {
        this.name = name;
        this.ticketId = ticketId;
        this.numberOfLuggage = numberOfLuggage;
    }

    public String getName() {
        return name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public int getNumberOfLuggage() {
        return numberOfLuggage;
    }

}
