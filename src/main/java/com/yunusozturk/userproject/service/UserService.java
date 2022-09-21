package com.yunusozturk.userproject.service;

import com.yunusozturk.userproject.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Boolean saveUser(UserDto userDto);




}
