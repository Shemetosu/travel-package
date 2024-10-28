package com.itstep.travel_package.converter;

import com.itstep.travel_package.model.dto.TravelDto;
import com.itstep.travel_package.model.dto.create.TravelCreateDto;
import com.itstep.travel_package.model.dto.update.TravelUpdateDto;
import com.itstep.travel_package.model.entity.Travel;

public interface TravelConverter {

    Travel convert(TravelCreateDto source);

    Travel convert(TravelUpdateDto source);

    TravelDto convert(Travel source);
}
