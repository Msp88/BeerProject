package com.example.msscbeerservice.web.mappers;

import com.example.msscbeerservice.domain.Beer;
import com.example.msscbeerservice.web.model.BeerDto;
import org.mapstruct.*;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
