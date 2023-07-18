package com.example.CarsApp.validator;

import com.example.CarsApp.Service.impl.UserDetailsServiceImpl;
import com.example.CarsApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class UserValidator implements Validator {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        User userToValidate = (User) obj;
        Optional<User> userFromDB = userDetailsService.loadUserOptionalByUsername(userToValidate.getUsername());
        if (userFromDB.isPresent()) {
            errors.rejectValue("username", "400", "Username already exists");
        }

    }
}
