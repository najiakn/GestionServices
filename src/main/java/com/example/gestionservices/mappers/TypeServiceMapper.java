package com.example.gestionservices.mappers;

import com.example.gestionservices.dto.TypeServiceDto;
import com.example.gestionservices.models.TypeService;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface TypeServiceMapper {
    TypeService toEntity(TypeServiceDto typeServiceDto);
    TypeServiceDto toDto (TypeService typeService);
    List<TypeService> toEntityList(List<TypeServiceDto> typeServiceDtos);
    List<TypeServiceDto> toDtoList(List<TypeService> typeServices);

}
