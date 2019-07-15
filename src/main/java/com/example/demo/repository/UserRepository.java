package com.example.demo.repository;

import com.example.demo.model.Users;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Users,Integer> {
    Users findById(int id);
}
