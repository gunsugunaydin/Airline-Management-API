package org.gunsugunaydin.AirlineManagement.mapper;

import org.gunsugunaydin.AirlineManagement.model.Airplane;
import org.gunsugunaydin.AirlineManagement.payload.airplane.AirplaneRequestDTO;
import org.gunsugunaydin.AirlineManagement.payload.airplane.AirplaneResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AirplaneMapper {

    AirplaneMapper INSTANCE = Mappers.getMapper(AirplaneMapper.class);
    
    @Mapping(target = "id", ignore = true) 
    @Mapping(target = "flights", ignore = true)
    Airplane toEntity(AirplaneRequestDTO airplaneRequest);
    
    AirplaneResponseDTO toResponse(Airplane airplane);
}