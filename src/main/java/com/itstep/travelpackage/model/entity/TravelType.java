package com.itstep.travelpackage.model.entity;

import com.itstep.travelpackage.model.entity.parent.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "travel_type")
public class TravelType extends BaseEntity {

    @OneToMany(mappedBy = "travel_type")
    private List<Travel> travelList;
}
