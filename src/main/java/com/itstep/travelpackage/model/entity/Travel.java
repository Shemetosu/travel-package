package com.itstep.travelpackage.model.entity;

import com.itstep.travelpackage.model.entity.parent.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "travel")
public class Travel extends BaseEntity {

    @Column(name = "travel_type_id", insertable = false, updatable = false)
    private Long travelTypeId;

    @Column(name = "travel_transport_id", insertable = false, updatable = false)
    private Long travelTransportId;

    @Column(name = "travel_feed_id", insertable = false, updatable = false)
    private Long travelFeedId;

    @Column(name = "days_count")
    private Integer daysCount;

    @ManyToOne
    @JoinColumn(
            name = "travel_type_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_travel_to_travel_type")
    )
    private TravelType travelType;

    @ManyToOne
    @JoinColumn(
            name = "travel_transport_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_travel_to_travel_transport")
    )
    private TravelTransport travelTransport;

    @ManyToOne
    @JoinColumn(
            name = "travel_feed_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_travel_to_travel_feed")
    )
    private TravelFeed travelFeed;
}
