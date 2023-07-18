package com.example.CarsApp.Service.impl;

import com.example.CarsApp.Repository.UserRepository;
import com.example.CarsApp.Service.interf.UserService;
import com.example.CarsApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractCRUDService<User, Long> implements UserService {
    @Autowired
    UserRepository userRepo;
    @Override
    CrudRepository<User, Long> getRepository() {
        return userRepo;
    }
}
