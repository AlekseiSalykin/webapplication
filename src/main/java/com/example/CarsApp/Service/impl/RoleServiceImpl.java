package com.example.CarsApp.Service.impl;

import com.example.CarsApp.Repository.RoleRepo;
import com.example.CarsApp.Service.interf.RoleService;
import com.example.CarsApp.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public class RoleServiceImpl extends AbstractCRUDService<Role, Long> implements RoleService {
    @Autowired
    RoleRepo roleRepo;
    @Override
    CrudRepository<Role, Long> getRepository() {
        return roleRepo;
    }
}
