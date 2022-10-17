package com.yunusozturk.userproject.service.Impl;

import com.yunusozturk.userproject.dto.UserDto;
import com.yunusozturk.userproject.repository.UserRepository;
import com.yunusozturk.userproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean saveUser(UserDto userDto) {

        //Qeue basılacak
        //
         userRepository.save(userDto);

         return  true;
    }
}
