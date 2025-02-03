package org.gunsugunaydin.AirlineManagement.mapper;

import org.gunsugunaydin.AirlineManagement.model.Reservation;
import org.gunsugunaydin.AirlineManagement.payload.reservation.ReservationRequestDTO;
import org.gunsugunaydin.AirlineManagement.payload.reservation.ReservationResponseDTO;
import org.gunsugunaydin.AirlineManagement.repository.FlightRepository;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = FlightRepository.class)
public interface ReservationMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservationCode", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "flight", ignore = true)
    Reservation toEntity(ReservationRequestDTO dto, @Context FlightRepository flightRepository);

    @Mapping(source = "flight.id", target = "flightId")
    ReservationResponseDTO toResponse(Reservation reservation);
}