package org.gunsugunaydin.AirlineManagement.exception.state;

public class NoChangesMadeException extends RuntimeException {

    public NoChangesMadeException(String entityName) {
        super("No changes were made to the " + entityName + " data.");
    }
}