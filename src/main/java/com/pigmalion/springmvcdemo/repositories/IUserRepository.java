package com.pigmalion.springmvcdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pigmalion.springmvcdemo.model.User;


public interface IUserRepository extends JpaRepository<User, Long> {
}
