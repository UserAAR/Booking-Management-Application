package com.devaar.booking_append.utils.mapper;

import com.devaar.booking_append.dao.entity.PassengerEntity;
import com.devaar.booking_append.model.dtos.request.PassengerRequest;
import com.devaar.booking_append.model.dtos.response.PassengerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(uses = BookingMapper.class,componentModel = "spring")
public interface PassengerMapper {

//    PassengerMapper INSTANCE = Mappers.getMapper(PassengerMapper.class);

    @Mappings({
//            @Mapping(target = "id", ignore = true)
//            @Mapping(target = "bookings", source = "bookings")
    })
    PassengerEntity toEntity(PassengerRequest passengerRequest);

    List<PassengerEntity> toEntityList(List<PassengerRequest> passengerRequests);

    @Mappings({
//            @Mapping(target = "bookings", source = "bookings"),
//            @Mapping(target = "id", ignore = true)
    })
    PassengerResponse toResponse(PassengerEntity passengerEntity);
}
