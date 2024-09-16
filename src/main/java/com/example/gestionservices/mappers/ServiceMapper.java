package com.example.gestionservices.mappers;

import com.example.gestionservices.dto.ServiceDto;
import com.example.gestionservices.models.ServiceModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring")
public interface ServiceMapper {

    ServiceMapper instance= Mappers.getMapper(ServiceMapper.class);

    @Mapping(source="TypeService.id",target="idType")
    ServiceDto toDto(ServiceModel serviceModel);

    @Mapping(source="idType", target = "TypeService.id")
    ServiceModel toEntity (ServiceDto serviceDto);

    List<ServiceDto> toDtoList (List<ServiceModel> serviceModelList);
    List<ServiceModel> toEntityList (List<ServiceDto> serviceDtoList);


}
