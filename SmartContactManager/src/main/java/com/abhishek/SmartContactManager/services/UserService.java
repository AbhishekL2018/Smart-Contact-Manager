package com.abhishek.SmartContactManager.services;

import com.abhishek.SmartContactManager.dao.UserRepository;
import com.abhishek.SmartContactManager.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        user.setEnabled(true);
        user.setRole("ROLE_USER");
        System.out.println(user);
        userRepository.save(user);
    }
}
