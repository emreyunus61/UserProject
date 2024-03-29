package com.yunusozturk.userproject.controller;

import com.yunusozturk.userproject.dto.UserDto;
import com.yunusozturk.userproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<Boolean> saveUser(@RequestBody UserDto userDto){

        Boolean response = null;

        response = userService.saveUser(userDto);

        return  ResponseEntity.ok(response);

    }


}
