//package com.itstep.travel_package.repository.specification;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//public static class TravelSpecification<Travel> findAll(TravelFilterDto filter){
//
//        return (travel, criteriaQuery, criteriaBuilder) -> {
//List<Predicate> predicateList = new ArrayList<>(4);
//            if (filter.getTravelTypeId() != null) {
//        predicateList.add(
//        criteriaBuilder.equal(travel.get("travelTypeId"), filter.getTravelTypeId())
//        );
//        }
//        if (filter.getTravelTransportId() != null) {
//        predicateList.add(
//        criteriaBuilder.equal(travel.get("travelTransportId"), filter.getTravelTransportId())
//        );
//        }
//        if (filter.getTravelFeedId() != null) {
//        predicateList.add(
//        criteriaBuilder.equal(travel.get("travelFeedId"), filter.getTravelFeedId())
//        );
//        }
//        if (filter.getDaysCountFrom() != null & filter.getDaysCountTo() != null) {
//        predicateList.add(
//        criteriaBuilder.between(travel.get("daysCount"), filter.getDaysCountFrom(), filter.getDaysCountTo())
//        );
//        }
//        if (filter.getDaysCountFrom() != null & filter.getDaysCountTo() == null) {
//        predicateList.add(
//        criteriaBuilder.greaterThanOrEqualTo(travel.get("daysCount"), filter.getDaysCountFrom())
//        );
//        }
//        if (filter.getDaysCountFrom() == null & filter.getDaysCountTo() != null) {
//        predicateList.add(
//        criteriaBuilder.lessThanOrEqualTo(travel.get("daysCount"), filter.getDaysCountTo())
//        );
//        }
//        return criteriaBuilder.and(predicateList.toArray(new Predicate[0]));
//        };