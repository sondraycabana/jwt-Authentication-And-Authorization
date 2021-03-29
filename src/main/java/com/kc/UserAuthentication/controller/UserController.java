package com.kc.UserAuthentication.controller;


import com.kc.UserAuthentication.data.model.AppUser;
import com.kc.UserAuthentication.data.repository.AppUserRepository;
import com.kc.UserAuthentication.service.userService.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/appuser")
@RestController
public class UserController {

   @Autowired
   UserServiceImpl userService;


   @Autowired
    AppUserRepository appUserRepository;

    @PostMapping("/create")
    public AppUser save(@RequestBody AppUser user){
        return userService.saveUser(user);
    }

    @GetMapping("/home")
    public String index(){
        return "hello";
    }
}
