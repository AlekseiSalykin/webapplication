package com.example.CarsApp.Service.impl;

import com.example.CarsApp.Repository.UserRepository;
import com.example.CarsApp.Security.UserDetailsImpl;
import com.example.CarsApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = loadUserOptionalByUsername(username);
        if(user.isEmpty()){
            throw new UsernameNotFoundException("User not found");
        }
        return new UserDetailsImpl(user.get());
    }

    public Optional<User> loadUserOptionalByUsername(String username) {
        return userRepo.findByUsername(username);
    }
}
