package com.api.parkingcontrol.service;

import com.api.parkingcontrol.models.ParkingControlModel;
import com.api.parkingcontrol.repository.ParkingControlRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ParkingControlService {

    final
    ParkingControlRepository parkingControlRepository;

    public ParkingControlService(ParkingControlRepository parkingControlRepository) {
        this.parkingControlRepository = parkingControlRepository;
    }

    @Transactional
    public ParkingControlModel save(ParkingControlModel parkingControlModel) {
        return parkingControlRepository.save(parkingControlModel);
    }
}
