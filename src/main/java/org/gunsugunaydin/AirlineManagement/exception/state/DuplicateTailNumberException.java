package org.gunsugunaydin.AirlineManagement.exception.state;

public class DuplicateTailNumberException extends RuntimeException {
    
    public DuplicateTailNumberException(String tailNumber) {
        super("Airplane with tail number " + tailNumber + " already exists.");
    }
}

