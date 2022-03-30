package com.api.parkingcontrol.repository;

import com.api.parkingcontrol.models.ParkingControlModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingControlRepository extends JpaRepository<ParkingControlModel, UUID> {

}
