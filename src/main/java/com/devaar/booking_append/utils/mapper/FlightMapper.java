package com.devaar.booking_append.utils.mapper;

import com.devaar.booking_append.dao.entity.FlightEntity;
import com.devaar.booking_append.model.dtos.request.FlightRequest;
import com.devaar.booking_append.model.dtos.response.FlightResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",uses = BookingMapper.class)
public interface FlightMapper {

//    FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);

//    @Mapping(target = "id", ignore = true)
    FlightEntity toEntity(FlightRequest flightRequest);

//    @Mapping(target = "id", ignore = true)
    FlightResponse toResponse(FlightEntity flightEntity);
}
