package abstraction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class TeamReservation implements GymReservation {

    private static int PRICE = 9000;

    private String contactName;
    private List<String> teamMates;
    private LocalDateTime reservationTime;

    public TeamReservation(String contactName, List<String> teamMates, LocalDateTime reservationTime) {
        this.contactName = contactName;
        this.teamMates = teamMates;
        this.reservationTime = reservationTime;
    }

    @Override
    public String getContactName() {
        return contactName;
    }

    @Override
    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    @Override
    public int calculatePriceToPay() {
        return PRICE / (teamMates.size() + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamReservation that = (TeamReservation) o;

        return Objects.equals(reservationTime, that.reservationTime);
    }

    @Override
    public int hashCode() {
        return reservationTime != null ? reservationTime.hashCode() : 0;
    }
}
