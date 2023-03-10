package com.test.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.Instant;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TripID", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserID", nullable = false)
    private Users userID;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VehicleID", nullable = false)
    private Vehicle vehicleID;

    @Column(name = "TravelEnd")
    private Instant travelEnd;

    @NotNull
    @Column(name = "TravelStart", nullable = false)
    private Instant travelStart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUserID() {
        return userID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }

    public Vehicle getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Vehicle vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Instant getTravelEnd() {
        return travelEnd;
    }

    public void setTravelEnd(Instant travelEnd) {
        this.travelEnd = travelEnd;
    }

    public Instant getTravelStart() {
        return travelStart;
    }

    public void setTravelStart(Instant travelStart) {
        this.travelStart = travelStart;
    }

}