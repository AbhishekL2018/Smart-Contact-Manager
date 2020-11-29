package com.abhishek.SmartContactManager.dao;

import com.abhishek.SmartContactManager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
