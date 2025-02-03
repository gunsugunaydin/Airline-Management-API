package org.gunsugunaydin.AirlineManagement.exception.state;

public class AirplaneNotAvailableException extends RuntimeException {

    public AirplaneNotAvailableException() {
        super("The airplane is currently not available.");
    }

    public AirplaneNotAvailableException(String message) {
        super(message);
    }
}