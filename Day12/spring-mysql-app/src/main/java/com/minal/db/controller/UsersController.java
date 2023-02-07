package com.minal.db.controller;

import com.minal.db.model.Users;
import com.minal.db.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Users> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Users users) {
        usersRepository.save(users);
        return "saved";
    }

    @DeleteMapping(value = "/delete")
    public @ResponseBody
    String store(@RequestParam("id") final int id) {
        usersRepository.deleteById(id);
        return "deleted";
    }
}
