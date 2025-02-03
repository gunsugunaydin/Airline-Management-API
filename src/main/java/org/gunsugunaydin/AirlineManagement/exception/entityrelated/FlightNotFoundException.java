package org.gunsugunaydin.AirlineManagement.exception.entityrelated;

public class FlightNotFoundException extends RuntimeException {
   
    public FlightNotFoundException(Long id) {
        super("Airplane with ID " + id + " not found");
    }
}