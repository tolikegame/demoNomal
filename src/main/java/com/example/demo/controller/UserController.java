package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "findOne")
    public Users findOne(@RequestParam int id){
        Users users = userRepository.findById(id);
        return users;
    }

    @Autowired
    EntityManagerFactory emf;

    @GetMapping(value="lifeCycle")
    @Rollback(value = false)
//    @Transactional(readOnly = true)
    public void lifeCycle(){
        EntityManager entityManager = emf.createEntityManager();
        Users users = entityManager.find(Users.class,1);
//        entityManager.clear();
//        entityManager.detach(users);
//        Users users2 = entityManager.find(Users.class,2);

//        Query query = entityManager.createNativeQuery("select * from user WHERE id=?1");
//        query.setParameter(1,1);

        users.setName("yee");
        userRepository.save(users);
    }



}
