package com.example.CarsApp.Controller.rest;

import com.example.CarsApp.Service.interf.CRUDService;
import com.example.CarsApp.Service.interf.CarService;
import com.example.CarsApp.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CarRestController.CAR_REST_URL)
public class CarRestController extends CRUDRestController<Car, Long>{
    public static final String CAR_REST_URL = "car";

    @Autowired
    private CarService carService;


    @Override
    CRUDService<Car, Long> getService() {
        return carService;
    }
}
