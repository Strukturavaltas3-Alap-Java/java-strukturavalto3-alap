package week12.day01.rain;

public class RainObservationNotCorrectException extends RuntimeException {

    public RainObservationNotCorrectException() {
    }

    public RainObservationNotCorrectException(String message) {
        super(message);
    }

    public RainObservationNotCorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public RainObservationNotCorrectException(String quantityNumber, String dateNumber, Throwable cause) {
        super(String.format("Observation quantity (%s) or date (%s) not correct", quantityNumber, dateNumber), cause);
    }
}
