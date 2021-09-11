package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "usuario/{id}")
    public User getUser(@PathVariable long id){
        User user = new User();
        user.setId(id);
        user.setNombre("Jorge");
        user.setApellido("Callisaya");
        user.setEmail("sanchezenrique580@gmail.com");
        user.setTelefono("77599901");

        // Devuelve los datos en formato JSON
        return user;
    }

    @RequestMapping(value = "usuarios")
    public List<User> getUsers(){
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setId(1L);
        user.setNombre("Jorge");
        user.setApellido("Callisaya");
        user.setEmail("sanchezenrique580@gmail.com");
        user.setTelefono("77599901");
        
        User user2 = new User();
        user2.setId(2L);
        user2.setNombre("user2");
        user2.setApellido("Callisaya");
        user2.setEmail("sanchezenrique580@gmail.com");
        user2.setTelefono("77599901");
        
        User user3 = new User();
        user3.setId(3L);
        user3.setNombre("user3");
        user3.setApellido("Callisaya");
        user3.setEmail("sanchezenrique580@gmail.com");
        user3.setTelefono("77599901");
        
        User user4 = new User();
        user4.setId(4L);
        user4.setNombre("user4");
        user4.setApellido("Callisaya");
        user4.setEmail("sanchezenrique580@gmail.com");
        user4.setTelefono("77599901");

        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }
}
