/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.mailservice.clientapp.controller;

import co.id.mailservice.clientapp.model.User;
import co.id.mailservice.clientapp.model.dto.UserData;
import co.id.mailservice.clientapp.service.UserService;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Deanchristt
 */
@Controller
//Mewakili objek dari endpoint yang dikunjungi
public class UserController {
    
    //Dalam kasus ini hanya perlu /register
    
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(UserData userData) {
        return "SignUpPage";
    }

    @PostMapping( "/register")
    public String create(@Valid UserData userData, BindingResult result) {
        if (result.hasErrors()) {
            return "SignUpPage";
        }
        userService.create(userData);
        return "redirect:/home";
    }
}
