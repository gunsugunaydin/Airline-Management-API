package org.gunsugunaydin.AirlineManagement.mapper;

import org.gunsugunaydin.AirlineManagement.model.Flight;
import org.gunsugunaydin.AirlineManagement.payload.flight.FlightRequestDTO;
import org.gunsugunaydin.AirlineManagement.payload.flight.FlightResponseDTO;
import org.gunsugunaydin.AirlineManagement.repository.AirplaneRepository;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = AirplaneRepository.class)
public interface FlightMapper {

    FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    @Mapping(target = "airplane", ignore = true) 
    Flight toEntity(FlightRequestDTO flightRequest, @Context AirplaneRepository airplaneRepository);

    @Mapping(source = "airplane.id", target = "airplaneId")
    FlightResponseDTO toResponse(Flight flight);
}