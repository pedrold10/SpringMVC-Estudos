package com.api.parkingcontrol.controller;

import com.api.parkingcontrol.dto.ParkingControlDTO;
import com.api.parkingcontrol.models.ParkingControlModel;
import com.api.parkingcontrol.service.ParkingControlService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("parking-control")
public class ParkingControlController {
    final ParkingControlService parkingControlService;

    public ParkingControlController(ParkingControlService parkingControlService) {
        this.parkingControlService = parkingControlService;
    }

    @PostMapping
    public ResponseEntity<Object> savingParkingControl(@RequestBody @Valid ParkingControlDTO parkingControlDTO){

        var parkingControlModel = new ParkingControlModel();
        BeanUtils.copyProperties(parkingControlDTO, parkingControlModel);
        parkingControlModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingControlService.save(parkingControlModel));
    }

}
