package com.example.CarsApp.Controller.mvc;

import com.example.CarsApp.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(CarController.CAR_URL)
public class CarController extends CRUDController<Car, Long> {
    public static final String CAR_URL = "ui/car";
    public static final String CAR_NAME = "car";

    @Override
    String getEntityName() {
        return CAR_NAME;
    }
}
