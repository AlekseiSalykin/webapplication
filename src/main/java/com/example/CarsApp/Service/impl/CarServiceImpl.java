package com.example.CarsApp.Service.impl;

import com.example.CarsApp.Repository.CarRepo;
import com.example.CarsApp.Service.interf.CarService;
import com.example.CarsApp.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public class CarServiceImpl extends AbstractCRUDService<Car, Long> implements CarService {
    @Autowired
    CarRepo carRepo;
    @Override
    CrudRepository<Car, Long> getRepository() {
        return carRepo;
    }
}
