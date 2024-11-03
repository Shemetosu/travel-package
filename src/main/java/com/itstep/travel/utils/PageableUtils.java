package com.itstep.travel.utils;

import lombok.experimental.UtilityClass;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@UtilityClass
public class PageableUtils {

    public static Pageable buildPageable(int pageNumber, int pageSize, String sortField, String sortOrder) {
        return PageRequest.of(1, 1);
    }
}