package com.devaar.booking_append.utils.mapper;

import com.devaar.booking_append.dao.entity.BookingEntity;
import com.devaar.booking_append.model.dtos.request.BookingRequest;
import com.devaar.booking_append.model.dtos.response.BookingResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {

//    BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

//    @Mapping(target = "id", ignore = true)
    @Mapping(target = "flight", source = "flight")
    @Mapping(target = "passengers", source = "passengers")
    BookingEntity toEntity(BookingRequest bookingRequest);

//    @Mapping(target = "id", ignore = true)
    @Mapping(target = "flight", source = "flight")
    @Mapping(target = "passengers", source = "passengers")
    BookingResponse toResponse(BookingEntity bookingEntity);

    List<BookingResponse> toResponseList(List<BookingEntity> bookingEntities);
}
