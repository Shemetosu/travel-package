package com.itstep.travel.validate.validator;

import com.itstep.travel.model.entity.TravelFeed;
import com.itstep.travel.model.entity.TravelTransport;
import com.itstep.travel.model.entity.TravelType;
import com.itstep.travel.repository.*;
import com.itstep.travel.validate.CheckEx;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class CheckExValidator implements ConstraintValidator<CheckEx, Object> {

    private final TravelTypeRepository travelTypeRepository;
    private final TravelTransportRepository travelTransportRepository;
    private final TravelFeedRepository travelFeedRepository;

    private boolean isActive;
    private Class<?> entityClass;

    public CheckExValidator(
            TravelTypeRepository travelTypeRepository,
            TravelTransportRepository travelTransportRepository,
            TravelFeedRepository travelFeedRepository
    ) {
        this.travelTypeRepository = travelTypeRepository;
        this.travelTransportRepository = travelTransportRepository;
        this.travelFeedRepository = travelFeedRepository;
    }

    @Override
    public void initialize(CheckEx constraintAnnotation) {
        this.isActive = constraintAnnotation.active();
        this.entityClass = constraintAnnotation.entityClass();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (!isActive) {
            return false;
        }
        try {
            Long id = (Long) value.getClass().getMethod("getId").invoke(value);
            if (entityClass == TravelType.class) {
                return travelTypeRepository.existsById(id);
            } else if (entityClass == TravelTransport.class) {
                return travelTransportRepository.existsById(id);
            } else if (entityClass == TravelFeed.class) {
                return travelFeedRepository.existsById(id);
            } else {
                throw new IllegalArgumentException("Unsupported entity class: " + entityClass.getName());
            }
        } catch (Exception ex) {
            throw new RuntimeException("Записи по ID = {}, не найдено", ex);
        }
    }
}
