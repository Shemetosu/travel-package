package com.itstep.travel.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@UtilityClass
public class PageableUtils {

    public static Pageable buildPageable(int pageNumber, int pageSize, String sortField, String sortOrder) {
        pageNumber--;
        return StringUtils.isEmpty(sortField)
                ? PageRequest.of(pageNumber, pageSize)
                : PageRequest.of(pageNumber, pageSize, Sort.Direction.fromString(sortOrder), sortOrder);
    }
}